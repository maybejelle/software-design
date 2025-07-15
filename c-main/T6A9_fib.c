#include "header.h"
/*
# Recursion

Fibonacci was an Italian mathematician who lived around 1200 A.D..
He devised a sequence of numbers, called the Fibonacci-numbers which can easily expressed
as a "meervoudig functievoorschrift". We do not need to understand the implications, need or even mathematics.

We should however be able to translate this into a recursive JavaScript function.

<pre>
          /
          | 0, for n = 0
          |
fib(n) = <  1, for n = 1
          |
          | fib(n-1) + fib(n-2), else
          \
</pre>

For bigger numbers, this solution is correct but too slow.
Write a second version `fibFast` that uses a loop rather than recursion.
**Hint:** Search the internet for help.
**Hint:** Skip this *fast* exercise if you are running behind!


*/

int main() {
    int n2,n3,nx;
    int n1 = read_int();

    n2 = 0;
    n3 = 1;


    test n1 == 0;
    nx = 0;
    c_goto end;
    test n1 == 1;
    nx = 1;
    c_goto end;

    main:
    test n1 > 2;
    nx = n2 + n3;
    n2 = n3;
    n3 = nx;
    n1--;
    c_goto main;



	end:
    write_int(nx);
	write_str("end main");
	return 0;
}


