package main.java.com;

public class App {

    public static void main(String[] args) {

        Cat cat = new Cat("Васька");
        printName(cat);
        cat.setName("Васька1");
        printName(cat);
        CatWrapper cw = new CatWrapper(cat);
        printName(cw);
        cw.setName("Cat");
        printName(cw);
        printName(cat);
    }

    public static void printName(Cat cat) {
        System.out.println(cat.getName());
    }
}
