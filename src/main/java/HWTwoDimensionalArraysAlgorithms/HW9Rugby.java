package HWTwoDimensionalArraysAlgorithms;
import java.util.Arrays;

public class HW9Rugby {
    public static void main(String[] args) {
        int[] firstTeamRugby = new int[25];
        for (int i = 0; i < firstTeamRugby.length; i++) {
            firstTeamRugby[i] = 18 + (int) (Math.random() * 23);
        }
        System.out.println(Arrays.toString(firstTeamRugby));

        int sumFirstTeam = 0;
        for (int i = 0; i < firstTeamRugby.length; i++) {
            sumFirstTeam = sumFirstTeam + firstTeamRugby[i];
        }
        System.out.println("Середній вік першої команди: " + sumFirstTeam/25);

        System.out.println("----------------------------------------------------------------------------------------------------");

        int[] secondTeamRugby = new int[25];
        for (int i = 0; i < secondTeamRugby.length; i++) {
            secondTeamRugby[i] = 18 + (int) (Math.random() * 23);
        }
        System.out.println(Arrays.toString(secondTeamRugby));

        int sumSecondTeam = 0;
        for (int i = 0; i < secondTeamRugby.length; i++) {
            sumSecondTeam = sumSecondTeam + secondTeamRugby[i];
        }
        System.out.println("Середній вік другої команди: " + sumSecondTeam/25);
    }
}
