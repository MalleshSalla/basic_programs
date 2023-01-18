package com.threadexample;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableInterfaceExample {

	public static void main(String[] args) {
		Map<String, Long> input = new HashMap<String, Long>();
		input.put("Hello", 1L);
		input.put("Hi", 3L);
		input.put(null, 2L);

		input.forEach((message, delay) -> {

			final FutureTask<Boolean> futureTask = new FutureTask<>(new MessageScheduler(message, delay));
			Thread thread = new Thread(futureTask);
			thread.start();

			try {
				final boolean result = futureTask.get();
				System.out.println(result ? message + " :scheduled successfully" : message + " :schedule failed");
			} catch (InterruptedException | ExecutionException e) {
				System.out.println(e.getMessage());
			}
		});
	}
}

class MessageScheduler implements Callable {
	private final String message;
	private final long delay;

	public MessageScheduler(final String message, final long delay) {
		this.message = message;
		this.delay = delay;
	}

	@Override
	public Boolean call() {
		try {
			if (message == null) {
				throw new NullPointerException("message should not be null");
			}
			Thread.sleep(delay);
			System.out.println(message);

			return true;
		} catch (InterruptedException | NullPointerException e) {
			return false;
		}
	}
}
