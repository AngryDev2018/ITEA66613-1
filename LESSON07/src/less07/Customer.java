package less07;

public class Customer implements Runnable {

    private String name;
    private Supermarket supermarket;

    public Customer(String name, Supermarket supermarket) {
        this.name = name;
        this.supermarket = supermarket;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        Cashier cashier = null;
        while (cashier == null) {
            try {
                cashier = supermarket.getFreeCashier();
            } catch (Exception e) {
                System.out.println(name + ": ������� ������!");
            }
            if (cashier == null) {
                System.out.println(name + ": ��� ��������� ����! ��������!");
            }
            RandomUtils.sleepRandomTime(300, 1000);
        }
        cashier.serveCustomer(this);
    }
}
