import java.util.Arrays;

public class CarSalesman implements Observer{
	ObservedSubject[] allCars=new ObservedSubject[0];
	Car sellCar(Student student) {
		int budget=student.getMoney();
		Car bestOption=new Car();
		int latestYear=0;
		for(int i=0;i<this.allCars.length;i++)
		{
			
			if (this.allCars[i].getYear()>latestYear) {
				if (budget>=this.allCars[i].getPrice() && this.allCars[i].getAvailable()==true)
				{
					
				bestOption=(Car) this.allCars[i];
				latestYear=this.allCars[i].getYear();
					
				}
			}
		}
		for(int i=0;i<this.allCars.length;i++)
		{
			if (this.allCars[i].equals(bestOption))
			{
			  this.allCars[i].update(false);
			  this.unregister(allCars[i]);
			}
		}
		
		return bestOption;	
	}
	@Override
	public void register(ObservedSubject obj) {
		this.allCars=Arrays.copyOf(this.allCars, this.allCars.length+1);
		this.allCars[this.allCars.length-1]=obj;
		
	}
	@Override
	public void unregister(ObservedSubject obj) {
		 int index = -1;
	        for (int i = 0; i < this.allCars.length; i++) {
	            if (this.allCars[i].equals(obj)) {
	                index = i;
	                break;
	            }
	        }
	        System.arraycopy(this.allCars, index + 1, this.allCars, index, this.allCars.length - 1 - index);

		
	}
	@Override
	public void raisePrice(int amount) {
		for(int i=0;i<this.allCars.length;i++)
		{
			this.allCars[i].update(amount);
		}
		
	}
}
