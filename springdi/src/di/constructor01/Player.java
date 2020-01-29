package di.constructor01;

//Player�� ���� �ִ� Dice�� �ܺ�(spring �����̳�)���� Injection �޾� ����ؾ� ��
//> Injection ���� �� �ֵ��� �̸� �غ��ؾ� ��
//> Constructor or Setter �޼ҵ�
public class Player implements AbstractPlayer{
	AbstractDice d;
	int totalValue=0;
	
	public Player(AbstractDice d) {
		super();
		this.d = d;
		System.out.println("Player�� �Ű����� 1�� ������");
	}
	
	public void play(){
		totalValue=0;
		for (int i = 0; i < 3; i++) {
			totalValue+=d.getDiceValue();
		}
	}
	
	public int getTotalValue(){
		return totalValue;
	}
}