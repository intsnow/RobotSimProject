package main;

class Robot
{
  private Boolean firstTime = true;
  private String message;
  private  String actionBot;
  private final Arms arms;
  private final Eyes eyes;

  public enum Action
  {
    RAISE_LEFT,
    RAISE_RIGHT,
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


  Robot()
  {
    eyes = new Eyes();
    arms = new Arms();

    System.out.println("\n\n\tStarting robot");
    System.out.println("\n\t\tHey! Here's a list of everything I can do:\n");

    for (Object action : Action.values())
    {
      System.out.println("\t\t\t--> " + action);
    }

    display();
  }

  private String getactionBot(){
    return actionBot;
  }
  private  String getawakenBot(){
    return awakenBot.replace("#"," ");
  }

  private void setMessage(String text){
    message = text;
  }
  private String getMessage(){
    return message;
  }


  public void performAction(Action action) {
    switch (action) {
      case RAISE_LEFT -> raiseArms(true, false);
      case RAISE_RIGHT -> raiseArms(false, true);
      case BLINK_LEFT -> blink(true, false);
      case BLINK_RIGHT -> blink(false, true);
      case BLINK_BOTH -> blink(true, true);
    }
  }

  private void blink(boolean left, boolean right)
  {
    actionBot = eyes.isOn(left, right);
    message = eyes.getMessage();
    display();
  }

  private void raiseArms(boolean left, boolean right)
  {
    actionBot = arms.isRaisingUp(left, right);
    message = arms.getMessage();
    display();
  }


  private void display()
  {
    if (firstTime)
    {
      System.out.println(getawakenBot());
      firstTime = false;
    }
    else
    {
      if (!actionBot.equals(awakenBot))
      {
        if (getMessage() != null)
        {
          System.out.println(getMessage());
        }
        System.out.println(getactionBot());
        System.out.println(getawakenBot());
      }
    }
  }
}