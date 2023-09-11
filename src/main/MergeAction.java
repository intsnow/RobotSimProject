package main;

import java.util.List;

class MergeAction
{
    private List<String> actions;
    private String merged;

    protected MergeAction(List<String> getActions){
        actions = getActions;
    };


    protected String startMix()
    {
        StringBuilder merging = new StringBuilder();

        for (String action : actions) {
            merging.append(action);
        }
        merged = merging.toString();
        System.out.println("MIXED:  "+ merged);
        return merged;
    }

    //  Code para por no Robot:
    /*
  public void simultActions(List<String> actions)
  {
    List<String> getActions = new ArrayList<>();

    if (actions.contains("blink_left"))
      {
      if (actions.contains("raise_left"))
      {
        blink(true, false);
        getActions.add(actionBot);

        raiseArms(true, false);
        getActions.add(actionBot);
      }
      if (actions.contains("raise_right"))
      {
        raiseArms(false, true);
        getActions.add(actionBot);
      }
    }

    if (actions.contains("blink_right"))
    {
      if (actions.contains("raise_left"))
      {
        blink(false, true);
        getActions.add(actionBot);

        raiseArms(true, false);
        getActions.add(actionBot);
      }
      if (actions.contains("raise_right"))
      {
        raiseArms(false, true);
        getActions.add(actionBot);
      }
    }

    MergeAction merging = new MergeAction(getActions);
    actionBot = merging.startMix();
  }
  */

}

