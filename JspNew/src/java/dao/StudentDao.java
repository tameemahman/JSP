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

    public static int saveStudent(Student s) throws ClassNotFoundException, SQLException {
        int status = 0;

        String sql = "insert into student(givenName, lastName, gender, subject) "
                + "values(?,?,?,?)";
        PreparedStatement ps = DbCon.getCon().prepareStatement(sql);

        ps.setString(1, s.getGivenName());
        ps.setString(2, s.getLastName());
        ps.setString(3, s.getGender());
        ps.setString(4, s.getSubject());

        status = ps.executeUpdate();
        System.out.println(status);

        ps.close();
        DbCon.getCon().close();

        return status;
    }

    public static List<Student> getAllStudent() throws ClassNotFoundException, SQLException {

        List<Student> studentList = new ArrayList<Student>();

        String sql = "select * from student";

        PreparedStatement ps = DbCon.getCon().prepareStatement(sql);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            Student s = new Student(
                    rs.getInt("id"),
                    rs.getString("givenName"),
                    rs.getString("lastName"),
                    rs.getString("subject"),
                    rs.getString("gender")
            );
            studentList.add(s);

        }
        rs.close();
        ps.close();
        DbCon.getCon().close();
        return studentList;

    }

    public static Student getStudentbyId(int id) throws ClassNotFoundException, SQLException {

        Student s = new Student();

        String sql = "select * from student where id=?";

        PreparedStatement ps = DbCon.getCon().prepareStatement(sql);

        ps.setInt(1, id);
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            s.setId(rs.getInt("id"));
            s.setGivenName(rs.getString("givenName"));
            s.setLastName(rs.getString("lastName"));
            s.setSubject(rs.getString("subject"));
            s.setGender(rs.getString("gender"));

        }
        
        rs.close();
        ps.close();
        DbCon.getCon().close();
        
        
        return s;
    }
      public static int deleteStudent(Student s) throws ClassNotFoundException, SQLException {

        int status = 0;
        String sql = "delete from student where id=?";
        PreparedStatement ps = DbCon.getCon().prepareStatement(sql);
        ps.setInt(1, s.getId());

        status = ps.executeUpdate();

        ps.close();
        DbCon.getCon().close();
        return status;

    }
    
       public static int editStudent(Student s) throws ClassNotFoundException, SQLException {

        int status = 0;
        String sql = "update student set givenName=?, lastName=?, gender=?, subject=? where id=?";
        PreparedStatement ps = DbCon.getCon().prepareStatement(sql);

        ps.setString(1, s.getGivenName());
        ps.setString(2, s.getLastName());
        ps.setString(3, s.getGender());
        ps.setString(4, s.getSubject());
        ps.setInt(5, s.getId());

        status = ps.executeUpdate();

        ps.close();
        DbCon.getCon().close();

        return status;

    }
    
}



