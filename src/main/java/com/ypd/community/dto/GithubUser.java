package com.ypd.community.dto;

import lombok.*;

/**
 * ClassName:GithubUser
 * Package:com.ypd.community.dto
 * Description:TODO
 *
 * @Date:2020/2/10 0010 下午 8:34
 * @author:ypd
 */

public class GithubUser {
    private String name;
    private Long id;
    private String bio;

    public GithubUser() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "GithubUser{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", bio='" + bio + '\'' +
                '}';
    }
}
