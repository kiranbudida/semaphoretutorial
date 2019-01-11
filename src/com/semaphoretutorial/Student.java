/**
 * 
 */
package com.semaphoretutorial;

import java.util.concurrent.Semaphore;

/**
 * @author Kindu
 *
 */
public class Student implements Runnable {

	/* (non-Javadoc)
	 * @see java.lang.Runnable#run()
	 */
	private Semaphore studio;
	private String name;
	
	public Student(Semaphore studio, String name ) {
		this.studio=studio;
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" is waiting to get an access to studio");
		try {
			studio.acquire();
			System.out.println(getName()+" is got an access to studio");
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		studio.release();
		System.out.println(getName()+" work has been finished");

	}

}
