package less7;

public class Main 
{
    public static void main(String[] args) {
    	Mine working = new Mine();
        for(int i=1; i<6; i++) {
            Thread ct = new Thread(new WorkingThread(working, "������� � " + i));
            ct.setName("������� � " + i);
            System.out.println("�� ������ ������� " + ct.getName());
            ct.start();    
            System.out.println("���������� �������: " + Thread.activeCount());
        try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
        }
    }
}