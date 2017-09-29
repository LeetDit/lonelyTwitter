package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a Important tweet
 *
 * @author Hee Soo Park
 * @version 1.0
 * @since 1.0
 */

public class ImportantTweet extends Tweet{
    /**
     * set message
     *
     * @param message
     */
    public ImportantTweet(String message){
        super(message);
    }


    /**
     * sets message and date
     *
     * @param message
     * @param date
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return Boolean.TRUE;
    }
}
