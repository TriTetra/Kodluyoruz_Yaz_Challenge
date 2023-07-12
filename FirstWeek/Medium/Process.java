package FirstWeek.Medium;

import java.util.Scanner;

public class Process {

    private Scanner scanner;
    private String value;
    private Integer maxCount = 0;
    private Character mostRepeatedCharacter = null;
    private String letter;

    public Process(){
        this.scanner = new Scanner(System.in);
    }

    public String getInput(){
        value = scanner.next();
        value = value.replaceAll("\\s+","");  // Boşlukları kaldırıyoruz
        return value;
    }

    public String checkValue(){
        for (int i = 0; i < getInput().length(); i++){
            char currentChar = getInput().charAt(i);
            int count = 0;

            for (int j = 0; j < getInput().length()+1; j++){
                if (getInput().charAt(j) == currentChar){
                    count++;
                }
            }

            if (count > maxCount){
                maxCount = count;
                mostRepeatedCharacter = currentChar;
            }
        }

        if (mostRepeatedCharacter != null){
            letter = "En çok tekrar eden karakter "+mostRepeatedCharacter+" tekrar sayısı "+maxCount;
        }else {
            letter = "Metinde tekrar eden harf yoktur..";
        }

        return letter;
    }
}
