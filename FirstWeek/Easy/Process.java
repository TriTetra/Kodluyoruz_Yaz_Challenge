package FirstWeek.Easy;

import java.time.Year;
import java.util.Scanner;

public class Process {
    private Scanner scanner;
    private int input;
    private Year currentYear;

    public Process() {
        this.scanner = new Scanner(System.in);
        this.currentYear = Year.now();
    }

    public String takeInput() {
        input = scanner.nextInt();
        int modifiedInput = currentYear.getValue() - input;
        int inputCount = String.valueOf(modifiedInput).length();
        String letter;

        if (inputCount == 4) {
            letter = "Doğduğunuz yıl " + modifiedInput;
        } else if (inputCount == 2) {
            letter = "Yaşınız " + modifiedInput;
        } else {
            letter = "Tekrar deneyiniz";
        }
        return letter;
    }
}
