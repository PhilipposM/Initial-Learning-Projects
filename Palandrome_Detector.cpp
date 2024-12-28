#include <iostream>

int main(){
    int num;
    int numOriginal;
    bool isPal;
    int reversed = 0; // Initialize reversed to 0
    int digit;

    std::cout << "Please enter a number you would like to check for Palindromeness: ";
    std::cin >> num;

    numOriginal = num;

    if(num < 0){
        std::cout << "The number is not a Palindrome.";
    } else {
        while(num > 0){
            digit = num % 10; // Use the local digit variable
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        if(numOriginal == reversed){
            std::cout << "The number is a Palindrome. \n";
        } else {
            std::cout << "The number is not a Palindrome. \n";
        }
    }

    return 0;
}