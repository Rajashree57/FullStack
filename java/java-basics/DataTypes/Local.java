public class Local {
    public void localVariable() {
        String name = "Ben";
        int marks = 90;
        System.out.println(name + " Scored " + marks + "%.");
    }

    public static void main(String[] args) {
        Local vt = new Local();
        vt.localVariable();
    }
}