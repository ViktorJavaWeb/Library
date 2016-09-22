package net.mksat.gan;

/**
 * Created by ByelozyorovZ on 20.09.2016.
 */
public class BookComment {
    int id;
    int book_id;
    int comment_id;

    public BookComment(int id, int book_id, int comment_id) {
        this.id = id;
        this.book_id = book_id;
        this.comment_id = comment_id;
    }
}
