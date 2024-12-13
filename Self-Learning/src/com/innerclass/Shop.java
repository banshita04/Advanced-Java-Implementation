package com.innerclass;


public class Shop {
	Lock lock = new Lock();
	
	public void shopStatus() {
		if(lock.isLocking()) {
			System.out.println("Shop is closed");
		}else {
			System.out.println("Shop is open");
		}
	}
	
	
	
	public Lock getLock() {
		return lock;
	}

	public class Lock{
		private boolean locking = true;

		public boolean isLocking() {
			return locking;
		}

		public void setLocking(boolean locking) {
			this.locking = locking;
		}
		
	}
}
