package thread;

public class Thread1 extends Thread {
    NotifyAllExample notifyAllExample;

    Thread1(NotifyAllExample notifyAllExample){
        this.notifyAllExample = notifyAllExample;
    }

    @Override
    public void run() {

        try{
            synchronized (notifyAllExample) {

                    while(notifyAllExample.status != 3){
                        notifyAllExample.wait();
                    }

                    System.out.print("1 ");
                    notifyAllExample.status = 3;
                    notifyAllExample.notifyAll();
                }
        } catch (Exception e) {
            System.out.println("Exception 1 :" + e.getMessage());
        }

    }
}
