package main;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

public class Robot{
  Eyes eyes;
  Arms arms;
  HashMap <String,String> merged_actions = new HashMap<String,String>();
  List <String> list_actions = new ArrayList<String>(){
    {
    add("blink_left");
    add("blink_right");
    add("raise_left");
    add("raise_right");  
    }
  };

  String awakenbot;
  String actionbot;
  
  Robot(){
      
    System.out.println("\n\n\tStarting robot");
    System.out.println("\n\t\tHey! This is a list of all I can do:\n");

    for (String action: this.list_actions){
      System.out.println("\t\t\t--> " + action);
    }
    
    this.awakenbot = "        _        \n"+
                     "    ___|_|___    \n"+
                     "   |#########|   \n"+
                     "   |#00###00#|   \n"+
                     "  @|#00###00#|@  \n"+
                     " @ |#########| @ \n"+
                     " @ |###-o-###| @ \n"+
                     " @ |_________| @ \n"+
                     "     @@   @@     \n"+
                     "     @@   @@     \n\n";
    
    this.awakenbot = this.awakenbot.replace("#"," ");
    this.display();
    
  };

  
  public void blink(boolean sttL, boolean sttR){
    this.eyes = new Eyes();
    
    if (sttL)
    {
      if (!sttR){
        this.actionbot = this.eyes.isOn(true, false);
      }
      else {
        this.actionbot = this.eyes.isOn(true, true);    
      }
    }
    else
    {
      if (sttR){
        this.actionbot = this.eyes.isOn(false, true);
      }
      else{
        this.actionbot = this.eyes.isOn(false, false);   
      }
    }
    
    this.display();
  }

  
  public void raiseArms(boolean left, boolean right){
    this.arms = new Arms();
    
    if (left)
    {
      if (!right){
        this.actionbot = this.arms.isRaisingUp(true,false);
      }
      else{
        this.actionbot = this.arms.isRaisingUp(true,true);
      }
    }
    else
    {
      if (right){
        this.actionbot = this.arms.isRaisingUp(false,true);
      }
      else{
        this.actionbot = this.arms.isRaisingUp(false,false);
      }
    }
    
    this.display();
  }

  
  public void simultActions(List<String> actions){
    //List<HashMap> act = new HashMap<String,String>(){};
    //act.
    //MergeAction merging = new MergeAction(actions);
    
  }

  
  public void display(){
    
    if ((this.actionbot != this.awakenbot) && (this.actionbot != null)){
      System.out.println(this.actionbot);
    }
    
    System.out.println(this.awakenbot);
  }

  
}