package main;

public class Main {
  public static void main(String[] args) {
    Robot bot = new Robot();
    /*  
        true -> ativa ação
        false -> nao ativa  ;
        
        primeiro param: left_limb  
        segundo param: right_limb              
        
        */
    
    bot.blink(true, false);
    bot.blink(false, true);
    bot.raiseArms(true, true);
    bot.raiseArms(true, false);
    bot.raiseArms(false, true);
    //List<String> actions = new List<String>(List.of("blink_left","raise_left"));
    //bot.simultActions(actions);
    System.out.println("\n\n\tEnding robot");
 
  }
}