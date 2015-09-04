package user;

import java.util.List;

import daoju.Prop;
import land.House;

public class Player {
	private String name;//�������
	private int money;//�ֽ�
	private int position;//����·��λ��
	private List<House> myHouses;//����
	private int houseProperty;//����
	private List<Prop> props;//����
	private int stayRound;	//��ҽԺ��������ͣ���غ���
	private int ticket;//�ㄻ
	public Player(String name,int money){
		this.name=name;
		this.money=money;
		ticket=50;
		position=0;
	}
	
	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getHouseProperty() {
		return houseProperty;
	}
	public void setHouseProperty(int houseProperty) {
		this.houseProperty = houseProperty;
	}
	public int getTicket() {
		return ticket;
	}
	public void setTicket(int ticket) {
		this.ticket = ticket;
	}
	
}
