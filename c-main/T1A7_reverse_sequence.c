#include "header.h"
/*
# Reverse Sequence
Write a program that reads five numbers (`int`) and
that outputs them in reverse order.

## Example:
### Input
    1
    2
    3
    4
    5

### Output:
    5
    4
    3
    2
    1
*/
int main() {
    int n1 = 5;
    int n3 = 5;

    main:

    test n1 == 0;
    c_goto reverse;

    int n2 = read_int();
    push_int(n2);

    test n1 > 0;
    n1--;
    c_goto main;
    reverse:
    
    test n3 == 0;
    c_goto end;

    pop_int();
    write_int(nx);
    test n3 > 0;
    n3--;
    c_goto reverse;


	end:

	write_str("end main");
	return 0;
}

