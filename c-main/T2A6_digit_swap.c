    #include "header.h"
    /*
    # Digit Swap
    Read one number (`int`) as input.

    If the number has exactly two digits, the program swaps both digits.
    Otherwise, the number is printed as is.
    The sign of the number is **always** preserved.

    **Non-functional requirement:** The input is a number, do not try to convert it to a string.
    **Hint:** The integer division does not exist in JavaScript.
    You can simulate an integer division, however, by doing a regular (decimal)
    division, and then "round the result to the floor" (naar beneden afronden).
    This can be done in JavaScript using `Math.floor(x/y)`.

    ## Examples:
        > 1234
        1234

        > -1234
        -1234

        > -4
        -4

        > 6
        6

        > 34
        43

        > -12
        -21

        > -70
        -7
    */
int main() {
    nx = read_int();
    int n1 = 1;
    int n3 = 0;
    int n2 = 0;

main:
    test nx == 0;     
    n1 = 1;
    c_goto reverse;

    n1 = nx % 10;
    push_int(n1);
    nx /= 10;
    n3++;
    test nx >= 0;
    c_goto main;
reverse:
    test n3 == 0;
    c_goto end;

    pop_int();
    nx = nx * n1;
    n2 = n2 + nx;
    test n3 >= 0;
    n1 *= 10;
    n3--;
    c_goto reverse;

 
end:
    write_int(n2);
    write_str("end main");
    return 0;
}