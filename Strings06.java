package lesson06;

public class Strings06 {
    public static void main(String[] args) {
        String greeting = "Hello";
        String farewell = "Goodbye";
        greeting = greeting.toUpperCase();
        farewell = farewell.toLowerCase();

        System.out.println(greeting);
        System.out.println(farewell);

        System.out.println(greeting.contains("H"));
        System.out.println(greeting.substring(0,4));

        System.out.println(greeting.replace('E', 'Y'));

    }

}
