package com.sbk.leetcode.heap;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TwitterTest {

    @Test
    public void twitter_scenario_1() throws Exception {
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 5);
        assertEquals(twitter.getNewsFeed(1), Arrays.asList(5));
        twitter.follow(1, 2);
        twitter.postTweet(2, 6);
        assertEquals(twitter.getNewsFeed(1), Arrays.asList(6,5));
        twitter.unfollow(1, 2);
        twitter.getNewsFeed(1);
        assertEquals(twitter.getNewsFeed(1), Arrays.asList(5));
    }

    @Test
    public void twitter_scenario_2() throws Exception {
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 5);
        twitter.postTweet(1, 3);
        twitter.postTweet(1, 101);
        twitter.postTweet(1, 13);
        twitter.postTweet(1, 10);
        twitter.postTweet(1, 2);
        twitter.postTweet(1, 94);
        twitter.postTweet(1, 505);
        twitter.postTweet(1, 333);
        assertEquals(twitter.getNewsFeed(1), Arrays.asList(333,505,94,2,10,13,101,3,5));

    }
}