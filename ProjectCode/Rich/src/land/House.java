package land;

import javax.swing.JButton;


import user.Player;

public class House extends JButton{
	private Player belongTo=null;//������
	private Lever lever=null;//���Ӽ���
	private int position;//λ��
	private int price;//�����۸�
	private boolean isTicket=false;//�Ƿ����ṩ�ㄻ�ض�
	
	public House(int position,int price){
		this.position=position;
		this.price=price;
	}
	
}
