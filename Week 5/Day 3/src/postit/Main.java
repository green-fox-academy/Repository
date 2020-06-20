//Create a PostIt class that has
//a backgroundColor
//a text on it
//a textColor
//Create a few example post-it objects:
//an orange with blue text: "Idea 1"
//a pink with black text: "Awesome"
//a yellow with green text: "Superb!

package postit;

import java.awt.*;

public class Main {
  public static void main(String[] args) {
    Post post1 = new Post(Color.ORANGE, "Idea 1", Color.BLUE);
    Post post2 = new Post(Color.PINK, "Awesome", Color.black);
    Post post3 = new Post(Color.YELLOW,"Superb", Color.GREEN);
    System.out.println(post1);
    System.out.println(post2);
    System.out.println(post3);
  }
}
