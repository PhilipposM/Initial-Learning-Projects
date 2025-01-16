@SuppressWarnings("unused")
public class Tournament {
    
     static final int NUMBER_OF_TEAMS = 3;
     static final int NUMBER_OF_WRESTLERS_PER_TEAM = 2;
     static  int[] totalTeamWins = new int[NUMBER_OF_TEAMS];
   


     static void displayTeamsAndAttributes(){
          System.out.println("__________________________________________ \n Teams and their attributes: \n__________________________________________\n \n \n");

        calculateTeamsWins();

          for(int i = 0; i < NUMBER_OF_TEAMS; i++){
               System.out.println("Team " + (i +1) + ":" + " - Score: " + totalTeamWins[i] + "\n________________________\n");

               for(int j = 0; j < NUMBER_OF_WRESTLERS_PER_TEAM; j++){
                    System.out.println("Name: " + Teams.fullTeamsList[i][j].name +  ", Strength: " + Teams.fullTeamsList[i][j].strength + ", Weight: " + Teams.fullTeamsList[i][j].weight + ", Wins: " + Teams.fullTeamsList[i][j].wins);

                    System.out.println();
               }
               
               System.out.println();

          }

     }


     static void startTournament(){
          System.out.println("The tournament is starting in: ");
          for(int i = 0; i < 3; i++){
               try{
               Thread.sleep(1000);
               }catch(InterruptedException e){
                    e.printStackTrace();
               }
               System.out.println((3 - i) + "!");
          }
          
          try{
               Thread.sleep(1000);
               }catch(InterruptedException e){
                    e.printStackTrace();
               }

          System.out.println("The tournament has started!");
          System.out.println();
          System.out.println();

     }

    private static void calculateTeamsWins() {
        for(int i = 0; i < NUMBER_OF_TEAMS; i++){
            for(int j = 0; j < NUMBER_OF_WRESTLERS_PER_TEAM; j++){
                totalTeamWins[i] += Teams.fullTeamsList[i][j].wins;
            }
        }
    }
    









     
}
