// Write a function that copies the contents of a file into another
// It should take the filenames as parameters
// It should return a boolean that shows if the copy was successful

import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {
    String original = "my-file.txt";
    String copied = "copied.txt";
    System.out.println(fileCopy(original, copied));
  }

  public static boolean fileCopy(String original, String copied) {
    Path originalPath = Paths.get(original);
    Path copiedPath = Paths.get(copied);
    try {
      List<String> content = Files.readAllLines(originalPath);
      Files.write(copiedPath, content);
      return true;
    }catch (IOException ex){
      return false;
    }
  }
}