package TaskOne;

import java.util.Scanner;

public class Task1 {
    public String func(String number){
        if(number == null) {
            throw new UnsupportedOperationException("Нельзя передавать null!!!");
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < number.length(); i++){
            if (number.charAt(i) == '6'){//
                result.append("9");
            }else if (number.charAt(i) == '9'){
                result.append("6");
            }else{
                result.append(number.charAt(i));
            }
        }
        if (number.equals(new StringBuilder(result.toString()).reverse().toString())){
            return "true";
        }else{
            return "false";
        }
    }
}