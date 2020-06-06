/* Create an empty list which will contain names (strings)
Print out the number of elements in the list
Add William to the list
Print out whether the list is empty or not
Add John to the list
Add Amanda to the list
Print out the number of elements in the list
Print out the 3rd element
Iterate through the list and print out each name
William
John
Amanda
Iterate through the list and print
1. William
2. John
3. Amanda
Remove the 2nd element
Iterate through the list in a reversed order and print out each name
Amanda
William
Remove all elements */

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class ListIntroduction1 {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("William");
    System.out.println(names + "\n");
    names.add("John");
    names.add("Amanda");
    System.out.println(names + "\n");
    System.out.println(names.size() + "\n");
    System.out.println(names.get(2) + "\n");
    for (String name : names) {
      System.out.println(name);
    }
    System.out.println();
    names.remove(2);
    for (int i = names.size(); i >= 0; i--) {
    }
    System.out.println(names + "\n");
    names.clear();
    System.out.println(names);
  }
}
