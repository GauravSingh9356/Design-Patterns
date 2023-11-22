package src.com.designpatterns.Course;

import src.com.designpatterns.Modules.Modules;

import java.util.ArrayList;
import java.util.List;

public class HLD implements Course{
    private List<Modules> modules = new ArrayList<>();
    public HLD(){
        this.createCourse();
    }
    @Override
    public void createCourse() {
        for (int i=0; i<10; i++) {
            modules.add(new Modules("HLD "+(i+1), (long) (i+1)));
        }
    }

    @Override
    public List<Modules> getModules() {
        return this.modules;
    }
}
