# Design Patterns - Project
<h2>Scenario</h2>
 "A student wants to buy a car. He would like to buy the newest car available that he can afford.
 So the student needs the help from a car salesman to pick the best choice."
  <h1>Proxy</h1>  
  Through a class CarSalesman we decide which car is the best option for the student
 <h1>Observer</h1> 
 After one car is bought, we need to ensure that it isn't available for others clients.
 The CarSalesman will be the observer and the cars will be ObservedSubject so he could change the availability of a car.

