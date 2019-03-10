package com.bbs.entity;


import javax.persistence.*;
import java.sql.Date;

/**
 * Created by valar on 2019/1/5.
 */
@Entity
public class title {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int titId;
    private int userId;
    @Column( columnDefinition = "text")
    private String titText;
    @Column(columnDefinition = "varchar(64)")
    private String titTime;
    private String titName;
    private String titStyle;
    private int titSee;

    public int getTitId() {
        return titId;
    }

    public void setTitId(int titId) {
        this.titId = titId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getTitText() {
        return titText;
    }

    public void setTitText(String titText) {
        this.titText = titText;
    }

    public String getTitTime() {
        return titTime;
    }

    public void setTitTime(String titTime) {
        this.titTime = titTime;
    }

    public String getTitName() {
        return titName;
    }

    public void setTitName(String titName) {
        this.titName = titName;
    }

    public String getTitStyle() {
        return titStyle;
    }

    public void setTitStyle(String titStyle) {
        this.titStyle = titStyle;
    }

    public int getTitSee() {
        return titSee;
    }

    public void setTitSee(int titSee) {
        this.titSee = titSee;
    }
}
