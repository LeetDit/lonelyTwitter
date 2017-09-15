package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by heesoopark on 2017-09-14.
 */

public class Happy extends Current_Mood{
    private String mood;

    public Happy(Date date) {
        super(date);

    }

    public void setMood(String mood){
        this.mood = mood;
    }

    public String getMood(){
        return mood;
    }
}
