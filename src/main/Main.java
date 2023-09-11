package main;
import java.util.List;
import java.util.Arrays;

class Main
{
  public static void main(String[] args)
  {
    Robot bot = new Robot();
    /*  
        true -> ativa ação
        false -> nao ativa  ;
        
        primeiro param: left_limb  
        segundo param: right_limb              
        
        */


      bot.performAction(Robot.Action.BLINK_RIGHT);
      bot.performAction(Robot.Action.BLINK_LEFT);
      bot.performAction(Robot.Action.RAISE_LEFT);
      bot.performAction(Robot.Action.RAISE_RIGHT);
      bot.performAction(Robot.Action.BLINK_BOTH);


      List<String> actions = Arrays.asList("blink_left","raise_left");
      //bot.simultActions(actions);
      System.out.println("\n\n\tEnding robot");


  }
}