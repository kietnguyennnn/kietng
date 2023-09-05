
package baitapbuoi6;

import java.util.*;
public class TestMain {

    public static void main(String[] args) {
        News news1 = new News(1, "Title 1", "26/05/2023", "Author 1", "Content 1", (float)1.1);
        News news2 = new News(2, "Title 2", "26/05/2023", "Author 2", "Content 2", (float)1.2);
        News news3 = new News(3, "Title 3", "26/05/2023", "Author 3", "Content 3",(float)1.3);
        news1.display();
        ArrayList<News> listNews = new ArrayList<News>();
        listNews.add(news1);
        listNews.add(news2);
        listNews.add(news3);

        Collections.sort(listNews);

        for (News news : listNews) {
            news.display();
            System.out.println();
        }
    }
}

