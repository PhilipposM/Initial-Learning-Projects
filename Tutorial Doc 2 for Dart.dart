



void main(){
  Car car = Car();

  print(car.isTrue);


 

  

  
  

}

class OtherClass{
  int num = 23;
  bool isTrue = true;
}

class Vehicle extends OtherClass{
  int speed = 10;
  bool isEngineOn = false;
  
  void accelerate(){
    speed += 10;
  }
}

class Car extends Vehicle{
  int numOfWheels = 4;

  void printSomething(){
    print("This is a car");
  }
}

class Bike extends Vehicle{
  int numOfWheels = 2;

  void printSomething(){
    print("This is a bike");
  }
}

class Truck extends Vehicle{
  int numOfWheels = 6;

  void printSomething(){
    print("This is a truck");
  }
}

