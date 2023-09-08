package main;

public class Eyes extends Robot{
  String bot = " ";

  protected Eyes(){};



  public String isOn(boolean left, boolean right)
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
    if (!(left && right)){
      System.out.println("\n\t ... Blink !! ;)");
    }

    return s;

  }




}