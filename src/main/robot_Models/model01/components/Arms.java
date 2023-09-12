package main.robot_Models.model01.components;
import main.robot_Models.model01.interfaces.BodyControlPanel;

import static main.robot_Models.model01.Robot.Action.*;

public class Arms implements BodyControlPanel
{
  private boolean isOn;
  private String message;
  private String bot;

  public Arms(boolean state){
    isOn = state;
  }

  public void setBot(String draw){
    bot = draw;
  }
  public String getState(){
    return bot;
  }

  public void setMessage(String text){
    message = text;
  }
  public String getMessage(){
    return message;
  }



  public void verifyMessage(Object action)
  {
    if (action == RAISE_BOTH)
    {
      setMessage("\n\n\t ... Raise ur hands!! \\o/\n");
    }
    else
    {
      setMessage("\n\n\t ... Raise ur hand!! \n");
    }
  }


  public void start(Object action) {

    String s = "";

    if (action == RAISE_LEFT)
    {
      s = """
                         _       \s
                 @   ___|_|___   \s
                 @  |#########|  \s
                  @ |#00###00#|  \s
                   @|#00###00#|@ \s
                    |#########| @\s
                    |###-o-###| @\s
                    |_________| @\s
                      @@   @@    \s
                      @@   @@    \s

                """;
    } else if (action == RAISE_RIGHT)
    {
      s = """
                        _       \s
                    ___|_|___   @\s
                   |#########|  @\s
                   |#00###00#| @\s
                  @|#00###00#|@ \s
                 @ |#########|  \s
                 @ |###-o-###|  \s
                 @ |_________|  \s
                     @@   @@    \s
                     @@   @@    \s

                """;
    } else if (action == RAISE_BOTH)
    {
      s = """
                         _        \s
                 @   ___|_|___   @\s
                 @  |#########|  @\s
                  @ |#00###00#| @ \s
                   @|#00###00#|@  \s
                    |#########|   \s
                    |###-o-###|   \s
                    |_________|   \s
                      @@   @@     \s
                      @@   @@     \s

                """;
    }

    verifyMessage(action);
    setBot(s.replace("#"," "));

  }
}