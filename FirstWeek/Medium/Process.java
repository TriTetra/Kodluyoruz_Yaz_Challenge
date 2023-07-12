package FirstWeek.Medium;

import java.util.HashMap;
import java.util.Map;
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
        value = scanner.nextLine();
        value = value.replaceAll("\\s+","");  // Boşlukları kaldırıyoruz
        return value;
    }

    public String checkValue(){
       String input = getInput();

       for (int i = 0; i < input.length(); i++){
           // Burada indexte hangi cachr var ona bakıyoruz
           char currentChar = input.charAt(i);
           int count = 0;

           for (int j = 0; j < input.length(); j++){
               // Son döngüdeki karakterler burada da tekrardan döndürülüyor ve i charı ile aynı mı bakılıyor aynı ise +1
               if (input.charAt(j) == currentChar){
                   count++;
               }
           }

           if (count > maxCount){
               maxCount = count;
               mostRepeatedCharacter = currentChar;
           }

       }

        if (mostRepeatedCharacter != null){
            letter="En çok tekrar eden harf "+mostRepeatedCharacter+", tekrar sayısı "+maxCount;
        }else {
            letter="Tekrar eden harfler yoktur..";
        }

        return letter;

        /*

        2.YÖNTEMMM

        Map<Character,Integer> characterCountMap = new HashMap<>();
        for(char c : input.toCharArray()){
            characterCountMap.put(c,characterCountMap.getOrDefault(c,0)+1);
        }

        for (Map.Entry<Character,Integer> entry : characterCountMap.entrySet()){
            char currentChar = entry.getKey();
            int count = entry.getValue();

            if (count > maxCount){
                maxCount = count;
                mostRepeatedCharacter = currentChar;
            }
        }

        if (mostRepeatedCharacter != null){
            letter="En çok tekrar eden harf "+mostRepeatedCharacter+", tekrar sayısı "+maxCount;
        }else {
            letter="Tekrar eden harfler yoktur..";
        }

        return letter;

         */
    }
}
