package Task3;

public class TaskThree {
    public int function(int [] list) {
        int max = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                int dlc = list[i] * (Math.max(i, j) - Math.min(i, j));
                if (list[i] <= list[j] && dlc > max) {
                    max = dlc;
                }
            }
        }
        return max;
    }
}
