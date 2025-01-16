@SuppressWarnings("unused")

public class WeightClasses {

     static Wrestler[][] weightClassList = new Wrestler[4][(Tournament.NUMBER_OF_TEAMS * Tournament.NUMBER_OF_WRESTLERS_PER_TEAM)];
     
     static void seperateIntoWeightClasses(){
          
          System.out.println("__________________________________________ \n Wrestlers seperated into weight classes: \n__________________________________________\n \n \n");

          int[] m = new int[4]; // Separate index for each weight class

          for(int i = 0; i  < Tournament.NUMBER_OF_TEAMS; i++){
               for(int j = 0; j < Tournament.NUMBER_OF_WRESTLERS_PER_TEAM; j++){
                    if(Teams.fullTeamsList[i][j].weight > 130){
                         weightClassList[3][m[3]] = Teams.fullTeamsList[i][j];
                         m[3]++; // Increment m to move to the next position in the weight class array
                    
                    }else if(Teams.fullTeamsList[i][j].weight > 110){
                         weightClassList[2][m[2]] = Teams.fullTeamsList[i][j];
                         m[2]++;
                    
                    }else if(Teams.fullTeamsList[i][j].weight > 90){
                         weightClassList[1][m[1]] = Teams.fullTeamsList[i][j];
                         m[1]++;
                    }else{
                         weightClassList[0][m[0]] = Teams.fullTeamsList[i][j];
                         m[0]++;
                    }
               }
          }
          
          for (int i = 0; i < 4; i++) {
               switch (i) {
                   case 0 -> System.out.println("Weight Class " + (i + 1) + ": (70 - 90)  \n________________________\n");
                   case 1 -> System.out.println("Weight Class " + (i + 1) + ": (91 - 110) \n________________________\n");
                   case 2 -> System.out.println("Weight Class " + (i + 1) + ": (111 - 130)  \n________________________\n");
                   case 3 -> System.out.println("Weight Class " + (i + 1) + ": (131 - 150)  \n________________________\n");
               }
           
               if (weightClassList[i][0] == null) {
                   System.out.println("This weight class is empty.\n");

               } else {
                   for (int j = 0; j < weightClassList[i].length; j++) {

                       try {
                           System.out.println("Name: " + weightClassList[i][j].name + ", Weight: " + weightClassList[i][j].weight + ", Strength: " + weightClassList[i][j].strength);
                           System.out.println();

                       } catch (NullPointerException e) {
                           // Handle null pointer exception
                       }
                   }
               }
               System.out.println();
               System.out.println();
           }
     }
}
