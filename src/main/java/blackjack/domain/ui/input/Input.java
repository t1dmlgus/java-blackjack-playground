package blackjack.domain.ui.input;

import java.util.Scanner;

public class Input {

    private Scanner scanner;

    public String inputPlayerName() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();

    }
}
