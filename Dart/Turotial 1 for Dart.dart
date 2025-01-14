import 'dart:math';

void main(){
   print(Constants.greeting);
   print(Constants.giveMeANumber());







  
}

class Constants{
   int height = 10;
  
   static String greeting = "Hello, how are you?";

   static int giveMeANumber(){
     return Random().nextInt(20);
   }

}