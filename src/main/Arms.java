package main;

public class Arms extends Robot{
  String bot;
  
  Arms(){};
  
  public String isRaisingUp(boolean left, boolean right)
  {
    String s;
    
    if (left)
    {
      if (!right)
      {
        s =      "         _        \n"+
                 " @   ___|_|___    \n"+
                 " @  |#########|   \n"+
                 "  @ |#00###00#|   \n"+
                 "   @|#00###00#|@  \n"+
                 "    |#########| @ \n"+
                 "    |###-o-###| @ \n"+
                 "    |_________| @ \n"+
                 "      @@   @@     \n"+
                 "      @@   @@     \n\n";
      }
      else
      {
        s =      "         _         \n"+
                 " @   ___|_|___   @ \n"+
                 " @  |#########|  @ \n"+
                 "  @ |#00###00#| @  \n"+
                 "   @|#00###00#|@   \n"+
                 "    |#########|    \n"+
                 "    |###-o-###|    \n"+
                 "    |_________|    \n"+
                 "      @@   @@      \n"+
                 "      @@   @@      \n\n";
      }
    }
    else
    {
      if (right)
      {
        s =      "        _        \n"+
                 "    ___|_|___   @\n"+
                 "   |#########|  @\n"+
                 "   |#00###00#| @ \n"+
                 "  @|#00###00#|@  \n"+
                 " @ |#########|   \n"+
                 " @ |###-o-###|   \n"+
                 " @ |_________|   \n"+
                 "     @@   @@     \n"+
                 "     @@   @@     \n\n";
      }
      else
      {
        s =      "        _        \n"+
                 "    ___|_|___    \n"+
                 "   |#########|   \n"+
                 "   |#00###00#|   \n"+
                 "  @|#00###00#|@  \n"+
                 " @ |#########| @ \n"+
                 " @ |###-o-###| @ \n"+
                 " @ |_________| @ \n"+
                 "     @@   @@     \n"+
                 "     @@   @@     \n\n";
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