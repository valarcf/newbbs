package com.bbs.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by valar on 2019/1/5.
 */
@Entity
public class reply {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int disId;
    @Column(columnDefinition = "varchar(64)")
    private String replyTime;
    @Column(columnDefinition = "text")
    private String replyText;
    private int userId;

    public int getDisId() {
        return disId;
    }

    public void setDisId(int disId) {
        this.disId = disId;
    }

    public String getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(String replyTime) {
        this.replyTime = replyTime;
    }

    public String getReplyText() {
        return replyText;
    }

    public void setReplyText(String replyText) {
        this.replyText = replyText;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
