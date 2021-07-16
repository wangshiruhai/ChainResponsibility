package spring;

/**
 * @author wangshihai
 * @date 2021-07-17
 */
public class User {
    private final String name;
    private final char gender;

    public User(String name, char gender) {
        super();
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public char getGender() {
        return gender;
    }
}
