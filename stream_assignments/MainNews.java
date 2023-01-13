package com.corejava.assignment9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class MainNews {

	public static void main(String[] args) {
		
		
		
		List<String> comments1 = Arrays.asList("This is a budget great article! ", "I agree with the budget previous comment.");
		News news1 = new News(10, "John Doe", "Jane Doe", comments1);
		
		List<String> comments2 = Arrays.asList("This is a wonderfull article!");
		News news2 = new News(20, "shiva kumar", "shiva kumar", comments2);
		
		List<String> comments3 = Arrays.asList("This is a great article!", "I agree with the previous comment.","I also agree with previous two comments");
		News news3 = new News(30, "Mallesh salla", "Mallesh Salla", comments3);
		
		
		List<News> newsList = Arrays.asList(news1, news2, news3);
		NewsTracker tracker = new NewsTracker();
		int maxCommentsNewsId = tracker.findNewsIdWithMaxComments(newsList);
		
		// by using conventional approach 
		System.out.println("The new id of max comments is "+maxCommentsNewsId); 
		
		// by using java 8 stream api
		 Optional<News> maxCommentsNews = newsList.stream()
		            .max(Comparator.comparing(n -> n.getComments().size()));	
		 System.out.println("The new id of max comments is "+maxCommentsNews.get().getNewsId());// simply getting value 
		System.out.println("The new id of max comments is "+maxCommentsNews.map(News::getNewsId).orElse(0));// if value not present give default value
		
		// assignment 5
		// find out how many times the word budget arrived in user comments all news by using stream
		long count1 = newsList.stream()
        .flatMap(n -> n.getComments().stream()).filter(s -> s.contains("budget"))
        .count();
		System.out.println(count1);
		
		
		
		// Assignment 7 
		//
		 Map<String, Long> commentByUserWiseCommentCount = 
		            newsList.stream()
		            .collect(Collectors.groupingBy(News::getCommentByUser, Collectors.counting()));
		 
		        commentByUserWiseCommentCount.forEach((user, count) -> System.out.println(user + ": " + count));
		
		
		
	}

}
