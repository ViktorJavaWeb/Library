package net.mksat.gan;

/**
 * Created by ByelozyorovZ on 20.09.2016.
 */
public class Person {
    int person_id;
    String name;
    int role_id;
    String email;
    String login;

    public Person(int person_id, String name, int role_id, String email, String login) {
        this.person_id = person_id;
        this.name = name;
        this.role_id = role_id;
        this.email = email;
        this.login = login;
    }
}
