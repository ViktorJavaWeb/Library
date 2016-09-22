package net.mksat.gan;

import java.sql.Date;

/**
 * Created by ByelozyorovZ on 20.09.2016.
 */
public class Comment {
    int comment_id;
    Date date;
    String comment;

    public Comment(int comment_id, Date date, String comment) {
        this.comment_id = comment_id;
        this.date = date;
        this.comment = comment;
    }
}
