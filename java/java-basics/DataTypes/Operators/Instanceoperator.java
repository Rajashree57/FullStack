class Instanceoperator{
    public static void main(String[] args) {
        // This operator checks if an object is an instance of class.
        //
        Integer number = 5;
        boolean res;
    
        if (res = number instanceof Integer){
            System.out.println("number is an object of Integer. Hence: " + res);
        } else {
            System.out.println("number is not an object of Integer.Hence: " + res);
        }
    }
}
