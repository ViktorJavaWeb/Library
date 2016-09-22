package net.mksat.gan;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by ByelozyorovZ on 18.09.2016.
 */
@Entity(name = "Book")
public class Book {



    @Id
    @Column(name="Book_id")
    private int bookId;
    @Column(name="Title")
    private String title;
    @Column(name="Year")
    private int year;
    @Column(name = "Author_id")
    private int authorId;
    @Column(name = "Publisher_id")
    private int publishId;


    public Book() {

    }



    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAuthorId() {
        return authorId;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }

    public int getPublishId() {
        return publishId;
    }

    public void setPublishId(int publishId) {
        this.publishId = publishId;
    }
}

