import java.util.Random;

@SuppressWarnings("unused")
public class Teams {

     
     
    static Wrestler[][] fullTeamsList = new Wrestler[Tournament.NUMBER_OF_TEAMS][Tournament.NUMBER_OF_WRESTLERS_PER_TEAM];

     static void initializeTeams(){
          Random random = new Random();

          for(int i = 0; i < Tournament.NUMBER_OF_TEAMS; i++ ){
               for( int j = 0; j < Tournament.NUMBER_OF_WRESTLERS_PER_TEAM; j++){
                    int id = random.nextInt(101);
                    int weight = random.nextInt(81) + 70; // Range: 70 to 150
                    double strength = 1 + (9 * random.nextDouble()); // Range: 1.0 to 10.0
                    int wins = 0;
                    String name = Wrestler.getUniqueWrestlerName(Wrestler.usedNameIndexes, Wrestler.namePool);
                    
                    if (name.equals("Himothy who is Him") || name.equals("Bob the Builder")) {
                        strength = 10;
                    }
                    
                    fullTeamsList[i][j] = new Wrestler(strength, weight, name, wins);  
               }//End of inner For loop
          }//End of outer for loop


     }//End of initialize teams function
     
















}
