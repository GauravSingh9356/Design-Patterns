package src.com.designpatterns;

import src.com.designpatterns.Course.Course;
import src.com.designpatterns.Factory.CourseFactory;

public class Main {
    public static void main(String[] args) {

        Course LLD = CourseFactory.createCourse("LLD");
        Course HLD = CourseFactory.createCourse("HLD");

        assert LLD != null;
        LLD.getModules().forEach(module -> {
            System.out.println("LLD Course Name: " + module.getName());
            System.out.println("LLD Course Length: " + module.getLength());
        });
        assert HLD != null;
        HLD.getModules().forEach(module -> {
            System.out.println("HLD Course Name: " + module.getName());
            System.out.println("HLD Course Length: " + module.getLength());
        });
    }
}
