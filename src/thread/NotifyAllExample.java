package thread;

public class NotifyAllExample {
    int status = 1;
    public static void main(String[] args) {

        NotifyAllExample notifyAllExample = new NotifyAllExample();

        Thread1 a = new Thread1(notifyAllExample);
        Thread2 b = new Thread2(notifyAllExample);
        Thread3 c = new Thread3(notifyAllExample);

        a.start();
        b.start();
        c.start();
    }

}
