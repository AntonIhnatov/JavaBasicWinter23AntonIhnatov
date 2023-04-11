package HW14GettersSetters;

import java.time.LocalDate;

public class UserTracker {
    private final String NAME;
    private final String DAY_BIRTHDAY;
    private final String MONTH_BIRTHDAY;
    private final int YEAR_BIRTHDAY;
    private final String EMAIL;
    private final String PHONE_NUMBER;
    public  String userSurName;
    public  double userWeight;
    public  String userPressure;
    public  int stepsPerDay;
    LocalDate dt = LocalDate.now();
    private int age;

    public UserTracker(String NAME, String DAY_BIRTHDAY, String MONTH_BIRTHDAY, int YEAR_BIRTHDAY, String EMAIL, String PHONE_NUMBER, String userSurName, double userWeight, String userPressure, int stepsPerDay) {
        this.NAME = NAME;
        this.DAY_BIRTHDAY = DAY_BIRTHDAY;
        this.MONTH_BIRTHDAY = MONTH_BIRTHDAY;
        this.YEAR_BIRTHDAY = YEAR_BIRTHDAY;
        this.EMAIL = EMAIL;
        this.PHONE_NUMBER = PHONE_NUMBER;
        this.userSurName = userSurName;
        this.userWeight = userWeight;
        this.userPressure = userPressure;
        this.stepsPerDay = stepsPerDay;
        age =  dt.getYear() - YEAR_BIRTHDAY;
    }

    public String getNAME() {
        return NAME;
    }

    public String getDAY_BIRTHDAY() {
        return DAY_BIRTHDAY;
    }

    public String getMONTH_BIRTHDAY() {
        return MONTH_BIRTHDAY;
    }

    public int getYEAR_BIRTHDAY() {
        return YEAR_BIRTHDAY;
    }

    public String getEMAIL() {
        return EMAIL;
    }

    public String getPHONE_NUMBER() {
        return PHONE_NUMBER;
    }

    public String getUserSurName() {
        return userSurName;
    }

    public double getUserWeight() {
        return userWeight;
    }

    public String getUserPressure() {
        return userPressure;
    }

    public int getStepsPerDay() {
        return stepsPerDay;
    }

    public int getAge() {
        return age ;
    }

    public void setUserSurName(String userSurName) {
        this.userSurName = userSurName;
    }

    public void setUserWeight(double userWeight) {
        this.userWeight = userWeight;
    }

    public void setUserPressure(String userPressure) {
        this.userPressure = userPressure;
    }

    public void setStepsPerDay(int stepsPerDay) {
        this.stepsPerDay = stepsPerDay;
    }

    public void printAccountInfo(){
        System.out.println( "Користувач трекеру" + "\n" +
                "Ім'я: " + NAME + "\n" +
                "Прізвище: " + userSurName  + "\n" +
                "День народження: " + DAY_BIRTHDAY  +"\n" +
                "Місяць народження: " + MONTH_BIRTHDAY +"\n" +
                "Рік народження: " + YEAR_BIRTHDAY +"\n" +
                "Вік: " + age  +"\n" +
                "Електронна пошта: " + EMAIL  +"\n" +
                "Номер мобільного: " + PHONE_NUMBER  +"\n" +
                "Вага: " + userWeight +"\n" +
                "Тиск: " + userPressure +"\n" +
                "Кроків за день: " + stepsPerDay +"\n" +
                "---------------------------------------"
        );
    }
}
