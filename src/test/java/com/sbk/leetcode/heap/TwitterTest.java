package com.sbk.leetcode.heap;

import java.util.List;

import static org.junit.Assert.*;

public class TwitterTest {
    private Twitter twitter = new Twitter();

    public void twitter_scenario_1() throws Exception {
         int userId = 1;
         int tweetId = 10;
         int followerId = 2;
         int followeeId = 3;
         Twitter obj = new Twitter();
         obj.postTweet(userId,tweetId);
         List<Integer> param_2 = obj.getNewsFeed(userId);
         obj.follow(followerId,followeeId);
         obj.unfollow(followerId,followeeId);
    }
}