package com.yygq.csc.bean;

import java.sql.Date;

public class UserDao {
    private int id;
    private String childrenName;
    private String userName;
    private int childrenAge;
    private int childrenGender;
    private int childrenTel;
    private String childrenAdress;
    private int childrenWeight;
    private int childrenHeight;
    private Date registrationTime;
    private int delFlag;
    private String updateBy;
    private String userPassword;
    private int hostId;
    private SignDao signDao;

    public SignDao getSignDao() {
        return signDao;
    }

    public void setSignDao(SignDao signDao) {
        this.signDao = signDao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChildrenName() {
        return childrenName;
    }

    public void setChildrenName(String childrenName) {
        this.childrenName = childrenName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getChildrenAge() {
        return childrenAge;
    }

    public void setChildrenAge(int childrenAge) {
        this.childrenAge = childrenAge;
    }

    public int getChildrenGender() {
        return childrenGender;
    }

    public void setChildrenGender(int childrenGender) {
        this.childrenGender = childrenGender;
    }

    public int getChildrenTel() {
        return childrenTel;
    }

    public void setChildrenTel(int childrenTel) {
        this.childrenTel = childrenTel;
    }

    public String getChildrenAdress() {
        return childrenAdress;
    }

    public void setChildrenAdress(String childrenAdress) {
        this.childrenAdress = childrenAdress;
    }

    public int getChildrenWeight() {
        return childrenWeight;
    }

    public void setChildrenWeight(int childrenWeight) {
        this.childrenWeight = childrenWeight;
    }

    public int getChildrenHeight() {
        return childrenHeight;
    }

    public void setChildrenHeight(int childrenHeight) {
        this.childrenHeight = childrenHeight;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public int getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(int delFlag) {
        this.delFlag = delFlag;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getHostId() {
        return hostId;
    }

    public void setHostId(int hostId) {
        this.hostId = hostId;
    }
}
