# Test 2-3
Second test version 3 from subject PB162 on [FI MUNI](https://www.fi.muni.cz/)

## Description


Do not change interface or already defined classes, if the task doesn’t require it explicitly! You do not have to document methods by JavaDoc comments. Use private attributes only.

-   Change ElectricDevice class so that two devices are same if their IDs are same.
-    Add missing switchAndTest() method into CircuitBreaker class. The method “starts the circuit breaker” and checks if there is not overloading. If so, it turns off the circuit breaker and exception is thrown.
-   Create Circuit class which implements the ICircuit interface. This class represents electric circuit with circuit breaker. The electric circuit has a number of sockets (array of objects ElectricDevice). Electric devices can be plugged into sockets and circuit breaker is able to find out if the circuit is not overloaded by method switchAndTest. This class will have following constructor:

           /**
    	* @param numSockets number of electric sockets, must be bigger than zero
    	* @param maxPower maximal power of the circuit breaker, must be bigger than zero
    	* @throws IllegalArgumentException if some of the arguments are <= 0
    	*/
           public Circuit(int numSockets, int maxPower)

    Demo class is for checking code functionality and also contains logic of method calling. If error appears, class crashes with an exception or writes out a line with error description. If no error is detected, the application doesn’t crash and only the introduction sentence is shown: Pri spravnem reseni system nespadne s vyjimkou, ani nevypise "CHYBA..."


## License
MIT
