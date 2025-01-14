void main(){
  Animals cat = Cat();
  cat.sound();
  cat = Dog();
  cat.sound();


}


class Animals{
  void sound(){
    print("Animal makes sound");
  }

}

class Cat extends Animals{
 
  @override
  void sound(){
    print("Cat makes sound");
  }
}

class Dog extends Animals{
  @override
  void sound(){
    print("Dog makes sound");
  }
}

