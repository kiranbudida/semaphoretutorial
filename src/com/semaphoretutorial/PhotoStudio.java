package com.semaphoretutorial;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class PhotoStudio {

	public static void main(String[] args) {
		

		Semaphore studio =new Semaphore(2);
		ExecutorService executor=Executors.newFixedThreadPool(2);
		
		executor.submit(new Student(studio,"Studio1"));
		executor.submit(new Student(studio,"Studio2"));
		executor.submit(new Student(studio,"Studio3"));
		executor.submit(new Student(studio,"Studio4"));
		executor.submit(new Student(studio,"Studio5"));
		executor.submit(new Student(studio,"Studio6"));
		
	}

}
