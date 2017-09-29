package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;


/**
 * Represents a Tweet
 *
 * @author Hee Soo Park
 * @version 1.0
 * @see Sad
 * @see Happy
 * @since 1.0
 */

public abstract class Current_Mood {

    ArrayList<Current_Mood> moods = new ArrayList<Current_Mood>();


    private Date date;

    /**
     * sets the date
     *
     * @param date
     */
    public Current_Mood(Date date){
        this.date = date;
    }

    /**
     * sets the date
     *
     * @param date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * get date
     *
     * @return date
     */
    public Date getDate(){
        return date;
    }


}
