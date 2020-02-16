package less7;

class Mine
{
    private volatile int counter = 1000;
    private int production = 3;
    
    //��� ����� � 1000 ��������
    
    
    public synchronized void increaseCounter() {
    	//����� ������� ��������� �� ����� ������ �� 3 �����
    		counter = counter-production;
    }
    
    public int getCounter() {
    	if (counter>0) {
    		return counter;
    	}else return 0;
    }

}