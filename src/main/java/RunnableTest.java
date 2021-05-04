public class RunnableTest {
    public static void main(String[] args) {
        new RunnableTest().goOn();
    }

    private void goOn() {
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("ABC");
            }
        };
        Thread d = new Thread(r);
        d.start();
//        d.start();
    }
}
