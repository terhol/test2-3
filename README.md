# Test 2-3
Second test version 3 from subject PB162 on [FI MUNI](https://www.fi.muni.cz/)

## Description (Czech language only)


Rozhraní ani předdefinované třídy neměňte, pokud to přímo nevyžaduje zadání! Metody NEMUSÍTE dokumentovat pomocí JavaDoc komentářů. Používejte zásadně privátní atributy.

-   Upravte třídu ElectricDevice tak aby platilo, že dvě zařízení sou stejná, pokud mají stejné ID.
-    Doplňte chybějící metodu switchAndTest() do třídy CircuitBreaker. Metoda "nahodí jistič" a zjistí, jestli nedošlo k přetížení. Pokud ano, tak se jistič zase vypne a vyhodí se výjimka.
-   Vytvořte třídu Circuit implementující rozhraní ICircuit. Třída představuje elektrický okruh s jističem. Elektrický okruh má daným počtem zásuvek (pole objektů typu ElectricDevice). Do zásuvek se mohou připojovat elektrická zařízení a jistič je schopen metodou switchAndTest() zjistit, jestli není okruh přetížen. Třída bude mít následující konstruktor:

           /**
    	* @param numSockets number of electric sockets, must be bigger than zero
    	* @param maxPower maximal power of the circuit breaker, must be bigger than zero
    	* @throws IllegalArgumentException if some of the arguments are <= 0
    	*/
           public Circuit(int numSockets, int maxPower)

    Třída Demo slouží pro vaši kontrolu funkčnosti kódu a obsahuje také logiku volání metod. Při chybě třída buďto spadne s příslušnou výjimkou nebo vypíše řádek s popisem chyby. Pokud žádná chyba není detekována, aplikace nespadne a vypíše se pouze úvodní věta:
    Pri spravnem reseni system nespadne s vyjimkou, ani nevypise "CHYBA..."


## License
MIT