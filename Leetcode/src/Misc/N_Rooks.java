package Misc;
import java.util.HashSet;
import java.util.Set;

public class N_Rooks {
    public static boolean checkAttack(int[][] coordinates) {
        Set<Integer> xCoordinates = new HashSet<>();
        Set<Integer> yCoordinates = new HashSet<>();
        for (int i = 0; i < coordinates.length; i++) {
            boolean overlap = xCoordinates.add(coordinates[i][0]) && yCoordinates.add(coordinates[i][1]) ? false : true;
            if (overlap) {
                return false;
            }
        }
        return true;
    }
}