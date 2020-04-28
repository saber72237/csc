package com.yygq.csc.bean;

import java.sql.Date;

public class SessionDao {
    private int Id;
    private String purchaseId;
    private Date purchaseTime;
    private int purchaseFlag;
    private int classId;
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getPurchaseId() {
        return purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    public Date getPurchaseTime() {
        return purchaseTime;
    }

    public void setPurchaseTime(Date purchaseTime) {
        this.purchaseTime = purchaseTime;
    }

    public int getPurchaseFlag() {
        return purchaseFlag;
    }

    public void setPurchaseFlag(int purchaseFlag) {
        this.purchaseFlag = purchaseFlag;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "SessionDao{" +
                "Id=" + Id +
                ", purchaseId='" + purchaseId + '\'' +
                ", purchaseTime=" + purchaseTime +
                ", purchaseFlag=" + purchaseFlag +
                ", classId=" + classId +
                ", userDao=" + userDao +
                '}';
    }
}
