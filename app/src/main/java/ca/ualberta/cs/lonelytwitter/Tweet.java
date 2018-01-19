package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.*;


/**
 * Created by heesoopark on 2018-01-18.
 */

public abstract class Tweet implements Tweetable {
    private String message;
    private Date date;

    public Tweet(String message) {
        this.message = message;
        this.date = new Date();
    }

    public Tweet(String message, Date date) {
        this.message = message;
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) throws TweetTooLongException {
        if (message.length() > 140) {
            throw new TweetTooLongException();
        } else {
            this.message = message;
        }
    }

    public abstract Boolean isImportant();

    public static void mylist() {
        ArrayList<String> obj = new ArrayList<String>();

	  /*This is how elements should be added to the array list*/
        obj.add("Emotion");
        obj.add("Sad");
        obj.add("Mad");
    }
}
