void main (){
  final car = Car();

  car.accelerate();
  print(car.numberOfWheels);


}


 class Vehicles{
  void accelerate(){
    print("Vehicle is Accelerating, yipeee");
  }
  int numberOfWheels = 10;

}

class Car extends Vehicles{
 
  void accelerate(){
    print("Car is Accelerating");
  }

  int numberOfWheels = 4;
}
// class Truck implements Vehicles{

  
//}