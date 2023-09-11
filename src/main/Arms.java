package main;

class Arms implements BodyParts
{
  private String message;
  private String bot;

  protected Arms(){};

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
      setMessage("\n\n\t ... Raise ur hands!! \\o/\n");
    }
    else
    {
      setMessage("\n\n\t ... Raise ur hand!! \n");
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
      }
      else
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
    }
    else
    {
      if (right)
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
      }
      else
      {
        s = """
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
      }
    }

    bot = s.replace("#"," ");
    verifyMessage(left, right);
  }
}