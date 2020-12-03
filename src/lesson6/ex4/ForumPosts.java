package lesson6.ex4;

import java.util.Date;

public class ForumPosts {
    int id;
    ForumSubcategories forumSubcategory;
    Users user;
    int parentPost;
    String title;
    String content;
    boolean isPoll;
    Date date;
    String ip;

    public ForumPosts(int id, ForumSubcategories forumSubcategory, Users user, int parentPost, String title, String content, boolean isPoll, Date date, String ip) {
        this.id = id;
        this.forumSubcategory = forumSubcategory;
        this.user = user;
        this.parentPost = parentPost;
        this.title = title;
        this.content = content;
        this.isPoll = isPoll;
        this.date = date;
        this.ip = ip;
    }
}
