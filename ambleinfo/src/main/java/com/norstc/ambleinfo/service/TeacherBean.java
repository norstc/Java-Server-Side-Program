/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.norstc.ambleinfo.service;

import com.norstc.ambleinfo.entity.Teacher;
import com.norstc.ambleinfo.util.DataConnect;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zhangjh
 */
@Named(value = "teacherBean")
@SessionScoped
public class TeacherBean implements Serializable {

    private List<Teacher> teachers;

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }
    
    
    /**
     * Creates a new instance of TeacherBean
     */
    public TeacherBean() {
        teachers = new ArrayList<Teacher>();
        Connection connect = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            connect = DataConnect.getConnection();
            pstmt = (PreparedStatement) connect.prepareStatement("select * from ai_tb_teachers");
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Teacher teacher = new Teacher();
                teacher.setTeacherId(rs.getInt("teacher_id"));
                teacher.setTeacherName(rs.getString("teacher_name"));
                teacher.setTeacherCode(rs.getString("teacher_code"));
                teacher.setTeacherPrice(rs.getFloat("teacher_price"));
                teacher.setTeacherIcon(rs.getString("teacher_icon"));
                teachers.add(teacher);
            }
        } catch (SQLException ex) {
            System.out.println("in exception teacher");
            System.out.println(ex.getMessage());
        } finally {
            DataConnect.close(connect);
        }
    }
    
}
