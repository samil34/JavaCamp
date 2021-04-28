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
public class JavaHomework2 {

    
    public static void main(String[] args) {
       
        Course course1 = new Course(1,"C#","Engin Demirog",0);
        Course course2 = new Course(2,"Java","Engin Demirog",0);
        Course course3 = new Course(3,"Temel Yazılım","Engin Demirog",15);
        
        Course[] courses = {course1,course2,course3};
        
        
        for(Course course: courses){
            System.out.println("Tüm kurs isimleri:  " + course.courseName);
                    
        }
        
        
        Category category1 = new Category(1, "Kurslarım");
        Category category2 = new Category(2, "Tüm Kurslar");
        
        Category[] categories = {category1,category2};
        
        for(Category category: categories){
            System.out.println("Tüm kurs isimleri:  " + category.name);
                    
        }
        
        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
        courseManager.addCourse(course3);
        
        courseManager.deleteCourse(course2);
        
        courseManager.completedCourse(course3);
        
        
        
    }
    
}
