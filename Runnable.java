public class ParsingTask implements Runnable {
    private final String url;
    private final int orderNumber;

    public ParsingTask(String url, int orderNumber) {
        this.url = url;
        this.orderNumber = orderNumber;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println("[" + threadName + "] – порядковый номер: " + orderNumber);
    }
}