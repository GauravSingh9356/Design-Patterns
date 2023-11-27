package singletonpattern.designpatterns;



public class Singleton {

    //THREAD SAFE LAZY LOADING SINGLETON EXAMPLE

    private static Singleton instance  = null;
    private Singleton(){

    }
    public static synchronized Singleton getInstance(){
        if (instance == null) {
            instance =  new Singleton();
        }
        return instance;
    }


    //THREAD SAFE EAGER LOADING SINGLETON EXAMPLE

//    private static Singleton instance  = new Singleton();
//    private Singleton(){
//
//    }
//    public static synchronized Singleton getInstance(){
//        return instance;
//    }
}
