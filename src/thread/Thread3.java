package thread;

public class Thread3 extends Thread {
    NotifyAllExample notifyAllExample;

    Thread3(NotifyAllExample notifyAllExample){
        this.notifyAllExample = notifyAllExample;
    }

    @Override
    public void run() {

        try{
            synchronized (notifyAllExample) {

                    while(notifyAllExample.status != 1){
                        notifyAllExample.wait();
                    }

                    System.out.print("3 ");
                    notifyAllExample.status = 3;
                    notifyAllExample.notifyAll();

            }
        } catch (Exception e) {
            System.out.println("Exception 3 :" + e.getMessage());
        }
    }
}
