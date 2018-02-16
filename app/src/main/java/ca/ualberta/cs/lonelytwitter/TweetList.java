package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by heesoopark on 2018-02-15.
 */

public class TweetList {

    private ArrayList<Tweet> tweets = new ArrayList<Tweet>();

    private int itemCount;

    public void add(Tweet tweet) {
        if (tweets.contains(tweet)) {
            throw new IllegalArgumentException();
        }else{
            tweets.add(tweet);
        }
    }

    public boolean hasTweet(Tweet tweet)
    {
        return tweets.contains(tweet);
    }

    public Tweet getTweet(int index)
    {

        return tweets.get(index);
    }

    public void delete(Tweet tweet)
    {
        tweets.remove(tweet);
    }

    public int getCount() {
        int itemCount = tweets.size();
        return itemCount;
    }

}

