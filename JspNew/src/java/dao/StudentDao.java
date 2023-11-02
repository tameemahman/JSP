/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Student;
import util.DbCon;

/**
 *
 * @author user
 */
public class StudentDao {
     public static int saveStudent(Student s) throws ClassNotFoundException, SQLException{
        int status=0;
        
        String  sql="insert into student(givenName, lastName, gender, subject) "
                + "values(?,?,?,?)";
        PreparedStatement ps=DbCon.getCon().prepareStatement(sql);
        
        ps.setString(1, s.getGivenName());
        ps.setString(2, s.getLastName());
        ps.setString(3, s.getGender());
        ps.setString(4, s.getSubject());
        
        status=ps.executeUpdate();
        System.out.println(status);
        
        return status;
    }  
    
    
    public static List<Student> getAllStudent() throws ClassNotFoundException, SQLException{
        
        List<Student> studentList=new ArrayList<Student>();
    
        String sql="select * from student";
        
        PreparedStatement ps=DbCon.getCon().prepareStatement(sql);
        
        ResultSet rs=ps.executeQuery();
        
        while(rs.next()){
            Student s=new Student(
                    rs.getInt("id"), 
                    rs.getString("givenName"), 
                    rs.getString("lastName"), 
                    rs.getString("subject"), 
                    rs.getString("gender")
            );
            studentList.add(s);
            
        }
        return studentList; 
    
        
    }
}
