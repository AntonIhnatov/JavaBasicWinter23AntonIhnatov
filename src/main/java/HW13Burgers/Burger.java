package HW13Burgers;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    String extraMeat;
    int numberMeat;

    public Burger(String name, String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Бургер " + name + " складається з:" + this.bun + "," + this.meat + "," + this.cheese + "," + this.greens + " і" + this.mayonnaise);
    }

    public Burger(String name, String bun,String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Бургер" + name + " складається з:" + this.bun + "," + this.meat + "," + this.cheese + " і" + this.greens);
    }

    public Burger(String name, String bun, String meat, String cheese, String greens, String mayonnaise, String extraMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.extraMeat = extraMeat;

        System.out.println("Бургер"+ name + " складається з:" + this.bun + "," + this.meat + "," + this.cheese + "," + this.greens + "," + this.mayonnaise +  " і " + this.extraMeat);

    }
    public Burger(String name, String bun, int numberMeat, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.numberMeat = numberMeat;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;

        System.out.println("Бургер"+ name + " складається з:" + this.bun + ", " + this.numberMeat + " шматків" + this.meat + "," + this.cheese + "," + this.greens + " і" + this.mayonnaise );
    }

}
