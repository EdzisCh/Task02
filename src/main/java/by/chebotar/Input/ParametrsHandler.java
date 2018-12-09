package by.chebotar.Input;

import by.chebotar.Validator.ParametrValidator;
import java.io.FileNotFoundException;
import java.util.List;

public class ParametrsHandler {
  private ParametrsRead parametrsRead;
  private List<String> listOfStrings;
  private String[] parametrs;
  private ParametrValidator parametrValidator;
  private static int index;

  public ParametrsHandler() throws FileNotFoundException {
    index = 0;
    parametrsRead = new ParametrsRead();
    listOfStrings = parametrsRead.getParametrs();
    parametrValidator = new ParametrValidator();
  }

  public double[] getParametrs(){
    getSplitedValidStrings();
    if(parametrs == null){
      return null;
    }
    double[] doubleParametrs = new double[parametrs.length];

    for (int i = 0; i < parametrs.length; i++) {
      doubleParametrs[i] = Double.parseDouble(parametrs[i]);
    }

    return doubleParametrs;
  }

  private void getSplitedValidStrings(){
    String[] temp;
    boolean flag = true;
    if (index >= listOfStrings.size()){
      index = 0;
    }
    temp = listOfStrings.get(index).split(" ");
    index++;
    for (int i = 0; i < temp.length; i++) {
      if(parametrValidator.validate(temp[i]) == false || temp.length < 3){
        flag = false;
        parametrs = null;
        break;
      }
    }
    if (flag){
      parametrs = temp;
    }
  }
}
