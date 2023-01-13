package com.corejava.assignment9;

import java.util.List;

public class News {
  private int newsId;
  private String postedByUser;
  private String commentByUser;
  private List<String> comments;

  public News(int newsId, String postedByUser, String commentByUser, List<String> comments) {
    this.newsId = newsId;
    this.postedByUser = postedByUser;
    this.commentByUser = commentByUser;
    this.comments = comments;
  }

  public int getNewsId() {
    return newsId;
  }

  public void setNewsId(int newsId) {
    this.newsId = newsId;
  }

  public String getPostedByUser() {
    return postedByUser;
  }

  public void setPostedByUser(String postedByUser) {
    this.postedByUser = postedByUser;
  }

  public String getCommentByUser() {
    return commentByUser;
  }

  public void setCommentByUser(String commentByUser) {
    this.commentByUser = commentByUser;
  }

  public List<String> getComments() {
    return comments;
  }

  public void setComments(List<String> comments) {
    this.comments = comments;
  }

@Override
public String toString() {
	return "News [newsId=" + newsId + ", postedByUser=" + postedByUser + ", commentByUser=" + commentByUser
			+ ", comments=" + comments + "]";
}
  
  
}