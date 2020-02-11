package less07;

public class Cashier {

    private boolean open;
    private boolean free;

    public Cashier() {
        open = true;
        free = true;
    }

    public boolean isOpen() {
        return open;
    }

    public boolean isFree() {
        return free;
    }

    public synchronized void serveCustomer(Customer customer) {
        free = false;
        if (!open) {
            System.out.println("��� ����� �� ����� �����������!");
            return;
        }
        System.out.println("������������� ����������: " + customer.getName());
        RandomUtils.sleepRandomTime(3_000, 5_000);
        if (RandomUtils.rollTheDice(30)) {
            System.out.println("����� ���������!");
            open = false;
        }
        free = true;
    }
}
