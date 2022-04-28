# Design Patterns - Project
<h3>Scenario</h3>
 "A student wants to buy a car. He would like to buy the newest car available that he can afford.
 So the student needs the help from a car salesman to pick the best choice."
  <h5>Proxy</h5>  
  Through a class CarSalesman we decide which car is the best option for the student.
 <h5>Observer</h5> 
 After one car is bought, we need to ensure that it isn't available for others clients.
 The CarSalesman will be the observer and the cars will be ObservedSubject so he could change the availability of a car.

