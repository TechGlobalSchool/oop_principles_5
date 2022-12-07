package oop_principles.abstraction;


public interface Camera {

    String cameraQuality = "48MP";

    void takesPhoto();
    void recordVideo();

    default void method1(){
        System.out.println("This is a default method");
    }

    static void method2(){
        System.out.println("This is a static method");
    }
}
