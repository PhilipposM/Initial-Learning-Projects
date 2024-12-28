#include <iostream>
#include <chrono>
#include <thread>
#include <string>
#include <cmath>
#include <ctime>
#include <cstdlib>




int main(){
     
     //Random number seed
     srand(time(0));
    
    //Variable Initialization
    int hours;
    int job;
    double salary = 1000.00;
    int sickDays;
    
    std::string stocksYN;
    double stockOptions;
    
    double growthRate;
    int yearsToInvest;

    std::string usernameC;
    std::string passwordC;
    std::string passwordE;
    std::string usernameE;
    int wrong = 0;

    
    //Password Creation
    std::cout << "Please create your username: ";
    std::cin >> usernameC;
    std::cout << "Please create your password: ";
    std::cin >> passwordC;

    
    //Logging in
    while(1==1){
        std::cout << "Please enter your username to log in: " ;
        std::cin >> usernameE;
        
        if(usernameE==usernameC){
            std::cout << "Please enter your password to log in: ";
            std::cin >> passwordE;
        
            if(passwordE == passwordC){
                break;
            }
        }
        

        wrong++;

        //Delay if password or username is incorrect
        if(wrong >= 3){
            std::cout << "Since you put in the password wrong 3 times, you will have to wait 7 seconds. \n";

            for (int i = 7; i > 0; --i) {
                
                std::cout << i << " seconds remaining \n";

                std::this_thread::sleep_for(std::chrono::seconds(1));
            }

        }

        wrong = 0;
    }

    //Finds how many hours you have worked and adds to your weekly salary   
    std::cout << "How Many hours have You worked this week?: ";
    std::cin >> hours;

    //Forces you to enter a valid number
    while(1==1){
        if(hours > 0){
            break;
        }else {
            std::cout << "How Many hours have You worked this week?: ";
            std::cin >> hours;
        }
    }
        
   
    
    //Checks what Job Position you occupy
    std::cout << "What job position are you?  Please enter a number between 1 and 4: \n 1. Manager \n 2. Assistant Manager \n 3. Mid-level Employee \n 4. Entry-level Employee: ";
    std::cin >> job;


    //Aplies the appropriate salary for your job
    switch (job){
        case 1:
            salary = 3000;
            if(hours > 40){
                salary += 1000;
            }else{
                salary += 500;
            }
            break;
        
        case 2:
            salary = 2500;
            if(hours > 40){
                salary += 750;
            }else{
                salary += 350;
            }
            break;

        case 3:
            salary = 2000;
            if(hours > 40){
                salary += 500;
            }else{
                salary += 250;
            }
            break;

        case 4:
            salary = 1500;
            if(hours > 40){
                salary += 250;
            }else{
                salary += 100;
            }
            break;
    }

    //Checks how many days off you have had
    std::cout << "How many days off have you taken this week?: ";
    std::cin >> sickDays;

    //Removes $100 from your salary for every day you have taken off
    salary -= sickDays * 100;

    //Asks the user if they want stock options
    std::cout << "Would you like to take part salary into stock options?: ";
    std::cin >> stocksYN;

    if(stocksYN == "yes" || stocksYN == "Yes"){
        std::cout << "Your salary is currently at: $" << salary << "\n";
        std::cout << "How much would you like to take in stock options?: ";
        std::cin >> stockOptions;
        std::cout << "How many years would you like to invest in the company for?: ";
        std::cin >> yearsToInvest;
        while(1==1){ 
            if(stockOptions <= salary){
                salary = salary - stockOptions;
                std::cout << "You have taken " << stockOptions << " in stock options. And your take-home salary is $" << salary << "\n";
                break;
            
            }else{
                std::cout << "You cannot take more than your salary in stock options.";
                std::cout << "How much would you like to take in stock options?: ";
                std::cin >> stockOptions;
            }
        }
    }else{
        std::cout << "You have chosen not to take part in stock options so you will receive just a salary of " << salary;
    }


    //Invests with a random growth rate for a number of years the user has inputted
    for (int i = 0; i < yearsToInvest; i++) {
        growthRate = (rand() % 10 + 1) / 10.0;
        stockOptions += stockOptions * growthRate; 
        
    }

    //Returns your final salary and stock options
    std::cout << yearsToInvest << " years have passed and your stock options have grown to: $" << stockOptions << " and your take home salary is: $" << salary << "\n";




    return 0;
}