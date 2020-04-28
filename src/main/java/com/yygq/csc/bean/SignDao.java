package com.yygq.csc.bean;

import java.sql.Date;

public class SignDao {
    private int id;
    private int continueSign;
    private Date newTime;
    private String signAdress;
    private int hostId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getContinueSign() {
        return continueSign;
    }

    public void setContinueSign(int continueSign) {
        this.continueSign = continueSign;
    }

    public Date getNewTime() {
        return newTime;
    }

    public void setNewTime(Date newTime) {
        this.newTime = newTime;
    }

    public String getSignAdress() {
        return signAdress;
    }

    public void setSignAdress(String signAdress) {
        this.signAdress = signAdress;
    }

    public int getHostId() {
        return hostId;
    }

    public void setHostId(int hostId) {
        this.hostId = hostId;
    }

    @Override
    public String toString() {
        return "SignDao{" +
                "id=" + id +
                ", continueSign=" + continueSign +
                ", newTime=" + newTime +
                ", signAdress='" + signAdress + '\'' +
                ", hostId=" + hostId +
                '}';
    }
}
