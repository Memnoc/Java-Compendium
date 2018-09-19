package Classes.Encapsulation;

import javafx.application.Platform;

public class Main {

    public static void main(String[] args) {

        Player playerOne = new Player("Matteo", 100, 100);
        playerOne.damage(100);
        playerOne.cure(1);

    }
}
