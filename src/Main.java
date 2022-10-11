public class Main {
    public static void main(String[] args) {
        System.out.println();

        for (String name : MyClass.name ) {
            if (name.equals("Saturday")) {
                System.out.println(name + " is a holiday");
            } else if (name.contains("Sun")) {
                System.out.println(name + " is also holiday");
            }
            else {
                System.out.println(name + " this is weekday. Go to work!");
            }
        }
    }
}