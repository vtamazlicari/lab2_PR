package thread;

public class Thread2 extends Thread {
	 NotifyAllExample notifyAllExample;

	    Thread2(NotifyAllExample notifyAllExample){
	        this.notifyAllExample = notifyAllExample;
	    }

	    @Override
	    public void run() {

	        try{
	            synchronized (notifyAllExample) {

	                    while(notifyAllExample.status != 3){
	                        notifyAllExample.wait();
	                    }

	                    System.out.print("2 ");
	                    notifyAllExample.status = 3;
	                    notifyAllExample.notifyAll();
	                }

	        } catch (Exception e) {
	            System.out.println("Exception 2 :" + e.getMessage());
	        }
	    }
}
