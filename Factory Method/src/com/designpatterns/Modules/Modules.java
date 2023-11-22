package src.com.designpatterns.Modules;

public class Modules {

    private String name;
    private Long length;

    public String getName() {
        return name;
    }
    public Long getLength() {
        return this.length;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(Long length) {
        this.length = length;
    }



    public Modules(String name, Long length) {
        this.name = name;
        this.length = length;
    }


}
