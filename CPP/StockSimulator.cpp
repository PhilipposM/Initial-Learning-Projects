#include <iostream>
#include <string>

int main() {
   std::string word;
   std::string target;  // The letter you're searching for
   int triesLeft = 6;
   

   std::cout << "Please enter the word to guess: ";
   std::cin >> word;

   std::cout << "Please give the device to your partner \n";


   while(triesLeft > 0){
      std::cout << "What letter would you like to try?";
      std::cin >> target; 

      if(target == word){
         std::cout << "Thats correct! You got the word with " << triesLeft << " tries left \n";
         break;

      }else if (word.find(target) != std::string::npos) {
         std::cout << "The word contains the letter '" << target << "'." << std::endl;
      
      } else {
         std::cout << "The word does not contain the letter '" << target << "'." << std::endl;
         triesLeft--;
      }

   }




    return 0;
}