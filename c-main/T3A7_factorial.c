#include "header.h"
/*
# Factorial
Ask for a positive number (``int``) as input and output its factorial.

The factorial of a number n is n! with n! = n * (n-1) * ... * 3 * 2 * 1

For negative numbers the factorial is not defined. In this case you can
simply print `does not compute`.
*/

int main() {	
	int n = read_int();
	int n2 = 1;
	int n3 = 1;
	main:
	test n < 0;
	c_goto end;

	

	test n2 > n;
	c_goto end;
	n3 *= n2;
	n2++;
	test n2 <= n;
	c_goto main;
	end:
		write_int(n3);
		write_str("end main");
		return 0;
}
