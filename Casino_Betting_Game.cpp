#include <iostream>
#include <chrono>
#include <thread>
#include <string>
#include <cmath>
#include <ctime>
#include <cstdlib>


int main(){
   
      srand(time(0));
      int game;
      double money;

      //These are the Roulett variables
      int rouletGuess[36] = {};
      int betR;
      int rouletNum;
      int numGuesses;
      int moneyOR = money;
      bool won = false;

      //These are the BlackJack variables
      int bjSum = 0;
      int moneyOB = money;
      int betB;
      int card = 0;
      int cardComp;
      int compSum = 0;
      bool compAgain;
      std::string hitStand;

      //Play agian feature variables
      bool ifContinue = true;
      std::string playAgain;

      //Slots Variables
      int betS;
      int moneyOS;
      int slot1;
      int slot2;
      int slot3;
      int bonus = 0;
      std::string spinAnswer;

      bool spin = false;


      std::cout << "How much money have you broaght with you?: ";
      std::cin >> money;


   while(ifContinue == true && money > 0){

      std::cout << "What game would you like to play? \n 1. Roulette \n 2. Blackjack \n 3. Slots \n Please enter a number from 1 to 3: ";
      std::cin >> game;

      switch(game){
         
         case 1: // Roulette
            

            std::cout << "How many numbers would you like to bet on?: ";
            std::cin >> numGuesses;

            for(int j = 0; j < numGuesses; j++){
               std::cout << "What number would you like to place your money on? (0-34): ";
               std::cin >> rouletGuess[j];
            }
            
            
            std::cout << "How much money would you like to bet? ";
            std::cin >> betR;

            std::cout << "You have placed your bet on number/s ";  

            for(int i = 0; i < numGuesses; i++){
               std::cout << rouletGuess[i] << ", ";
            }

            std::cout << "and you bet " << betR << " dollars. \n";

            std::cout << "The wheel is spinning... \n";

            rouletNum = rand() % 36;

            for(int i = 3; i>0; i--){
               std::cout << i << "\n";
               std::this_thread::sleep_for(std::chrono::seconds(1));
            }

            std::cout << "The wheel landed on number " << rouletNum << "\n";

            for(int k = 0; k<=numGuesses; k++){
               if(rouletGuess[k] == rouletNum){
                  money = money + (betR/(numGuesses-1));
                  won = true;
               }
               
            }

            if(won == true){
               std::cout << "You Won!!! You got a payout of $" << money - moneyOR << "You now have $" << money << "\n" ;
            }

            if(!won){
               money = money - betR;
               std::cout << "You lost $" << betR << " and you now have $" << money << "\n";
            }

            break;
         
      case 2: // BlackJack
         std::cout << "How much money would you like to bet?: ";
         std::cin >> betB;

         bjSum = (rand() % 10) + 1;
         std::cout << "You now have a card sum of " << bjSum << "\n";

         do{
         std::cout << "Would you like to hit or stand?: ";
         std::cin >> hitStand;

         while(hitStand != "hit" && hitStand != "Hit" && hitStand != "stand" && hitStand != "Stand"){
               std::cout << "Invalid input. Please enter hit or stand. ";
               std::cin >> hitStand;
            }

         if(hitStand == "hit" || hitStand == "Hit"){
            card = (rand() % 10) + 1;
            bjSum += card;
            std::cout << "You now have a card sum of " << bjSum << "\n";
         }

         }while(hitStand == "hit" || hitStand == "Hit");

         std::cout << "Your final card sum is " << bjSum << "\n";

         if(bjSum > 21){
            money = money - betB;
            std::cout << "You busted! You lost $" << betB << " and you now have $" << money << "\n";
         
         }else if(bjSum == 21){
            money = money + betB;
            std::cout << "You got a blackjack! You won $" << betB <<  "and now you have" << money << "\n";
         
         }else{
            compSum = (rand() % 10) + 1;
            do{
               cardComp = rand() % 10 + 1;
               compSum += cardComp;

               if(compSum > 17){
                  compAgain = false;
               }else{
                  compAgain = true;
               }
            
            }while(compAgain == true);


            if(compSum > 21){
               money = money + betB;
               std::cout << "The dealer busted! You won $" << betB << " and now you have $" << money << "\n";

            }else if(compSum > bjSum){
               money = money - betB;
               std::cout << "The dealer's card sum is higher than yours at " << compSum << "." <<  "You lost $" << betB << " and now you have $" << money << "\n";
            
            }else if(compSum < bjSum){
               money = money + betB;
               std::cout << "Your card sum is higher than the dealer's, who got " << compSum << ". You won $" << betB << " and now you have $" << money << "\n";
            
            }else if(compSum == bjSum){
               std::cout << "It's a tie! You get your bet back. You now have $" << money << "\n";
            }
         }
      
         break;
      
      
      case 3: //slots
      
         std::cout << "How much would you like to bet?: ";
         std::cin >> betS;


         do{
           

            slot1 = rand() % 3 + 1;
            slot2 = rand() % 3 + 1;
            slot3 = rand() % 3 + 1;

            std::cout << "##################################\n";
            std::cout << "############## " << slot1 << " " << slot2 << " " << slot3 << " ##############\n";
            std::cout << "##################################\n";

            if(slot1 == slot2 && slot2 == slot3){
               if(bonus > 20){
                  money = money + (betS) * 50;
               }else if(bonus>10){
                  money = money + (betS) * 5;
               }else if(bonus > 5){
                  money = money + (betS) * 2;
               }else{
                  money = money + betS;
               }
               std::cout << "You won! You now have $" << money << "\n";
               
               
               
            }else{
               money = money - betS;
               std::cout << "You lost! You now have $" << money << "\n";
            }

            bonus++;

            std::cout << "Would you like to spin or walk away? ";
            std::cin >> spinAnswer;

            if(spinAnswer == "spin" || spinAnswer == "Spin"){
               spin = true;
         
            }else if(spinAnswer == "walk away" || spinAnswer == "Walk away" || spinAnswer == "away" || spinAnswer == "Away" || spinAnswer == "Walk Away" || spinAnswer == "walk" || spinAnswer == "Walk"){
               spin = false;
               break;
         
            }

         }while(spin == true && money > 0);
         
         break;
         
      }

      std::cout << "Would you like to play another game? ";
      std::cin >> playAgain;

      while(1==1){
         if (playAgain == "yes" || playAgain == "Yes" || playAgain == "y" || playAgain == "Y"){
            ifContinue =  true;
            break;

         }else if(playAgain == "no" || playAgain == "No" || playAgain == "n" || playAgain == "N"){
            ifContinue = false;
            break;

         }else{
            std::cout << "Would you like to play another game? ";
            std::cin >> playAgain;
         }

      }


   }

   if(money <= 0){
      std::cout << "You ran out of money! The loan sharks will be after you.  We hope you survive and have a pleasant afternoon. \n";
   }

   return 0;
}