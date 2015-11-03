package com.hephec.dp.singletonPattern;

public class SingletonPatternTest {

	static SingleObject object1 = SingleObject.getInstance();
    static SingleObject object2 = SingleObject.getInstance();
      
	
	public static void main(String[] args){
		  //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      //Get the only object available
	    
	      System.out.println(object1==object2);
	      //show the message
	      object1.showMessage();
	      
	      new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 100000; i++) {
					object1=SingleObject.getInstance();
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					object2=SingleObject.getInstance();
					System.out.println(object2==object1);
				}
			
			}
		}).start();
	     
	      new Thread(new Runnable() {
				@Override
				public void run() {
					for (int i = 0; i < 100000; i++) {
						object1=SingleObject.getInstance();
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
						object2=SingleObject.getInstance();
						System.out.println(object1==object2);
					}
				}
			}).start();
	}
}
