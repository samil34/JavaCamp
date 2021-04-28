/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomework2;

/**
 *
 * @author samil
 */
public class Course {

    int couseId;
    String courseName;
    String teacherName;
    int courseCompleted;

    

    public Course(int courseId,String courseName, String teacherName, int courseCompleted) {
        this.couseId = courseId;
        this.courseName = courseName;
        this.teacherName = teacherName;
        this.courseCompleted = courseCompleted;

    }

}
