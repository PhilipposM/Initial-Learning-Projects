import java.util.ArrayList;
import java.util.List;

public class Match extends Tournament {

    static void startMatches() {
        System.out.println("\n__________________________________________\nSTARTING MATCHES\n__________________________________________\n");

        for (int i = 0; i < WeightClasses.weightClassList.length; i++) {
            System.out.println("\nMatches from weight class " + (i + 1) + ":\n__________________________________________\n");

            List<Wrestler> wrestlers = new ArrayList<>();
            for (int j = 0; j < WeightClasses.weightClassList[i].length; j++) {
                if (WeightClasses.weightClassList[i][j] != null) {
                    wrestlers.add(WeightClasses.weightClassList[i][j]);
                }
            }

            while (wrestlers.size() > 1) {
                List<Wrestler> winners = new ArrayList<>();
                for (int j = 0; j < wrestlers.size(); j += 2) {
                    if (j + 1 < wrestlers.size()) {
                        Wrestler winner = fight(wrestlers.get(j), wrestlers.get(j + 1));
                        winners.add(winner);
                    } else {
                        winners.add(wrestlers.get(j));
                    }
                }
                wrestlers = winners;
            }

            if (!wrestlers.isEmpty()) {
                System.out.println("Winner of weight class " + (i + 1) + ": " + wrestlers.get(0).name + "\n");
            }
        }
    }

    static Wrestler fight(Wrestler w1, Wrestler w2) {
        System.out.println(w1.name + " vs " + w2.name);
        Wrestler winner;
        if (w1.strength > w2.strength) {
            winner = w1;
            w1.wins++;
        } else {
            winner = w2;
            w2.wins++;
        }
        System.out.println("Winner: " + winner.name + "\n");
        return winner;
    }

    
}








