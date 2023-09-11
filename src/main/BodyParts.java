package main;

public interface BodyParts
{

    default void setMessage(String text){}
    default String getMessage(){
        return null;
    }

    default String getState(){
        return null;
    }

    default void verifyMessage(boolean left, boolean right){}

    default void start(boolean left, boolean right){}
}
