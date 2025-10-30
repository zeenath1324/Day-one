public class WelcomeMessage {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please enter a name");
            return;
        }
        String name = args[0];
        System.out.println("Welcome " + name);
    }
}
