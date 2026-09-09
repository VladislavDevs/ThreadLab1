public class ParsingThread extends Thread {
    private final String url;
    private final int orderNumber;

    public ParsingThread(String url, int orderNumber) {
        super("ParserThread-" + orderNumber); // задаём имя через конструктор
        this.url = url;
        this.orderNumber = orderNumber;
    }

    @Override
    public void run() {
        System.out.println("[" + getName() + "] – порядковый номер: " + orderNumber);
        // логика парсинга...
    }
}