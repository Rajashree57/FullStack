public class Instance {

    public String name = "Ben";
    public int marks = 95;

    public void instanceVariable() {
        System.out.println(name + " Scored " + marks + "%.");
    }

    public static void main(String[] args) {
        Instance  vt = new Instance();
        vt.instanceVariable();
    }
}