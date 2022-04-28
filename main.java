public class main {
	public static void main(String[] args) {
       Car car1=new Car("Ford","Focus",2007,2200,true);
       Car car2=new Car("Dacia","Logan",2005,1600,true);
       Car car3=new Car("Chevrolet","Colt",2008,2000,true);
       Car car4=new Car("Renault","Clio",2016,7000,true);
       Car car5=new Car("Volkswagen","Golf 5",2009,3500,true);
       Car car6=new Car("BMW","x5",2008,5500,true);
       
       CarSalesman Agent=new CarSalesman();
       Agent.register(car1);
       Agent.register(car2);
       Agent.register(car3);
       Agent.register(car4);
       Agent.register(car5);
       Agent.register(car6);
       
   //   Agent.raisePrice(500);
       
       Student stud1=new Student("Pop Claudiu",4000);
       Student stud2=new Student("Morar Narcis",8000);
       Student stud3=new Student("Popescu Vlad",2500);
       Student stud4=new Student("Oprea Catalin",2500);
       
       Car carForStud1=Agent.sellCar(stud1);
       Car carForStud2=Agent.sellCar(stud2);
       Car carForStud3=Agent.sellCar(stud3);
       Car carForStud4=Agent.sellCar(stud4);
       
       System.out.println(stud1+" bought "+carForStud1);
       System.out.println(stud2+" bought "+carForStud2);
       System.out.println(stud3+" bought "+carForStud3);
       System.out.println(stud4+" bought "+carForStud4);
	}
}
