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
public class UserManager {
    
    public void add(User user) {
        System.out.println( user.getFirstName() + " kaydedildi");
    }
    
    public void addUser(User[] users) {
        for(User user: users) {
            add(user);
        }
    }
    
    public void createCourse(Instructor instructor, Course course){
        
        System.out.println(instructor.getFirstName() + " eğitmen " + course.getCourseName() + " kursu oluşturdu");
    }
    
    public void takeCourse(Student student,Course course){
        System.out.println(student.getFirstName() + " " + course.getCourseName() + " eğitimi aldı");
    }
}
