public class Student {
	String name;
	int money;
	Student(){
		this.name="";
		this.money=0;
	}
	Student(String name,int money){
		this.name=name;
		this.money=money;
	}
	void setName(String name) {
		this.name=name;
	}
	void setMoney(int money) {
		this.money=money;
	}
	String getName() {
		return this.name;
	}
	int getMoney() {
		return this.money;
	}
	@Override
	public String toString(){
		return "Student "+this.name+" , money: "+this.money;
		
	}
}
