package main.robot_Models.model01;

import main.robot_Models.model01.components.*;

public class Robot
{
  private Boolean firstTime = true;
  private String message;
  private  String actionBot;
  private final Body body;

  public enum Action
  {
    RAISE_LEFT,
    RAISE_RIGHT,
    RAISE_BOTH,
    BLINK_LEFT,
    BLINK_RIGHT,
    BLINK_BOTH
  }
  private static final String awakenBot = """
                    _       \s
                ___|_|___   \s
               |#########|  \s
               |#00###00#|  \s
              @|#00###00#|@ \s
             @ |#########| @\s
             @ |###-o-###| @\s
             @ |_________| @\s
                 @@   @@    \s
                 @@   @@    \s

            """;


  public Robot()
  {
    /*
    eyes = new Eyes();
    arms = new Arms();
    */
    body = new Body();
    body.startBody();

    System.out.println("\n\n\tStarting robot");
    System.out.println("\n\t\tHey! Here's a list of everything I can do:\n");

    for (Object action : Action.values())
    {
      System.out.println("\t\t\t--> " + action);
    }

    System.out.println();
    display();
  }


  private void displayActionBot(){
    System.out.println(actionBot);
  }


  private void displayAwakenBot(){
    System.out.println(awakenBot.replace("#"," "));
  }


  private String getMessage(){
    return message;
  }
  private void displayMessage(){
    System.out.println(message);
  }


  public void performAction(Action action)
  {
    switch (action)
    {
      case RAISE_LEFT, RAISE_RIGHT, RAISE_BOTH-> raiseArms(action);

      case BLINK_LEFT, BLINK_RIGHT, BLINK_BOTH -> blink(action);

    }
  }


  private void blink(Action action)
  {
    Eyes eyes = body.getEyes();
    eyes.start(action);
    actionBot = eyes.getState();
    message = eyes.getMessage();
    display();
  }


  private void raiseArms(Action action)
  {
    Arms arms = body.getArms();
    arms.start(action);
    actionBot = arms.getState();
    message = arms.getMessage();
    display();
  }


  private void display()
  {
    if (firstTime)
    {
      displayAwakenBot();
      firstTime = false;
    }
    else
    {
      displayMessage();
      displayActionBot();
      displayAwakenBot();
    }
  }

}