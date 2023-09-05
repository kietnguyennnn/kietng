
package baitapbuoi6;
interface Inews {
    public void display();
}
public class News implements Inews , Comparable<News>{
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getPublishDate() {
        return PublishDate;
    }

    public void setPublishDate(String PublishDate) {
        this.PublishDate = PublishDate;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String Content) {
        this.Content = Content;
    }

    public float getAverageRate() {
        return AverageRate;
    }

    public News(int ID, String Title, String PublishDate, String Author, String Content, float AverageRate) {
        this.ID = ID;
        this.Title = Title;
        this.PublishDate = PublishDate;
        this.Author = Author;
        this.Content = Content;
        this.AverageRate = AverageRate;
    }
    
    
    
    public void display() {
    System.out.println("Title: " + this.getTitle());
    System.out.println("Publish Date: " + this.getPublishDate());
    System.out.println("Author: " + this.getAuthor());
    System.out.println("Content: " + this.getContent());
    System.out.println("Average Rate: " + this.getAverageRate());
}
    
    public int compareTo(News other) {
        return Float.compare(AverageRate, other.getAverageRate());
    }
}

