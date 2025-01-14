#include <iostream>


int main(){
    double balance = 10000;
    int choice;
    double depositAmount = 0;
    double withdrawAmount = 0;
    double pocketWallet = 0;
    bool ifContinue = true;
    std::string anotherAction;
    
    std::cout << "How much money do you have in your pocket/Wallet? ";
    std::cin >> pocketWallet;



    while(ifContinue == true){
        

        std::cout << "What would you like to do? Would you like to \n 1. Deposit Money \n 2. Withdraw Money \n 3. Check Bank Balance \n 4. Check pocket/Wallet Balance \n Please input a number between 1 and 4: ";
        std::cin >> choice;

        switch(choice){
            case 1:
                std::cout << "How much money would you like to deposit?: ";
                std::cin >> depositAmount;
            
                if((depositAmount<=pocketWallet) && (depositAmount>0)){
                    balance = balance + depositAmount; 
                    pocketWallet = pocketWallet - depositAmount; 
                    std::cout << "You now have " << balance << "$ in your bank account and " << pocketWallet << "& in your pocket/Wallet." << std::endl;
            
                }else{
                    std::cout << "You dont have enough money on you to deposit that much. \n";
                    depositAmount = 0;
                }

                break;

            case 2:
                std::cout << "How much money would you like to withdraw?: ";
                std::cin >> withdrawAmount;

                if((withdrawAmount <= balance) && withdrawAmount>0){
                    balance = balance - withdrawAmount;
                    pocketWallet = pocketWallet + withdrawAmount;
                    std::cout << "You now have " << balance << "$ in your bank account and " << pocketWallet << "$ in your pocket/Wallet." << std::endl;
                
                }else{
                    std::cout << "You dont have enough in your bank to withdraw that much. /n";
                }
                
                break;
        
            case 3:
                std::cout << "Your current balance is: " << balance << std::endl;
                break;
        
            case 4:
                std::cout << "Your current pocketWallet balance is: " << pocketWallet << std::endl;
                break;

        }
    
        std::cout << "Would you like to do another action?: (Yes / No) ";
        std::cin >> anotherAction;
    
      while(1==1){  
        
        if(anotherAction == "yes" || anotherAction == "Yes"){
            ifContinue = true;
            break;
        }else if(anotherAction == "No" || anotherAction == "no"){
            ifContinue = false;
            break;
        }else{
            std::cout << "Please input a valid response." << std::endl;
            std::cout << "Would you like to do another action?: (Yes / No) ";
            std::cin >> anotherAction;
        }
      }    

    }

    std::cout << "Thank you for using our services today";

    return 0;

}