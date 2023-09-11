package main;

class Eyes
{
  private String message;
  private String bot;


  protected Eyes(){}

  private void setMessage(){
    message = "\n\t ... Blink !! ;)";
  }
  protected String getMessage(){
    return message;
  }

  private String getAction(){
    return bot;
  }


  protected String isOn(boolean left, boolean right)
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

    s = s.replace("#"," ");
    bot = s;

    if (left || right){
      setMessage();
    }

    return getAction();
  }
}