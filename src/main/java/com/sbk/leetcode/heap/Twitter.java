package com.sbk.leetcode.heap;

import java.util.*;

class Twitter {

    private Map<Integer, PriorityQueue<Integer>> tweets = new HashMap<>();
    private Map<Integer, User> users;
    private volatile static int genTs = 0;
    Twitter() {
        users = new HashMap<>();
    }

    /** Compose a new tweet. */
    void postTweet(int userId, int tweetId) {
        findUser(userId).addTweet(tweetId);
    }

    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    List<Integer> getNewsFeed(int userId) {
        return findUser(userId).getNewsFeed();
    }

    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    void follow(int followerId, int followeeId) {
        if(followeeId == followerId) return;
        findUser(followerId).follow(findUser(followeeId));
    }

    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    void unfollow(int followerId, int followeeId) {
        if(followeeId == followerId) return;
        findUser(followerId).unfollow(findUser(followeeId));
    }

    private User findUser(int userId){
        if(!users.containsKey(userId)) users.put(userId, new User(userId));
        return users.get(userId);
    }

    private static class User {
        int userId;
        Set<User> folowed = new HashSet<>();
        List<Tweet> tweets = new ArrayList<>();
        User(int userId) {
            this.userId = userId;
        }
        void addTweet(int tweetId){
            tweets.add(new Tweet(tweetId));
        }
        void follow(User user) {
            folowed.add(user);
        }
        void unfollow(User user) {
            folowed.remove(user);
        }
        List<Integer> getNewsFeed() {
            List<Integer> newsFeed = new ArrayList<>();
            PriorityQueue<Tweet> tweetsPq = new PriorityQueue<>((o1, o2) -> o2.ts - o1.ts);
            tweetsPq.addAll(tweets);
            for(User folowee : folowed) {
                tweetsPq.addAll(folowee.tweets);
            }
            int i = 0;
            while(!tweetsPq.isEmpty() && i<10) {
                newsFeed.add(tweetsPq.poll().tweetId);
                i++;
            }
            return newsFeed;
        }
    }
    private static class Tweet {
        int tweetId;
        int ts;
        Tweet(int tweetId){
            this.tweetId = tweetId;
            this.ts = genTs++;
        }
    }
}
