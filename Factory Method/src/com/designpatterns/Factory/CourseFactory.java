package src.com.designpatterns.Factory;

import src.com.designpatterns.Course.Course;
import src.com.designpatterns.Course.HLD;
import src.com.designpatterns.Course.LLD;

public class CourseFactory {

    public static Course createCourse(String name) {

        if ("LLD".equals(name)) {
           return new LLD();
        }
        if ("HLD".equals(name)) {
            return new HLD();
        }
        return null;
    }

}
