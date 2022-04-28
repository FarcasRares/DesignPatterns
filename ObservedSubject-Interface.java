public interface ObservedSubject{
	void update(boolean status);
	void update(int amount);
	int getYear();
	boolean getAvailable();
	int getPrice();

}
