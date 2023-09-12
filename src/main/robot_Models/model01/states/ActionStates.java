package main.robot_Models.model01.states;

public class ActionStates
{
    private boolean isBlinking;
    private boolean isRaising;
    private boolean left_Acting, right_Acting;

    ActionStates(boolean left, boolean right){
        left_Acting = left;
        right_Acting = right;
        setBlinking();
    }

    private void setBlinking(){
        isBlinking = true;

    }
    public boolean getBlinking(){
        return isBlinking;
    }


    /*
    public void setRaising_left(){
        isRaising_left = true;
    }
    public boolean getRaising_left(){
        return isRaising_left;
    }
    public void setRaising_right(){
        isRaising_right = true;
    }
    public boolean getRaising_right(){
        return isRaising_right;
    }
    */
}
