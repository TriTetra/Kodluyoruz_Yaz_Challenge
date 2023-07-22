package ThirdWeek.Easy;

import java.util.Scanner;

public class process {

    private Scanner scanner;
    private Integer input;

    public process(){
        this.scanner = new Scanner(System.in);
    }

    public Integer enterInput(){
        input = scanner.nextInt();
        return input;
    }

    public boolean checkValue(){
        int value = enterInput();
        if (value <= 1){
            return false;
        }

        for (int i = 2; i <= value / 2; i++){
            if (value % i == 0){
                return false;
            }
        }

        return true;
    }

    public void output(){
        boolean output = checkValue();
        String word= "";
        if (!output){
            word = "Asal sayı değildir";
        }else {
            word = "Sayı asaldır";
        }
        System.out.println(word);
    }
}
