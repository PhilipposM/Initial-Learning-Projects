#include <iostream>

using namespace std;

int main (){
   int n;

   cout << "How big is your square? ";
   cin >> n;
   char border = '*';

   if(n <= 1){
      cout << "Please enter a number greater than 1." << endl;
      return 1;
   }

   for(int i = 1; i <= n; i++){
      if(i == 1 || i == n){
         cout << string(n, border) << "\n";
      }
      else{
         cout << border << string(n-2,'  ') << border << "\n";
      }
   }

   return 0;
}