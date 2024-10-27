public class Example {

    // Using arrays
    public static void printNames(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    // Using varargs
    public static void printGreetings(String... greetings) {
        for (String greeting : greetings) {
            System.out.println("Hello, " + greeting + "!");
        }
    }

    public static void main(String[] args) {
        // Calling the method using an array
        String[] names = {"An", "Binh", "Cuong"};
        printNames(names);

        // Calling the method using varargs
        printGreetings("friend", "everyone", "folks");
    }
}
