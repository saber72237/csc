package com.yygq.csc.bean;

public class ClassDao {
    private int classId;
    private String className;
    private int classMoney;
    private String classIntroduce;
    private String exerciseMachine;
    private int hostId;
    private SessionDao sessionDao;

    public SessionDao getSessionDao() {
        return sessionDao;
    }

    public void setSessionDao(SessionDao sessionDao) {
        this.sessionDao = sessionDao;
    }

    public int getClassId() {
        return classId;
    }

    public void setClassId(int classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getClassMoney() {
        return classMoney;
    }

    public void setClassMoney(int classMoney) {
        this.classMoney = classMoney;
    }

    public String getClassIntroduce() {
        return classIntroduce;
    }

    public void setClassIntroduce(String classIntroduce) {
        this.classIntroduce = classIntroduce;
    }

    public String getExerciseMachine() {
        return exerciseMachine;
    }

    public void setExerciseMachine(String exerciseMachine) {
        this.exerciseMachine = exerciseMachine;
    }

    public int getHostId() {
        return hostId;
    }

    public void setHostId(int hostId) {
        this.hostId = hostId;
    }

    @Override
    public String toString() {
        return "ClassDao{" +
                "classId=" + classId +
                ", className='" + className + '\'' +
                ", classMoney=" + classMoney +
                ", classIntroduce='" + classIntroduce + '\'' +
                ", exerciseMachine='" + exerciseMachine + '\'' +
                ", hostId=" + hostId +
                ", sessionDao=" + sessionDao +
                '}';
    }
}
