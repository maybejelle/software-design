# Template design pattern
This is a simple but usefull design pattern, the goal is to have an abstract class that has some general methods, but then also some abstract methods that differ based on what type of class you have, for instance in my demo I create a battleships grid whit randomly place horizontal and vertical ships.

the placeSHips method is general, but the check for availability depends on the direction of the ship (horizontal - vertical)

By using this design pattern i can keep my code non-repetetive and more easy to follow.