import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ToDo {

  public static void main(String[] args) {
    List<String> toDoList = new ArrayList<>();
    if (args.length == 0) {
      linkCommandLine();
    }
    else if (args[0].equals("-l")) {
      try {
        Files.readAllLines(Paths.get("ToDo.txt"));
        for (String task: Files.readAllLines(Paths.get("ToDo.txt"))) {
          System.out.println(task);
        }
      } catch (Exception ex) {
        System.out.println("Cannot read file");
      }
    }
    addTask(toDoList, "Walk the Dog");
  }

  public static void linkCommandLine() {
    System.out.println(
        "Command Line Todo application\n" +
            "=============================\n" +
            "\n" +
            "Command line arguments:\n" +
            "    -l   Lists all the tasks\n" +
            "    -a   Adds a new task\n" +
            "    -r   Removes an task\n" +
            "    -c   Completes an task\n");
  }

  public static void addTask(List toDoList, String task) {
    toDoList.add(task);
    try {
      Path path = Paths.get("ToDo.txt");
      Files.write(path, toDoList);
    } catch (Exception ex) {
      System.out.println("Unable to write file");
    }
  }
}