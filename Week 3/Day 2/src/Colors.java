// - Create a two dimensional array
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`

public class Colors {
  public static void main(String[] args) {
    int colors = 3;
    int shades = 5;
    String[][] array = new String[colors][shades];
    array[0][0] = "Lime";
    array[0][1] = "Forest Green";
    array[0][2] = "Olive";
    array[0][3] = "Pale Green";
    array[0][4] = "Spring Green";
    array[1][0] = "Orange Red";
    array[1][1] = "Red";
    array[1][2] = "Tomato";
    array[2][0] = "Orchid";
    array[2][1] = "Violet";
    array[2][2] = "Pink";
    array[2][3] = "Hot Pink";

    for (int i = 0; i < colors; i++) {
      for (int j = 0; j < shades; j++) {
        System.out.println(array[i][j]);
      }
    }
  }
}
