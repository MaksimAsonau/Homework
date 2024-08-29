package home_work_5;

public class Person {
    private String nick;
    private String password;
    private String name;

    public Person(String nick, String password, String name) {
        this.nick = nick;
        this.password = password;
        this.name = name;
    }

    public String getNick() {
        return nick;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "nick='" + nick + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
