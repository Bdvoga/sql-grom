package lesson6.ex4;

import java.util.Date;

public class ForumSubcategories {
    int id;
    ForumCategories forumCategory;
    String title;
    String description;
    Date date;
    String ip;

    public ForumSubcategories(int id, ForumCategories forumCategory, String title, String description, Date date, String ip) {
        this.id = id;
        this.forumCategory = forumCategory;
        this.title = title;
        this.description = description;
        this.date = date;
        this.ip = ip;
    }
}
