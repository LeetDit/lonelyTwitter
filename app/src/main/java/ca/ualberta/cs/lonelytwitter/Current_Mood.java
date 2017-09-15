package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by heesoopark on 2017-09-14.
 */

public abstract class Current_Mood {

    ArrayList<Current_Mood> moods = new ArrayList<Current_Mood>();

    String s1 ="Happy";
    String s2 ="Sad";

    moods.add(s1);
    moods.add(s2);


    private Date date;

    public Current_Mood(Date date){
        this.date = date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public Date getDate(){
        return date;
    }


}
