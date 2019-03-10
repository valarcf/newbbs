package com.bbs.entity;

import javax.persistence.*;

/**
 * Created by valar on 2019/1/5.
 */
@Entity
@Table(name = "user")
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long userid;
    private String username;
    private String userpw;
    private String useremail;
    private String useraddress;
    private int userphone;
    private int userage;
    private String usersex;
    private String usertitle;
    private String userlink;
    private int userSee;

    public int getUserSee() {
        return userSee;
    }

    public void setUserSee(int userSee) {
        this.userSee = userSee;
    }

    public long getUserid() {
        return userid;
    }

    public void setUserid(long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getUseraddress() {
        return useraddress;
    }

    public void setUseraddress(String useraddress) {
        this.useraddress = useraddress;
    }

    public int getUserphone() {
        return userphone;
    }

    public void setUserphone(int userphone) {
        this.userphone = userphone;
    }

    public int getUserage() {
        return userage;
    }

    public void setUserage(int userage) {
        this.userage = userage;
    }

    public String getUsersex() {
        return usersex;
    }

    public void setUsersex(String usersex) {
        this.usersex = usersex;
    }

    public String getUsertitle() {
        return usertitle;
    }

    public void setUsertitle(String usertitle) {
        this.usertitle = usertitle;
    }

    public String getUserlink() {
        return userlink;
    }

    public void setUserlink(String userlink) {
        this.userlink = userlink;
    }
}
