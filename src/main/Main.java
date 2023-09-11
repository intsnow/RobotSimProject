package main;

class Main
{
  public static void main(String[] args)
  {
    Robot bot = new Robot();

      bot.performAction(Robot.Action.BLINK_RIGHT);
      bot.performAction(Robot.Action.BLINK_LEFT);
      bot.performAction(Robot.Action.RAISE_LEFT);
      bot.performAction(Robot.Action.RAISE_RIGHT);
      bot.performAction(Robot.Action.BLINK_BOTH);

      //bot.simultActions(actions);

      System.out.println("\n\n\tEnding robot");
  }
}