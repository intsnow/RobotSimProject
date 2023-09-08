package main;

import java.util.List;
import java.util.ArrayList;

class MergeAction extends Robot{
  List<String> actions_display = new ArrayList<String>();
  //  Lista de tabelas hash: cada tabela tem o nome da açao e o desenho
  //List <HashMap> merged_actions = new HashMap<String,String>();

  MergeAction(List actions){
    //this.actions_display.add(actions);
    
    this.merge();
  };
  
  
  
  public void merge(){
    String[] s = this.actions_display.toArray(new String[0]);

    //if (s.contains())
    
    //return s;
  }

}
