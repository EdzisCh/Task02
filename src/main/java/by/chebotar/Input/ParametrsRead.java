package by.chebotar.Input;

import by.chebotar.Entity.TetrahedFactory;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ParametrsRead {

  private static Logger log = LogManager.getLogger(TetrahedFactory.class);

  public List<String> getParametrs() throws FileNotFoundException {
    List<String> parametrs = new ArrayList<>();
    String parametr;
    try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("src//main//resources//parametrs.txt")))) {
      while ((parametr = reader.readLine()) != null) {
        parametrs.add(parametr);
      }

    } catch (IOException e) {
      log.error("Exception in " + ParametrsRead.class + " " + e.getMessage());
    }
    return parametrs;
  }
}
