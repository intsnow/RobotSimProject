package main.robot_Models.model01.interfaces;

public interface BodyControlPanel
{

    default void setMessage(String text){}
    default String getMessage(){
        return null;
    }

    default String getState(){
        return null;
    }

    default void verifyMessage(Object action){}

    default void start(Object action){}
}
