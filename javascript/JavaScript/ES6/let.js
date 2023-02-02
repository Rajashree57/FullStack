// program to print the text
// variable a cannot be used here
function greet() {
    let a = 'hello';

    // variable b cannot be used here
    if(a == 'hello'){
        // variable b can be used here
        let b = 'world';
        console.log(a + ' ' + b);
    }

     // variable b cannot be used here
    console.log(a + ' ' + b); // error
}
// variable a cannot be used here

greet();
// n the above program, the variable a is declared inside the function and it can be accessed anywhere inside the function (a becomes function scoped).
//However the variable b is declared inside the if block statement.
// b will be block-scoped and can only be accessed inside the if block.
// Hence when you try to access b outside of if block, an error occurs 