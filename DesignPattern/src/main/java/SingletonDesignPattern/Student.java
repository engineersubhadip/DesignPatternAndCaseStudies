package SingletonDesignPattern;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Student {
	
	private static Student instance;
	private static Lock lock = new ReentrantLock();
	
	private Student() {
		
	}
	
	public static Student getInstance() {
		if (instance == null) {
			lock.lock();
			if (instance == null) {
				instance = new Student();
			}
			lock.unlock();
		}
		return instance;
	}
}
