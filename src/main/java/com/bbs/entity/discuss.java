package com.bbs.entity;


import javax.persistence.*;
import java.sql.Date;

/**
 * Created by valar on 2019/1/5.
 */
@Entity
public class discuss {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int disId;
    private String disName;
    @Column(columnDefinition = "text")
    private String disText;
    private int userId;
    @Column(columnDefinition = "varchar(64)")
    private String disTime;
    private int disSee;
    private long disYes;
    private long disNo;

    public int getDisId() {
        return disId;
    }

    public void setDisId(int disId) {
        this.disId = disId;
    }

    public String getDisName() {
        return disName;
    }

    public void setDisName(String disName) {
        this.disName = disName;
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDisText() {
        return disText;
    }

    public void setDisText(String disText) {
        this.disText = disText;
    }

    public String getDisTime() {
        return disTime;
    }

    public void setDisTime(String disTime) {
        this.disTime = disTime;
    }

    public int getDisSee() {
        return disSee;
    }

    public void setDisSee(int disSee) {
        this.disSee = disSee;
    }

    public long getDisYes() {
        return disYes;
    }

    public void setDisYes(long disYes) {
        this.disYes = disYes;
    }

    public long getDisNo() {
        return disNo;
    }

    public void setDisNo(long disNo) {
        this.disNo = disNo;
    }
}
