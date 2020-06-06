// Add "My todo:" to the beginning of the todoText
// Add " - Download games" to the end of the todoText
// Add " - Diablo" to the end of the todoText but with indention

// Expected output:

// My todo:
//  - Buy milk
//  - Download games
//      - Diablo

public class ToDoPrint {
  public static void main(String[] args) {
    String todoText = " - Buy milk\n";
    StringBuilder myToDo = new StringBuilder();
    myToDo.append("My todo:\n");
    StringBuilder restOfList = new StringBuilder();
    restOfList.append(" - Download Games \n \t -Diablo");
    System.out.println(myToDo + todoText + restOfList);
  }
}
