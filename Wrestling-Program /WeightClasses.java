@SuppressWarnings("unused")

public class WeightClasses extends Teams {

     static Wrestler[][] weightClassList = new Wrestler[4][(Tournament.NUMBER_OF_TEAMS * Tournament.NUMBER_OF_WRESTLERS_PER_TEAM)];
     
     static void seperateIntoWeightClasses(){
          
         

          int[] m = new int[4]; // Separate index for each weight class

          for(int i = 0; i  < Tournament.NUMBER_OF_TEAMS; i++){
               for(int j = 0; j < Tournament.NUMBER_OF_WRESTLERS_PER_TEAM; j++){
                    if(fullTeamsList[i][j].weight > 130){
                         weightClassList[3][m[3]] = fullTeamsList[i][j];
                         m[3]++; // Increment m to move to the next position in the weight class array
                    
                    }else if(fullTeamsList[i][j].weight > 110){
                         weightClassList[2][m[2]] = fullTeamsList[i][j];
                         m[2]++;
                    
                    }else if(fullTeamsList[i][j].weight > 90){
                         weightClassList[1][m[1]] = fullTeamsList[i][j];
                         m[1]++;
                    }else{
                         weightClassList[0][m[0]] = fullTeamsList[i][j];
                         m[0]++;
                    }
               }
          }
          
          //Tournament.displayWeightClassInformation();
     }

      
}
