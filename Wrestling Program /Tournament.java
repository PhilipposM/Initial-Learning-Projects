
@SuppressWarnings("unused")
public class Tournament {
    
     static final int NUMBER_OF_TEAMS = 3;
     static final int NUMBER_OF_WRESTLERS_PER_TEAM = 2;
   static  int[] totalTeamWins = new int[NUMBER_OF_TEAMS];


     static void displayTeamsAndAttributes(){
          for(int i = 0; i < NUMBER_OF_TEAMS; i++){
               for(int j = 0; j < NUMBER_OF_WRESTLERS_PER_TEAM; j++){
                    totalTeamWins[i] += Teams.fullTeamsList[i][j].wins;
               }
          }

          for(int i = 0; i < NUMBER_OF_TEAMS; i++){
               System.out.println("Team " + (i +1) + ":" + " - Score: " + totalTeamWins[i]);

               for(int j = 0; j < NUMBER_OF_WRESTLERS_PER_TEAM; j++){
                    System.out.println("Name: " + Teams.fullTeamsList[i][j].name +  ", Strength: " + Teams.fullTeamsList[i][j].strength + ", Weight: " + Teams.fullTeamsList[i][j].weight + ", Wins: " + Teams.fullTeamsList[i][j].wins);

                    System.out.println();
               }
               
               System.out.println();

          }









     }


    









     
}
