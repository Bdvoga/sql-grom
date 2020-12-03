package lesson6.fromLesson;

public class Demo {
    public static void main(String[] args) {
        Author author = new Author(105,"Test");
        Article article = new Article(1,"Test header","Test text", author);
    }
}
