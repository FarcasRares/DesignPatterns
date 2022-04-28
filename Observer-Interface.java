public interface Observer {
	void register(ObservedSubject obj);
	void unregister(ObservedSubject obj);	
	void raisePrice(int amount);
}
