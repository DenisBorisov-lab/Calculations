package Tests;

import java.util.Collections;

public class Test {
    public static void main(String[] args) {
        int[] list = {1, 2, 1};
        int max = 0;
        for (int i = 0; i < list.length; i ++){
            for (int j = 0; j < list.length; j++){
                int dlc = list[i] * (Math.max(i, j) - Math.min(i, j));
                if (list[i] <= list[j] && dlc > max){
                    max = dlc;
                }
            }
        }
        System.out.println(max);
    }

}
