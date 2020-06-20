package blogpost;


import java.util.Date;

public class BlogPost {
  private String authorName;
  private String title;
  private String text;
  private String publicationDate;

  public BlogPost(String authorName, String title, String text, String publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }

  public void blogContent() {
    System.out.println(authorName + "\n" + title + "\n" + text + "\n" + publicationDate + "\n");
  }
}
