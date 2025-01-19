@SuppressWarnings("unused")
public class Tournament {
    
     static final int NUMBER_OF_TEAMS = 12;
     static final int NUMBER_OF_WRESTLERS_PER_TEAM = 12;
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
               Thread.sleep(1500);
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
    

    static void displayWeightClassInformation() {

     System.out.println("__________________________________________ \n Wrestlers seperated into weight classes: \n__________________________________________\n \n \n");

     for (int i = 0; i < 4; i++) {
          switch (i) {
              case 0 -> System.out.println("Weight Class " + (i + 1) + ": (70 - 90)  \n________________________\n");
              case 1 -> System.out.println("Weight Class " + (i + 1) + ": (91 - 110) \n________________________\n");
              case 2 -> System.out.println("Weight Class " + (i + 1) + ": (111 - 130)  \n________________________\n");
              case 3 -> System.out.println("Weight Class " + (i + 1) + ": (131 - 150)  \n________________________\n");
          }
      
          if (WeightClasses.weightClassList[i][0] == null) {
              System.out.println("This weight class is empty.\n");

          } else {
              for (int j = 0; j < WeightClasses.weightClassList[i].length; j++) {

                  try {
                      System.out.println("Name: " + WeightClasses.weightClassList[i][j].name + ", Weight: " +WeightClasses.weightClassList[i][j].weight + ", Strength: " + WeightClasses.weightClassList[i][j].strength);
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


static void displayTeamPointsAndWinner(){
     int highestPoints = -1;
     int pos = -1;
     calculateTeamsWins();

     System.out.println("\n__________________________________________\nThe Total Points Scoreboard is: \n__________________________________________\n");
     for(int i = 0; i < totalTeamWins.length; i++){
          System.out.println("Team " + (i + 1) + ": " + totalTeamWins[i] + " points");
     }

     for(int i = 0; i < totalTeamWins.length; i++){
          if(totalTeamWins[i] > highestPoints){
               highestPoints = totalTeamWins[i];
               pos = i;

          }

     
     }

     System.out.println("The final winner is Team " + (pos + 1) + " with " + totalTeamWins[pos] + " points." );
}







     
}
