import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToDo {

  public static void main(String[] args) {
    Path path = Paths.get("ToDo.txt");
    //region List Creation
    List<String> toDoList = Collections.emptyList();
    try {
      toDoList = Files.readAllLines(Paths.get("Todo.txt"), StandardCharsets.UTF_8);
    } catch (Exception ex) {
      System.out.println("Cannot read file");
    }
    //endregion
    if (args.length == 0) {
      linkCommandLine();
    } else if (args[0].equals("-l")) {
      listTasks();
    } else try {
      if (args[0].equals("-a")) {
        addTask(path, toDoList, args[1]);
      }
    } catch (Exception ex) {
      System.out.println("Unable to add: no task provided");
    }
  }

  public static void linkCommandLine() {
    System.out.println(
        "Command Line Todo application\n" +
            "=============================\n" +
            "\n" +
            "Command line arguments:\n" +
            "    -l   Lists all the tasks\n" +
            "    -a   Adds a new task\n" +
            "    -r   Removes a task\n" +
            "    -c   Completes an task\n");
  }

  public static void addTask(Path path, List toDoList, String task) {
    try {
      toDoList.add(task);
      Files.write(path, toDoList);
    } catch (Exception ex) {
      System.out.println("Unable to write file");
    }
  }

  public static void listTasks() {
    int counter = 0;
    try {
      Files.readAllLines(Paths.get("ToDo.txt"));
      if (Files.size(Paths.get("ToDo.txt")) == 0) {
        System.out.println("No todos for today! :)");
      } else {
        for (String task : Files.readAllLines(Paths.get("ToDo.txt"))) {
          counter += 1;
          System.out.println(counter + " - " + task);
        }
      }
    } catch (Exception ex) {
      System.out.println("Cannot read file");
    }
  }

}