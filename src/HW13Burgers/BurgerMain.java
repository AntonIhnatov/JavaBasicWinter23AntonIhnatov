package HW13Burgers;

public class BurgerMain {
    public static void main(String[] args) {
        Burger burger = new Burger("звичайний", " булочки", " м'яса", " сиру", " зелені", " майонезу");
        Burger dietBurger = new Burger(" дієтичний"," булочки", " м'яса", " сиру", " зелені");
        Burger burgerWithDoubleMeat = new Burger(" з подвійним м'ясом", " булочки"," м'яса", " сиру", " зелені", " майонезу", "додаткового м'яса");
        Burger burgerWithDoubleMeat1 = new Burger(" з подвійним м'ясом", " булочки",2," м'яса", " сиру", " зелені", " майонезу");

    }
}
