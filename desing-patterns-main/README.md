# design pattern-factory
This is a small demo where i took the gilder-rose excercise and implemented the factory design pattern.

 # What is the factory design pattern
 The core of this design pattern is making sure that when you need new instances of certain things, in this demo Items
 you only need to change the ItemFactory and the client really stays the same. This makes it so that the selection of which subclass needs to be used is only determined by the Factory which makes it centralized

 ## small note
 the Factory should only be responsible for choosing the right subclass, all other functionality should be added in the correct subclass.