/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javahomework3;

/**
 *
 * @author samil
 */
public class JavaHomework3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
               
       Student student = new Student();
       student.setId(1);
       student.setFirstName("Şamil");
       
       
       Instructor instructor = new Instructor();
       instructor.setId(1);
       instructor.setFirstName("Engin");
       
       Course course = new Course();
       course.setId(1);
       course.setCourseName("Java");
       
       
       UserManager userManager = new UserManager();
       userManager.createCourse(instructor, course);
       userManager.takeCourse(student, course);
       
       
       User[] users = {student, instructor};
       
       userManager.addUser(users);

    }
    
}
