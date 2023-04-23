package HWCyclesWorkWithArrays;

import java.util.Scanner;

public class HW6CounterStrike {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввести ім'я першої команди:");
        String nameFirstTeam = sc.nextLine();
        System.out.println("Ввести кіль-сть фрагів першого гравця "+ nameFirstTeam + " команди:");
        if(!sc.hasNextInt()){
            System.out.println("Wrong data");
            System.exit(0);
        }
        int firstTeamPlayer1 = sc.nextInt();

        System.out.println("Ввести кіль-сть фрагів второго гравця "+ nameFirstTeam + " команди:");
        if(!sc.hasNextInt()){
            System.out.println("Wrong data");
            System.exit(0);
        }
        int firstTeamPlayer2 = sc.nextInt();

        System.out.println("Ввести кіль-сть фрагів 3-го гравця "+ nameFirstTeam + " команди:");
        if(!sc.hasNextInt()){
            System.out.println("Wrong data");
            System.exit(0);
        }
        int firstTeamPlayer3 = sc.nextInt();

        System.out.println("Ввести кіль-сть фрагів 4-го гравця "+ nameFirstTeam + " команди:");
        if(!sc.hasNextInt()){
            System.out.println("Wrong data");
            System.exit(0);
        }
        int firstTeamPlayer4 = sc.nextInt();

        System.out.println("Ввести кіль-сть фрагів 5-го гравця "+ nameFirstTeam + " команди:");
        if(!sc.hasNextInt()){
            System.out.println("Wrong data");
            System.exit(0);
        }
        int firstTeamPlayer5 = sc.nextInt();

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Ввести ім'я другої команди:");
        String nameSecondTeam = sc1.nextLine();

        System.out.println("Ввести кіль-сть фрагів першого гравця "+ nameSecondTeam + " команди:");
        if(!sc.hasNextInt()){
            System.out.println("Wrong data");
            System.exit(0);
        }
        int secondTeamPlayer1 = sc.nextInt();

        System.out.println("Ввести кіль-сть фрагів второго гравця "+ nameSecondTeam + " команди:");
        if(!sc.hasNextInt()){
            System.out.println("Wrong data");
            System.exit(0);
        }
        int secondTeamPlayer2 = sc.nextInt();

        System.out.println("Ввести кіль-сть фрагів 3-го гравця "+ nameSecondTeam + " команди:");
        if(!sc.hasNextInt()){
            System.out.println("Wrong data");
            System.exit(0);
        }
        int secondTeamPlayer3 = sc.nextInt();

        System.out.println("Ввести кіль-сть фрагів 4-го гравця "+ nameSecondTeam + " команди:");
        if(!sc.hasNextInt()){
            System.out.println("Wrong data");
            System.exit(0);
        }
        int secondTeamPlayer4 = sc.nextInt();

        System.out.println("Ввести кіль-сть фрагів 5-го гравця "+ nameSecondTeam + " команди:");
        if(!sc.hasNextInt()){
            System.out.println("Wrong data");
            System.exit(0);
        }
        int secondTeamPlayer5 = sc.nextInt();

        double sumFirstTeamFrags = (firstTeamPlayer1+firstTeamPlayer2+firstTeamPlayer3+firstTeamPlayer4+firstTeamPlayer5)/5.0;
        double sumSecondTeamFrags = (secondTeamPlayer1+secondTeamPlayer2+secondTeamPlayer3+secondTeamPlayer4+secondTeamPlayer5)/5.0;

        if (sumFirstTeamFrags > sumSecondTeamFrags){
            System.out.println("Перемогла команда " + nameFirstTeam + " набрала середню кількість очок: " + sumFirstTeamFrags + " очок");
        } else if (sumFirstTeamFrags < sumSecondTeamFrags) {
            System.out.println("Перемогла команда " + nameSecondTeam + " набрала середню кількість очок: " + sumSecondTeamFrags + " очок");
        }else {
            System.out.println("Нічия");
        }
    }
}
