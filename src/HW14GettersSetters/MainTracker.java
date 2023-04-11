package HW14GettersSetters;

public class MainTracker {
    public static void main(String[] args) {
        UserTracker userTracker1 = new UserTracker("Антон", "04", "04", 1999,"Anton@gmail.com","+380666410669","Ігнатов",80.0,"120/70", 11200);
        userTracker1.printAccountInfo();

        UserTracker userTracker2 = new UserTracker("Борис", "22", "12", 1967,"Boris@gmail.com","+380626410439","Кук",95.0,"140/90", 10500);
        userTracker2.printAccountInfo();
        userTracker2.setUserWeight(90);
        userTracker2.setStepsPerDay(12000);
        userTracker2.printAccountInfo();

        UserTracker userTracker3 = new UserTracker("Анна", "14", "08", 2001,"Anna@gmail.com","+380736415639","Полякова",65.0,"130/80", 12000);
        userTracker3.printAccountInfo();
        userTracker3.setUserPressure("125/90");
        userTracker3.setUserSurName("Філатова");
        userTracker3.printAccountInfo();
    }
}
