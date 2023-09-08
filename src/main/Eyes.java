package main;

public class Eyes extends Robot{
  String bot;
  
  Eyes(){};

  public String isOn(boolean left, boolean right)
  {
    String s = "";
        
    if (left)
    {
      if (!right)
      {
        s =    "        _        \n"+
               "    ___|_|___    \n"+
               "   |#########|   \n"+
               "   |######00#|   \n"+
               "  @|#__###00#|@  \n"+
               " @ |#########| @ \n"+
               " @ |###---###| @ \n"+
               " @ |_________| @ \n"+
               "     @@   @@     \n"+
               "     @@   @@     \n\n";
            
      }
      else
      {
        s =  "        _        \n"+
             "    ___|_|___    \n"+
             "   |#########|   \n"+
             "   |#########|   \n"+
             "  @|#__###__#|@  \n"+
             " @ |#########| @ \n"+
             " @ |###-o-###| @ \n"+
             " @ |_________| @ \n"+
             "     @@   @@     \n"+
             "     @@   @@     \n\n";
      }
    
    }
    else
    {
      s =  "        _        \n"+
           "    ___|_|___    \n"+
           "   |#########|   \n"+
           "   |#00######|   \n"+
           "  @|#00###__#|@  \n"+
           " @ |#########| @ \n"+
           " @ |###---###| @ \n"+
           " @ |_________| @ \n"+
           "     @@   @@     \n"+
           "     @@   @@     \n\n";
            
     
    }
    s = s.replace("#"," ");
    if (!(left && right)){
      System.out.println("\n\t ... Blink !! ;)");
    }
    return s;
  }

  
}