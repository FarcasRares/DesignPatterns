public class Car implements ObservedSubject{
	  String brand;
	  String model;
	  int year;
	  int price;
	  boolean available;
	  Car(){
		  this.brand="";
		  this.model="";
		  this.year=0;
		  this.price=0;
		  this.available=false;
	  }

	   Car(String brand, String model, int year, int price,boolean available) {
	    this.brand = brand;
	    this.model = model;
	    this.year = year;
	    this.price = price;
	    this.available=available;
	  }

	   String getBrand() {
	    return brand;
	  }

	   void setBrand(String brand) {
	    this.brand = brand;
	  }

	   String getModel() {
	    return model;
	  }

	   void setModel(String model) {
	    this.model = model;
	  }
	   void setAvailable(boolean available) {
		   this.available=available;
	   }
	   @Override
	   public boolean getAvailable(){
		   return this.available;
	   }
	   @Override
	   public int getYear() {
	    return year;
	  }

	   void setYear(int year) {
	    this.year = year;
	  }
	   @Override
	   public int getPrice() {
	    return price;
	  }

	   void setPrice(int price) {
	    this.price = price;
	  }
		public String toString(){
			if (this.brand!=null && this.model!=null && this.year!=0 && this.price!=0)
			{return "Car :"+this.brand +" Model :"+this.model+" Year :"+this.year+" Price :"+this.price;}
			else return "Nothing";
			
		}
		@Override
		public void update(boolean status)
		{
			this.available=status;
		}

		@Override
		public void update(int amount) {
			this.price=this.price+amount;
			
		}
	}
