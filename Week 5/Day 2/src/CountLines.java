// Write a function that takes a filename as string,
// then returns the number of lines the file contains.
// It should return zero if it can't open the file, and
// should not raise any error.

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import javax.swing.plaf.basic.BasicDesktopIconUI;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CountLines {
  public static void main(String[] args) {
    String fileName = ("my-text.txt");
    long counter = numberOfLines(fileName);
    System.out.println(counter);
  }


  public static Long numberOfLines(String fileName) {
    try {
      Path filePath = Paths.get(fileName);
      long counter = Files.lines(filePath).count();
      return counter;
    } catch (Exception ex) {
      return (long) 0;
    }
  }
}
