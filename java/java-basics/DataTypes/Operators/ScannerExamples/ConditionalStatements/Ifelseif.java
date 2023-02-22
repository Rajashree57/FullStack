public class Ifelseif {
    public static void main(String[] args) {
        String name[] = {"Mohan", "Rohan", "Soham"};
        int Roll[] = {25, 36, 71};
        if (name[0] == "Mohan" && Roll[1] == 25) {
            System.out.println("Details of Mohan.");
        } else if (name[2] == "Rohan" && Roll[1] == 36) {
            System.out.println("Details of Rohan.");
        } else if (name[2] == "Soham" && Roll[2] == 71) {
            System.out.println("Details of Soham.");
        } else {
            System.out.println("Invalid details.");
        }
    }
}
 /*  what if we have more than two blocks of code?  
*And what if we need to check which block of code evaluates to true? 
*Well here we use an if…..else if statement.
* if……else if statements allows us to check multiple expressions and 
* enter the block of code where the condition evaluates to true.
* SYNTAX 
 if (condition 1) {
    //block of code
} else if (condition 2) {
    //block of code
} else if (condition 3) {
    //block of code
} else if (condition 4) {
    //block of code
} else {
    //if no condition matches
    //block of code
}
*
*/