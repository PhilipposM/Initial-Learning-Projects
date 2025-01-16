import java.util.*;

@SuppressWarnings("unused")
public class Wrestler extends Teams {

     //Atributes of each Wrestler:
     double strength;
     int weight;
     String name;
     int wins;

    //Constructor for the class:
    public Wrestler(double strength, int weight, String name, int wins) {
          this.strength = strength;
          this.weight = weight;
          this.name = name;
          this.wins = wins;
    }

    //List of used name indexes from the name pool below:
    static ArrayList<Integer> usedNameIndexes = new ArrayList <>();
     

    static String getUniqueWrestlerName(ArrayList<Integer> usedNameIndexes, String[] namePool) {
     int nameIndex;
     while (true) {
         nameIndex = (int) (Math.random() * namePool.length);

         if (usedNameIndexes.size() >= namePool.length) {
             usedNameIndexes.clear();
         }
         if (!usedNameIndexes.contains(nameIndex)) {
             usedNameIndexes.add(nameIndex);
             break;
         }
     }
     return namePool[nameIndex];
 } // End of getUniqueWrestlerName method


     


static String[] namePool = {
          "Himothy who is Him", "Germath the Great", "Grimm the Gruesome", "Balthazar the Bold",
          "Grendel the Gruesome", "Bob the Builder", "Sally the Sassy", "Gerald the Great",
          "Poo the Poop", "Boris the Brear", "Hector the Horrible", "Arak the Aggressor",
          "Borgar the Bold", "Cragnar the Crusher", "Draxxor the Destroyer", "Erythra the Enforcer",
          "Falkor the Fierce", "Grimnar the Great", "Harrek the Hunter", "Ironar the Invincible",
          "Jorvik the Juggernaut", "Kragar the Keeper", "Logan the Lionheart", "Magnar the Mighty",
          "Norgath the Nomad", "Oryk the Outlaw", "Pyrrhus the Powerful", "Quagnar the Quaker",
          "Ragnar the Ruthless", "Styrkar the Strong", "Torvak the Terrible", "Urgan the Unyielding",
          "Varkor the Vicious", "Wulfgar the Warlord", "Xanor the Xenial", "Yrgoth the Youngblood",
          "Zarok the Zealous", "Arthok the Annihilator", "Braknar the Brutal", "Caelrik the Conqueror",
          "Dolkar the Darkblade", "Elyra the Enduring", "Ferrek the Fearless", "Gragor the Grizzly",
          "Horvik the Hardened", "Izzar the Immortal", "Jorran the Javelin", "Kelnor the Kindred",
          "Lorvik the Lone Wolf", "Morken the Merciless", "Norvik the Navigator", "Orrik the Overlord",
          "Pyrrak the Prodigy", "Quarn the Quiet", "Rornak the Ravager", "Skorr the Savage",
          "Thalgar the Thunderous", "Urganth the Unstoppable", "Vrykoth the Vile", "Wyrran the Wanderer",
          "Xorvik the Xecutor", "Yorvan the Youthful", "Zorrak the Zenith", "Arynn the Avenger",
          "Bryllar the Boundless", "Craygar the Cold", "Drennar the Daring", "Elkar the Ender",
          "Freyn the Flame", "Grathar the Giant", "Haelvik the Harbinger", "Ingror the Invader",
          "Jyrrek the Joyless", "Karnak the Kind", "Leroth the Lethal", "Morvak the Magnificent",
          "Nyrgor the Nightstalker", "Orrag the Obliterator", "Pyrrel the Phantom", "Quenrik the Quester", 
          "Rynar the Reckless", "Storrik the Stalwart", "Tarnak the Tamer", "Urlar the Undaunted",
          "Vornak the Victor", "Wyrnth the Wrathful", "Xalrik the Xenophobe", "Yalgar the Yearning",
          "Zarvik the Zenithal", "Arazor the Ardent", "Bragnar the Burly", "Clorvik the Crimson",
          "Dragnar the Doomseeker", "Erynnar the Eternal", "Frogar the Frostborn", "Grorvik the Grim",
          "Halror the Herald", "Ingar the Infernal", "Jorlan the Just", "Kelthor the Keen",
          "Lorgar the Liberator", "Molrik the Mauler", "Nyrath the Nimble", "Orren the Overlord",
          "Pyrrith the Plunderer", "Quorvik the Quietus", "Rorath the Resolute", "Skalrik the Skullcrusher",
          "Tharnor the Thrasher", "Ulrik the Unbreakable", "Varnor the Venomous", "Wulfik the Wanderer",
          "Xarn the Xact", "Yorvik the Yearning", "Zolkar the Zealot", "Arthor the Astounding",
          "Brorvik the Beast", "Cragnar the Cruel", "Durkon the Defender", "Errik the Elder",
          "Fynrik the Furious", "Grothar the Greatfang", "Horron the Hammer", "Ironvik the Ironsoul",
          "Jorven the Judge", "Keldar the Kinsman", "Lynrik the Loyal", "Magnarok the Monumental",
          "Nyrren the Nightbringer", "Orrgar the Onslaught", "Pyrrnor the Purger", "Qorvik the Quicksilver",
          "Ragnarok the Raging", "Stygor the Stormborn", "Thoryn the Thunderer", "Ulven the Unwavering",
          "Vyrik the Vehement", "Wynrok the Wild", "Xennar the Xenith", "Yrnog the Yielder",
          "Zaroth the Zenith Blade"
};


}
