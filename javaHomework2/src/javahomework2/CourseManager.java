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
public class CourseManager {
    
    public void addCourse(Course course){
        System.out.println(course.courseName + " Kursu eklendi");
    }
    
    public void deleteCourse(Course course) {
        System.out.println(course.courseName + " Kurs silindi");
    }
    
    public void completedCourse(Course course){
        System.out.println("Kurs % "+ course.courseCompleted + " tamamlandı" );
    }
    
}
