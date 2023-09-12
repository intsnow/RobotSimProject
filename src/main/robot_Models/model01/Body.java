package main.robot_Models.model01;

import main.robot_Models.model01.components.Arms;
import main.robot_Models.model01.components.Eyes;

public class Body
{
    private Arms arms;
    private Eyes eyes;

    public Body(){

    }

    private void startArms(){
        arms = new Arms(true);
    }
    public Arms getArms(){
        return arms;
    }

    private void startEyes(){
        eyes = new Eyes(true);
    }
    public Eyes getEyes(){
        return eyes;
    }

    public void startBody()
    {
        startArms();
        startEyes();
    }



}