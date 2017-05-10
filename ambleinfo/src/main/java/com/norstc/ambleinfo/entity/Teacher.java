/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.ambleinfo.entity;

/**
 *
 * @author zhangjh
 */
public class Teacher {
    private Integer teacherId;
    private String teacherCode;
    private String teacherName;
    private Float teacherPrice;
    private String teacherIcon;
    
    public Teacher() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public Teacher(Integer teacherId, String teacherCode, String teacherName, Float teacherPrice, String teacherIcon) {
        this.teacherId = teacherId;
        this.teacherCode = teacherCode;
        this.teacherName = teacherName;
        this.teacherPrice = teacherPrice;
        this.teacherIcon = teacherIcon;
    }

    
    
    public Integer getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(Integer teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherCode() {
        return teacherCode;
    }

    public void setTeacherCode(String teacherCode) {
        this.teacherCode = teacherCode;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Float getTeacherPrice() {
        return teacherPrice;
    }

    public void setTeacherPrice(Float teacherPrice) {
        this.teacherPrice = teacherPrice;
    }

    public String getTeacherIcon() {
        return teacherIcon;
    }

    public void setTeacherIcon(String teacherIcon) {
        this.teacherIcon = teacherIcon;
    }
    
    
}
