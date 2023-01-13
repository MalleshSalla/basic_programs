package com.corejava.assignment9;

import java.util.List;

public class NewsTracker {
  public int findNewsIdWithMaxComments(List<News> newsList) {
    int maxComments = 0;
    int maxNewsId = 0;
    for (News news : newsList) {
      int newsId = news.getNewsId();
      List<String> comments = news.getComments();
      int commentCount = comments.size();
      if (commentCount > maxComments) {
        maxComments = commentCount;
        maxNewsId = newsId;
      }
    }
    return maxNewsId;
  }
}
