package com.semaphoretutorial;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class PhotoStudio {

	public static void main(String[] args) {
		
		Semaphore studio =new Semaphore(2);
		ExecutorService executor=Executors.newFixedThreadPool(2);
		
		executor.submit(new Student(studio,"Student1"));
		executor.submit(new Student(studio,"Student2"));
		executor.submit(new Student(studio,"Student3"));
		executor.submit(new Student(studio,"Student4"));
		executor.submit(new Student(studio,"Student5"));
		executor.submit(new Student(studio,"Student6"));
		
	}
}
