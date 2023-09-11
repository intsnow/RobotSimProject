package main;

class Arms
{
  private String message;

  protected Arms(){};

  private void setMessage(String text){
    message = text;
  }
  protected String getMessage(){
    return message;
  }

  private String getAction(String bot){
    return bot;
  }


  protected String isRaisingUp(boolean left, boolean right)
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
    if (left && right)
    {
      setMessage("\n\t ... Raise ur hands!! \\o/");
    }
    else
    {
      setMessage("\n\t ... Raise ur hand!! ");
    }

    s = s.replace("#"," ");

    return getAction(s);
  }
}