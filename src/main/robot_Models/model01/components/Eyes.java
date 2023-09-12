package main.robot_Models.model01.components;
import main.robot_Models.model01.interfaces.BodyControlPanel;

import static main.robot_Models.model01.Robot.Action.*;

public class Eyes implements BodyControlPanel
{
  private boolean isOn;
  private String message;
  private String bot;


  public Eyes(boolean state){
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
    if (action == BLINK_BOTH)
    {
      setMessage("\n\n\t ... Blink both eyes! (-.-)\n");
    }
    else
    {
      setMessage("\n\n\t ... Blink !! ;)\n");
    }
  }

  public void start(Object action)
  {
    String s = "";

    if (action == BLINK_LEFT) {
      s = """
                      _       \s
                  ___|_|___   \s
                 |#########|  \s
                 |######00#|  \s
                @|#__###00#|@ \s
               @ |#########| @\s
               @ |###---###| @\s
               @ |_________| @\s
                   @@   @@    \s
                   @@   @@    \s

              """;
    } else if (action == BLINK_RIGHT) {//ActionStates.setBlinking();
      s = """
                      _       \s
                  ___|_|___   \s
                 |#########|  \s
                 |#00######|  \s
                @|#00###__#|@ \s
               @ |#########| @\s
               @ |###---###| @\s
               @ |_________| @\s
                   @@   @@    \s
                   @@   @@    \s

              """;
    } else if (action == BLINK_BOTH) {
      s = """
                      _       \s
                  ___|_|___   \s
                 |#########|  \s
                 |#########|  \s
                @|#__###__#|@ \s
               @ |#########| @\s
               @ |###-o-###| @\s
               @ |_________| @\s
                   @@   @@    \s
                   @@   @@    \s

              """;
    }

    verifyMessage(action);
    setBot(s.replace("#"," "));
  }
}