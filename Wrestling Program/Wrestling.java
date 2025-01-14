
import java.util.ArrayList;
import java.util.Random;



public class Wrestling{
   public static void main(String[] args) {

      Teams[] teamsArray = new Teams[12];
      Teams team = new Teams();

      ArrayList <Integer> usedNameIndexes = new ArrayList <> ();
      
      String[] namePool = {"Himothy who is Him","Germath the Great", "Grimm the Gruesome", "Balthazar the Bold", "Grendel the Gruesome", "Bob the Builder", "Sally the Sassy", "Gerald the Great", "Poo the Poop", "Boris the Brear", "Hector the Horrible", "Arak the Aggressor", "Borgar the Bold", "Cragnar the Crusher", "Draxxor the Destroyer", "Erythra the Enforcer", "Falkor the Fierce", "Grimnar the Great", "Harrek the Hunter", "Ironar the Invincible", "Jorvik the Juggernaut", "Kragar the Keeper", "Logan the Lionheart", "Magnar the Mighty", "Norgath the Nomad", "Oryk the Outlaw", "Pyrrhus the Powerful", "Quagnar the Quaker", "Ragnar the Ruthless", "Styrkar the Strong", "Torvak the Terrible", "Urgan the Unyielding", "Varkor the Vicious", "Wulfgar the Warlord", "Xanor the Xenial", "Yrgoth the Youngblood", "Zarok the Zealous", "Arthok the Annihilator", "Braknar the Brutal", "Caelrik the Conqueror", "Dolkar the Darkblade", "Elyra the Enduring", "Ferrek the Fearless", "Gragor the Grizzly", "Horvik the Hardened", "Izzar the Immortal", "Jorran the Javelin", "Kelnor the Kindred", "Lorvik the Lone Wolf", "Morken the Merciless", "Norvik the Navigator", "Orrik the Overlord", "Pyrrak the Prodigy", "Quarn the Quiet", "Rornak the Ravager", "Skorr the Savage", "Thalgar the Thunderous", "Urganth the Unstoppable", "Vrykoth the Vile", "Wyrran the Wanderer", "Xorvik the Xecutor", "Yorvan the Youthful", "Zorrak the Zenith", "Arynn the Avenger", "Bryllar the Boundless", "Craygar the Cold", "Drennar the Daring", "Elkar the Ender", "Freyn the Flame", "Grathar the Giant", "Haelvik the Harbinger", "Ingror the Invader", "Jyrrek the Joyless", "Karnak the Kind", "Leroth the Lethal", "Morvak the Magnificent", "Nyrgor the Nightstalker", "Orrag the Obliterator", "Pyrrel the Phantom", "Quenrik the Quester", "Rynar the Reckless", "Storrik the Stalwart", "Tarnak the Tamer", "Urlar the Undaunted", "Vornak the Victor", "Wyrnth the Wrathful", "Xalrik the Xenophobe", "Yalgar the Yearning", "Zarvik the Zenithal", "Arazor the Ardent", "Bragnar the Burly", "Clorvik the Crimson", "Dragnar the Doomseeker", "Erynnar the Eternal", "Frogar the Frostborn", "Grorvik the Grim", "Halror the Herald", "Ingar the Infernal", "Jorlan the Just", "Kelthor the Keen", "Lorgar the Liberator", "Molrik the Mauler", "Nyrath the Nimble", "Orren the Overlord", "Pyrrith the Plunderer", "Quorvik the Quietus", "Rorath the Resolute", "Skalrik the Skullcrusher", "Tharnor the Thrasher", "Ulrik the Unbreakable", "Varnor the Venomous", "Wulfik the Wanderer", "Xarn the Xact", "Yorvik the Yearning", "Zolkar the Zealot", "Arthor the Astounding", "Brorvik the Beast", "Cragnar the Cruel", "Durkon the Defender", "Errik the Elder", "Fynrik the Furious", "Grothar the Greatfang", "Horron the Hammer", "Ironvik the Ironsoul", "Jorven the Judge", "Keldar the Kinsman", "Lynrik the Loyal", "Magnarok the Monumental", "Nyrren the Nightbringer", "Orrgar the Onslaught", "Pyrrnor the Purger", "Qorvik the Quicksilver", "Ragnarok the Raging", "Stygor the Stormborn", "Thoryn the Thunderer", "Ulven the Unwavering", "Vyrik the Vehement", "Wynrok the Wild", "Xennar the Xenith", "Yrnog the Yielder", "Zaroth the Zenith Blade"};

      for(int i = 0; i < teamsArray.length; i++){
         teamsArray[i] = new Teams();
         teamsArray[i].initializeTeams(usedNameIndexes, namePool);
      }//End of for loop



      outputWrestlerCharacteristics(teamsArray);

      

      

   }//End of public static void main


    static class Wrestlers{
      int id;
      int weight;
      double str;
      String team;
      int wrestlerWins;
      String name;

      

      Wrestlers(int id, int weight, double  str, String team, int wins, String name) {
         this.id = id;
         this.weight = weight;
         this.str = str;
         this.team = team;
         this.name = name;
      

      }//End of function   
      
      static String addWrestlerNames(ArrayList<Integer> usedNameIndexes, String[] namePool){
         int nameIndex;
         boolean nameIndexUsed = false;
         int nameIndexer = 0;
         
        

         

         while(true){
            nameIndex = (int) (Math.random() * namePool.length);

            if (usedNameIndexes.size() >= namePool.length) {
               usedNameIndexes.clear();
               //throw new IllegalStateException("No more unique names available in the name pool.");
           }


            if (!usedNameIndexes.contains(nameIndex)) {
               usedNameIndexes.add(nameIndex);
               break;
            }
            
            
         }//end of  While loop

         return namePool[nameIndex];

         
         

         
      }//End of function
   }//end of Class

     static class Teams{
         Wrestlers[] wrestlers = new Wrestlers[12];

         void initializeTeams(ArrayList<Integer> usedNameIndexes, String[] namePool){
            Random random = new Random();

            for(int i = 0; i < wrestlers.length; i++){

               wrestlers[i] = new Wrestlers(random.nextInt(100), random.nextInt(150), random.nextDouble(10), "Team", 0, Wrestlers.addWrestlerNames(usedNameIndexes, namePool));

            }//End of for loop
         }//End of function
      }//end of class

   class Tournament{
      int teamWins[] = new int[12];

      void calculateWins(Teams[] teamsArray, int[] wins){

         for(int i = 0; i < teamsArray.length; i++){

            for(int j = 0; j < teamsArray[i].wrestlers.length; j++){

               teamWins[i] += (teamsArray[i].wrestlers[j].wrestlerWins);

            }//End of inner for loop
         }//End of outer for loop
      }//End of function

      void seperateWeightClasses(Teams[] teamsArray, int weight){
         
      }

   }//End of class

   class Matches extends Tournament{
           

   }//End of class

   public static void outputWrestlerCharacteristics(Teams[] teamsArray) {
      for (int i = 0; i < teamsArray.length; i++) {
          System.out.println("Team " + (i + 1) + ":");
          for (Wrestlers wrestler : teamsArray[i].wrestlers) {
              String[] parts = wrestler.name.split(" the ");
              String characteristic = (parts.length == 2) ? parts[1] : "No characteristic provided";
              System.out.println("Name: " + wrestler.name + ", Characteristic: " + characteristic + ", Strength: " + wrestler.str + ", Weight: " + wrestler.weight + ", ID: " + wrestler.id + ", Wins: " + wrestler.wrestlerWins);
              System.out.println();
          }
          System.out.println();
      }
  }

   
   







}//End of public class Wrestling

