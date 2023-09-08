package main;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;

public class Robot{
  private Eyes eyes;
  private Arms arms;
  HashMap <String,String> merged_actions = new HashMap<String,String>();
  List <String> list_actions = new ArrayList<String>(){
    {
    add("blink_left");
    add("blink_right");
    add("raise_left");
    add("raise_right");  
    }
  };

  protected String awakenbot;
  protected String actionbot;


  Robot(){


    System.out.println("\n\n\tStarting robot");
    System.out.println("\n\t\tHey! This is a list of all I can do:\n");

    for (String action: this.list_actions){
      System.out.println("\t\t\t--> " + action);
    }

    this.awakenbot = """
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
    
    this.awakenbot = this.awakenbot.replace("#"," ");
    this.display();
    
  };

  protected void setRobot(String curr_actionbot){
    this.actionbot = curr_actionbot;
  }


  
  public void blink(boolean sttL, boolean sttR){
    this.eyes = new Eyes();

    this.actionbot = this.eyes.isOn(sttL, sttR);
    
    this.display();
  }


  public void raiseArms(boolean left, boolean right){
    this.arms = new Arms();

    this.actionbot = this.arms.isRaisingUp(left, right);
    
    this.display();
  }

  
  public void simultActions(List<String> actions) {

    List<String> act = new ArrayList<>();
    MergeAction merging = new MergeAction(actions);
  }
  public void display(){
    
    if ((!Objects.equals(this.actionbot, this.awakenbot)) && (this.actionbot != null)){
      System.out.println(this.actionbot);
    }
    
    System.out.println(this.awakenbot);
  }

  
}