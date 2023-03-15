package HWArithmeticOperators;

public class HW5ChineseDynasties {
    public static void main(String[] args) {
        //3 типи воїнів армії Лі з такими показниками атаки
        int warriorLee = 13;
        int archerLee = 24;
        int cavalierLee = 46;

        //3 типи воїнів армії Мінь з такими показниками атаки
        int warriorMin = 13;
        int archerMin = 24;
        int cavalierMin = 46;

        //Кількість солдат арміїї Лі
        int sumSoldiersLee = 860;

        //Кількість солдат арміїї Мінь більша в 1.5 раза за армію Лі
        double sumSoldiersMin = sumSoldiersLee * 1.5;
        //Сумарна атака з кожного 3 типів воїнів армії Лі
        int totalAttackRateWarriorLee = warriorLee * sumSoldiersLee;
        int totalAttackRateArcherLee = archerLee * sumSoldiersLee;
        int totalAttackRateCavalierLee = cavalierLee *sumSoldiersLee;

        //Сумарна атака з кожного 3 типів воїнів армії Мінь
        double totalAttackRateWarriorMin = warriorMin * sumSoldiersMin;
        double totalAttackRateArcherMin = archerMin * sumSoldiersMin;
        double totalAttackRateCavalierMin = cavalierMin * sumSoldiersMin;

        //Сумарна атака усіх солдат армії Лі
        int AmountOfLeeArmyDamage = totalAttackRateWarriorLee + totalAttackRateArcherLee + totalAttackRateCavalierLee;

        //Сумарна атака усіх солдат армії Мінь
        double AmountOfMinArmyDamage = totalAttackRateWarriorMin + totalAttackRateArcherMin + totalAttackRateCavalierMin;

        System.out.println("Значення загальної атаки армії Лі: " + AmountOfLeeArmyDamage);
        System.out.println("Значення загальної атаки армії Мінь: " + AmountOfMinArmyDamage);
        
    }
}
