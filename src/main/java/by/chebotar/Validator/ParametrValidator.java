package by.chebotar.Validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParametrValidator {

  public ParametrValidator() {

  }

  public boolean validate(String string){
    if (string.equals(null)){
      return false;
    }
    Pattern p = Pattern.compile("[0-9.]+");
    Matcher m = p.matcher(string);
    if (m.matches() == false){
      return false;
    }
    return true;
  }

}