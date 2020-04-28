package com.yygq.csc.bean;

public class ActiveDao {
    private int activityId;
    private String activityIntroduce;
    private int hostId;
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public int getActivityId() {
        return activityId;
    }

    public void setActivityId(int activityId) {
        this.activityId = activityId;
    }

    public String getActivityIntroduce() {
        return activityIntroduce;
    }

    public void setActivityIntroduce(String activityIntroduce) {
        this.activityIntroduce = activityIntroduce;
    }

    public int getHostId() {
        return hostId;
    }

    public void setHostId(int hostId) {
        this.hostId = hostId;
    }

    @Override
    public String toString() {
        return "ActiveDao{" +
                "activityId=" + activityId +
                ", activityIntroduce='" + activityIntroduce + '\'' +
                ", hostId=" + hostId +
                ", userDao=" + userDao +
                '}';
    }
}
