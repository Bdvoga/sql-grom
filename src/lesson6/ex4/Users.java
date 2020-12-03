package lesson6.ex4;

import java.util.Date;

public class Users {
    int id;
    String nick;
    String password;
    String email;
    Date date;
    float karma;
    String ip;

    public Users(int id, String nick, String password, String email, Date date, float karma, String ip) {
        this.id = id;
        this.nick = nick;
        this.password = password;
        this.email = email;
        this.date = date;
        this.karma = karma;
        this.ip = ip;
    }
}
