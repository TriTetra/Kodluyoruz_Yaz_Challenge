package ThirdWeek.Medium;

import java.util.Scanner;

public class process {

    private Scanner scanner;
    private String input;

    public process(){
        this.scanner = new Scanner(System.in);
    }

    public String enterValue(){
        input = scanner.nextLine().toUpperCase();
        return input;
    }
}
