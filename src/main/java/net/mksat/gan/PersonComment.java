package net.mksat.gan;

/**
 * Created by ByelozyorovZ on 20.09.2016.
 */
public class PersonComment {
    int id;
    int person_id;
    int comment_id;

    public PersonComment(int id, int comment_id, int person_id) {
        this.id = id;
        this.comment_id = comment_id;
        this.person_id = person_id;
    }
}
