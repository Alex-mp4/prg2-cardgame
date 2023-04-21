import javax.swing.*;

public class model {
    static rogue rogue;
    static archer archer;
    static shaman shaman;
    static barbarian barbarian;
    static amalgam amalgam;

    public static void main(String[] args) throws InterruptedException {
        String player1 = JOptionPane.showInputDialog("Pick your character");
        String player2 = JOptionPane.showInputDialog("Pick your character");
        getClass1(player1).brawl(getClass2(player2));
    }

    private static card getClass1(String player1) {
        if (player1.equals("rogue")) {
            return new rogue("Rogue", "Rogue", 20, 6, 6);
        }
        else if (player1.equals("archer")) {
            return new archer("Archer", "Archer", 25, 5, 4);
        }
        else if (player1.equals("shaman")) {
            return new shaman("Shaman", "Shaman", 15, 8, 3);
        }
        else if (player1.equals("barbarian")) {
            return new barbarian("Barbarian", "Barbarian", 35, 5, 2);
        }
        else {
            return new amalgam(player1, "Amalgamation", (int)Math.floor(Math.random() *(35 - 15 + 1) + 15), (int)Math.floor(Math.random() *(8 - 5 + 1) + 5), (int)Math.floor(Math.random() *(6 - 2 + 1) + 2));
        }
    }

    private static card getClass2(String player2) {
        if (player2.equals("rogue")) {
            return new rogue("Rogue", "Rogue", 20, 6, 6);
        }
        else if (player2.equals("archer")) {
            return new archer("Archer", "Archer", 25, 5, 4);
        }
        else if (player2.equals("shaman")) {
            return new shaman("Shaman", "Shaman", 15, 8, 3);
        }
        else if (player2.equals("barbarian")) {
            return new barbarian("Barbarian", "Barbarian", 35, 5, 2);
        }
        else {
            return new amalgam(player2, "Amalgamation", (int)Math.floor(Math.random() *(35 - 15 + 1) + 15), (int)Math.floor(Math.random() *(8 - 5 + 1) + 5), (int)Math.floor(Math.random() *(6 - 2 + 1) + 2));
        }
    }


}
