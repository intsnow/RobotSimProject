package main;

class Eyes implements BodyParts
{
  private String message;
  private String bot;


  protected Eyes(){}

  public void setMessage(String text){
    message = text;
  }
  public String getMessage(){
    return message;
  }

  public String getState(){
    return bot;
  }

  public void verifyMessage(boolean left, boolean right)
  {
    if (left && right)
    {
      setMessage("\n\n\t ... Blink both eyes! (-.-)\n");
    }
    else
    {
      setMessage("\n\n\t ... Blink !! ;)\n");
    }
  }

  public void start(boolean left, boolean right)
  {
    String s;

    if (left)
    {
      if (!right)
      {
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
      }
      else
      {
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
    }
    else
    {
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
    }

    bot = s.replace("#"," ");
    verifyMessage(left, right);
  }
}