package com.ypd.community.provider;

import com.alibaba.fastjson.JSON;
import com.ypd.community.dto.AccessTokenDTO;
import com.ypd.community.dto.GithubUser;
import okhttp3.*;
import org.springframework.stereotype.Component;


/**
 * ClassName:GithubProvider
 * Package:com.ypd.community.provider
 * Description:TODO
 *
 * @Date:2020/2/10 0010 下午 7:35
 * @author:ypd
 */
@Component
public class GithubProvider {

    /**
     * 获取token
     * @param accessTokenDTO
     * @return
     */
    public String getAccessToken(AccessTokenDTO accessTokenDTO) {
        MediaType mediaType = MediaType.get("application/json; charset=utf-8");
        OkHttpClient client = new OkHttpClient();
        RequestBody body = RequestBody.create(mediaType, JSON.toJSONString(accessTokenDTO));
        Request request = new Request.Builder()
                .url("https://github.com/login/oauth/access_token")
                .post(body)
                .build();
        Response response = null;
        try {
            response = client.newCall(request).execute();
            String string = response.body().string();
            System.out.println(string);
            String token = string.split("&")[0].split("=")[1];
            System.err.println(token);
            return token;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public GithubUser getUser(String accessToken) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.github.com/user?access_token=" + accessToken)
                .build();
        try {
            Response response = client.newCall(request).execute();
            String str = response.body().string();
            GithubUser githubUser = JSON.parseObject(str, GithubUser.class);
            return githubUser;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
