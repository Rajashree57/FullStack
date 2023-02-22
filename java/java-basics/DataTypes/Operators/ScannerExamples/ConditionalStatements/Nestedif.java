public class Nestedif {
    public static void main(String[] args) {
        String name = "Mohan";
        int Roll = 25;
        int marks = 85;
        if (name == "Mohan" && Roll == 25) {
            if (marks > 35) {
                System.out.println("Mohan has been promoted to next class.");
            } else {
                System.out.println("Mohan needs to give re-exam.");
            }
        }
    }
}
// if statements inside other if statements are called nested if statements.