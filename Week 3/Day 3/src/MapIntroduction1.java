    /* Create an empty map where the keys are integers and the values are characters

    Print out whether the map is empty or not

    Add the following key-value pairs to the map

    Key Value
    97a
    98b
    99c
    65A
    66B
    67C
    Print all the keys

    Print all the values

    Add value D with the key 68

    Print how many key-value pairs are in the map

    Print the value that is associated with key 99

    Remove the key-value pair where with key 97

    Print whether there is an associated value with key 100or not

    Remove all the key-value pairs */

    import java.util.HashMap;

    public class MapIntroduction1 {
  public static void main(String[] args) {
    HashMap<Integer, String> keymap = new HashMap<>();
    keymap.put(97, "a");
    keymap.put(98, "b");
    keymap.put(99, "c");
    keymap.put(65, "A");
    keymap.put(66, "B");
    keymap.put(67, "C");
    System.out.println(keymap.keySet());
    System.out.println(keymap.values());
    keymap.put(68, "D");
  }
}
