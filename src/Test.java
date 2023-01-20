public class Test {
    public static void main(String[] args) {
        String mySurname = "Calabrese";

        String result = mySurname.contains("ni") ? "contains" : "doesn't contains";
        System.out.println("My surname " + result + " ni!");
    }
}
