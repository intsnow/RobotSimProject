package main;

public class Arms extends Robot{
  String bot;
  protected Arms(){};



  public String isRaisingUp(boolean left, boolean right)
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
                    ___|_|___   @
                   |#########|  @
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
    if (left && right){
      System.out.println("\n\t ... Raise ur hands!! \\o/");
    }
    else{
      System.out.println("\n\t ... Raise ur hand!! ");
    }

    s = s.replace("#"," ");
    return s;

  }



  public void display(){
    System.out.println(this.bot);

  }
  
}