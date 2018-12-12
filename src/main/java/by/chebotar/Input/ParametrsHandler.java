package by.chebotar.Input;

import by.chebotar.Validator.ParametrValidator;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

public class ParametrsHandler {
  private ParametrsRead parametrsRead = new ParametrsRead();
  private List<String> listOfStrings;
  private String[] parametrs;
  private ParametrValidator parametrValidator = new ParametrValidator();
  private static int index = 0;

  public double[] getParametrs(Path path) throws IOException {
    getSplitedValidStrings(path);
    if(parametrs == null){
      return null;
    }
    double[] doubleParametrs = new double[parametrs.length];

    for (int i = 0; i < parametrs.length; i++) {
      doubleParametrs[i] = Double.parseDouble(parametrs[i]);
    }

    return doubleParametrs;
  }

  private void getSplitedValidStrings(Path path) throws IOException {
    String[] temp;
    boolean flag = true;
    listOfStrings = parametrsRead.getParametrs(path);
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
