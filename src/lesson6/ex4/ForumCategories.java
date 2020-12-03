package lesson6.ex4;

import java.util.Date;

public class ForumCategories {
    int id;
    String title;
    String description;
    Date date;
    String ip;

    public ForumCategories(int id, String title, String description, Date date, String ip) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.date = date;
        this.ip = ip;
    }
}
