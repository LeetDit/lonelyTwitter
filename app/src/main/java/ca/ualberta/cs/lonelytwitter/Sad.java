package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents sad mood
 *
 * @author Hee Soo Park
 * @version 1.0
 * @since 1.0
 */

public class Sad extends Current_Mood{
    private String mood;

    /**
     * return date
     *
     * @param date
     */
    public Sad(Date date) {
        super(date);

    }

    /**
     * sets the mood
     *
     * @param mood
     */
    public void setMood(String mood){
        this.mood = mood;
    }

    /**
     * returns mood
     *
     * @return
     */
    public String getMood(){
        return mood;
    }

}
