package by.chebotar.Input;

import by.chebotar.Exceptions.InvalidPathException;
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

  public double[] getParametrs(Path path) throws InvalidPathException {
    getSplitedValidStrings(path);
    if(parametrs == null){
      return new double[]{0.0, 0.0, 0.0};
    }
    double[] doubleParametrs = new double[parametrs.length];

    for (int i = 0; i < parametrs.length; i++) {
      doubleParametrs[i] = Double.parseDouble(parametrs[i]);
    }

    return doubleParametrs;
  }

  private void getSplitedValidStrings(Path path) throws InvalidPathException {
    String[] temp;
    listOfStrings = parametrsRead.getParametrs(path);
    if (index >= listOfStrings.size()){
      index = 0;
    }
    if (listOfStrings.size() == 0){
      parametrs = null;
    }
    if(parametrs != null) {
      temp = listOfStrings.get(index).split(" ");
      index++;
      validateParametrs(temp);
    }
  }

  private void validateParametrs(String[] temp){
    boolean flag = true;
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
