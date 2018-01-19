package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by heesoopark on 2018-01-18.
 */

public abstract class Emotions {

    private String message;
    private Date date;


    public Date getDate()
    {
        return date;
    }

    public void setDate(Date date)
    {
        this.date = date;
    }

    public String getMessage()
    {
        return this.message;
    }

    public Emotions(String message)
    {
        this.message = message;
        this.date = new Date();
    }

}
