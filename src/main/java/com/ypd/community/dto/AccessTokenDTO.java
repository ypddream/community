package com.ypd.community.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.ToString;

import java.io.Serializable;

/**
 * ClassName:AccessTokenDTO
 * Package:com.ypd.community.dto
 * Description:TODO
 *
 * @Date:2020/2/10 0010 下午 7:38
 * @author:ypd
 */
@ToString
public class AccessTokenDTO implements Serializable {
    @JSONField(name = "client_id")
    private String client_id;
    @JSONField(name = "client_secret")
    private String client_secret;
    private String code;
    @JSONField(name = "redirect_uri")
    private String redirect_uri;
    private String state;

    public AccessTokenDTO() {
    }

    public String getClient_id() {
        return client_id;
    }

    public void setClient_id(String client_id) {
        this.client_id = client_id;
    }

    public String getClient_secret() {
        return client_secret;
    }

    public void setClient_secret(String client_secret) {
        this.client_secret = client_secret;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getRedirect_uri() {
        return redirect_uri;
    }

    public void setRedirect_uri(String redirect_uri) {
        this.redirect_uri = redirect_uri;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
