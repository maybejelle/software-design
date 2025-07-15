# gitlab profile

in deze readme vind je de correcte repos van de verschillende oefeningen.
dit document dient als maatstaaf voor mijn geleverde prestaties voor software design

## TDD (Test Driven Development)

**retrospective:** 

Werken volgens het TDD systeem vond ik persoonlijk niet supergemakkelijk, zeker in het begin. Ik ben gewoon om meteen aan de slag te vliegen en logica te programmeren. Naarmate de oefening vorderde vond ik het wel gemakkelijker worden. Ik ben blij dat ik deze topic heb gekregen omdat ik het handig vond om eens een andere flow aan te nemen. Het deed me nadenken over welke logica er nu precies aanwezig moest zijn. Dit zorgde er ook voor dat ik geen overbodige code schreef en enkel de code schreef die daadwerkelijk nodig was om de oefeningen tot een correct einde te brengen.

**Wat zou ik anders doen in een tweede iteratie?**

Ik zou denk ik niet zo zeer veel dingen anders doen, maar ik zou er denk ik toch wel pen en papier bij halen om eens goed na te denken over de nodige tests.

**Extra research:**

Zoals de naam implementeerd is de key van TDD dat je eerst tests schrijft voor je de code schrijft. Nadat je klaar bent met de testen te schrijven ga je stap per stap de code maken. Je commits zouden een RED/GREEN structuur moeten volgen waarbij je eerst een RED commit maakt waarbij de test faalt, dan schrijf je code en doe je een GREEN commit waarbij de test slaagt. dit doe je voor elke test die je hebt gemaakt. Na een GREEN commit kan je eventueel ook een REFACTOR commit doen waarbij je de code controleerd en aanpast naar standards. Wanneer je volgens dit principe werkt zou je als je het goed doet betere code kwaliteit hebben. De testen kunnen ook als een vorm van documentatie dienen. Aangezien je eerst zorgt voor testen zou je normaal ook minder bugs hebben in je code, hiervoor moet je ook wel zorgen voor zinvolle testen die ook edge cases testen. Dit zorgt er ook voor dat je enkel en alleen zinvolle code schrijft. Dit kan handig zijn voor APIs te maken.
TDD implementeerd ook enkele code principles zoals KISS(keep it simple and stupid) en YAGNI (you aren't gonna need it). Door deze principes te volgen zorg je ook weer voor simpelere en duidelijkere code.

***Schema TDD***

![image](images/tdd.png)

| **Voordelen**                                                                 | **Nadelen**                                                                 |
|------------------------------------------------------------------------------|-----------------------------------------------------------------------------|
| **Uitgebreide coverage**: TDD zorgt ervoor dat alle nieuwe code gecovered is door minstens één test | **Grotere Codebase**: TDD kan leiden tot een grotere codebase omdat tests bij de totale hoeveelheid geschreven code hoort. |
| **Meer Vertrouwen in Code**: door testen te scrijven krijgen developers meer vertrouwen wanneer ze dan daadwerkelijk code moeten schrijven. | **Valse Veiligheid door Tests**: Een groot aantal succesvolle tests kan een misleidend gevoel van zekerheid geven over de robuustheid van de code. |
| **Meer Vertrouwen in Tests**: Aangezien tests falen zonder de juiste implementatie, weet je dat de tests de implementatie correct verifiëren. | **Onderhoudskosten**: Het onderhouden van een grote testset kan extra inspanning vragen. |
| **Goed Gedocumenteerde Code**: Elke test verduidelijkt het doel van de code die het test, wat resulteert in goed gedocumenteerde code. | **time consuming Testproces**: Het schrijven en onderhouden van tests kan veel tijd in beslag nemen. |
| **Duidelijkheid van Eisen**: TDD kan voor grotere bedrijven handig zijn, omdat je alle requirements in tests maakt  | **Opzetten van Testomgeving**: TDD vereist het opzetten en onderhouden van een geschikte testomgeving. |
| **Vergemakkelijkt Continuous Integration**: Het integreert goed met continuous integration, wat frequente code-updates en testen mogelijk maakt. | **Leercurve**: Het kost tijd en moeite om TDD-praktijken goed onder de knie te krijgen. |
| **Verhoogt Productiviteit**: Veel ontwikkelaars vinden dat TDD hun productiviteit verhoogt. | **Overcomplicatie**: Te veel nadruk op TDD kan leiden tot onnodig complexe code. |
| **Versterkt Mentaal Model van Code**: TDD helpt bij het bouwen van een sterk mentaal model van de structuur en het gedrag van de code. | **Verwaarlozing van Ontwerp**: Te veel focus op het laten slagen van tests kan leiden tot verwaarlozing van het algemene ontwerp van de software. |
| **Nadruk op Ontwerp en Functionaliteit**: Het stimuleert een focus op het ontwerp, de interface en de functionaliteit van het programma. | **Hogere Kosten**: De extra tijd en middelen die nodig zijn voor TDD kunnen resulteren in hogere ontwikkelkosten. |
| **Minder Debugging Nodig**: Problemen worden vroeg in het ontwikkelingsproces opgespoord, waardoor minder debugging nodig is. |                                                                             |
| **Stabielere Systemen**: Applicaties ontwikkeld met TDD zijn stabieler en minder foutgevoelig. |                                                                             |


## Assembler en gestructureerd programmeren

**retrospective:** 

Dit was een moeilijke oefening voor verschillende redenen. Ten eerste had ik nog noot in c++ gecodeerd dus dat was al een uitdaging. Toen ik de oefeningen werkende kreeg begon ik stap per stap overbodige variabelen weg te doen om zo alleen maar de variabelen te gebruiken die we mochten gebruiken. Deze stap verliep nog vrij vlot, alleen bij de fib oefening moest ik hier wat bij nadenken en mij verdiepen in hoe de fib sequence daadwerkelijk werkt. toen ging ik aan de slag met het verwijderen van de if statements. Dit verliep zonder problemen. ik heb gewoon alle if statements vervangen door test statements in c++.
daarna moesten de loops weg. Hier had ik even moeite mee tot mij duidelijk werd gemaakt dat ik in de code gebruik kon maken van goto functies.
De level two-ops verwijderen ging niet. Sommige oefeningen hadden er geen dus dat was wel een plezier, maar ik kon geen manier vinden om deze operators weg te werken. Achter deze stap kwam ik er achter dat ik niet echt functies gebruikte dus het verwijderen was geen probleem.

Voor de digitSwap werken enkel 2 digits, alles meer dan dit word niet behandeld.

Tijdens deze oefeningen heb ik enkele inzichten gekregen, namelijk dat functies en variabels het leven van een programmeur heel makkelijk maken. Maar dat we wel snel geneigd zijn om er te veel aan te maken, wat natuurlijk zorgt dat de applicatie wat trager gaat. In deze oefening was dat natuurlijk geen zo'n drama maar in grotere applicaties waar snelheid van belang is en assembly code gebruikt word wel natuurlijk.

**Extra research:**

Assembly language is een low level language die dicht bij machinecode staat. Het biedt directe controle over de hardware en wordt vaak gebruikt in situaties waar snelheid en efficiëntie van belang zijn.

***Kenmerken van Assembly Language***

- **Low-Level**: Assembly staat net boven machinecode en gebruikt symbolische instructies in plaats van binaire getallen.
- **Snel en Efficiënt**: Omdat assembly direct communiceert met de hardware, is het zeer snel en efficiënt in vergelijking met higher-level programmeertalen.
- **Hardware-Specifiek**: Assembly is afhankelijk aan specifieke processorarchitectures.
- **Complexiteit**: Het is moeilijker te leren en begrijpen dan higher-level programmeertalen, omdat het vereist dat de programmeur hardwareconcepten begrijpt, zoals registers, geheugenindeling, en instructiesets.

***Voordelen van Assembly Language*** 

- **Prestaties**: Maximale optimalisatie voor snelheid en efficiëntie.
- **Directe Hardwarecontrole**: Toegang tot registers, I/O-poorten en andere hardware componenten.
- **Kleine Codebases**: Geschikt voor systemen met beperkte resources zoals microcontrollers.
- **Diepgaand Inzicht**: Helpt programmeurs de werking van de hardware en machinecode beter te begrijpen.

***Nadelen van Assembly Language***

- **Tijdsintensief**: Het schrijven van assembly code kan veel langer duren dan met higher-level talen.
- **Foutgevoelig**: Door de complexiteit is het gemakkelijker om fouten te maken.
- **Platformafhankelijk**: Assembly code moet herschreven worden voor verschillende processorarchitectures.
- **Onderhoudbaarheid**: Assembly code is moeilijk te lezen en te onderhouden, vooral voor grote projecten.

***Toepassingen***
- **Embedded Systems**: Voor het programmeren van microcontrollers en andere hardware.
- **Realtime Systemen**: Waar lage latency en maximale controle vereist zijn.
- **Reverse Engineering**: Voor het analyseren en debuggen van binaire executables.
- **Educatie**: Voor een beter begrip van computerarchitectuur en hardware.

***Vergelijking met Higher-Level Languages***


| **Aspect**           | **Assembly Language**                | **Higher-Level Languages**           |
|-----------------------|---------------------------------------|---------------------------------------|
| **Abstractie**        | Zeer laag, dicht bij hardware        | Hoog, abstract van hardware          |
| **Leesbaarheid**      | Moeilijk en cryptisch                | Eenvoudiger en begrijpelijker        |
| **Efficiëntie**       | Zeer snel en resourcevriendelijk     | Minder efficiënt                     |
| **Platformafhankelijk** | Specifiek voor één architectuur     | Meestal platformonafhankelijk         |
| **Complexiteit**      | Hoog, vereist diepgaande kennis      | Lager, intuïtiever                   |

Assembly blijft een krachtig hulpmiddel voor specifieke toepassingen, maar wordt vaak aangevuld door higher-level talen in moderne softwareontwikkeling.


## Competitive programming

we hadden twee sessies in competitive programming, helaas vind ik de code van de eerste sessie niet terug. Om te laten zien dat ik toch wel iets kan ivm comp programming zal ik ook een repo toevoegen van mijn code die ik heb voor mijn challenges van hack the future.

**retrospective:**

Ik ben geen goeie programmeur als er een tijdsdruk aanwezig is. Ik stresseer en vergeet soms de basics, maar ik denk dat ik wel een redelijke prestatie nog heb neergezet. Het teamwork verliep niet zo heel vlot moet ik wel zeggen. Ik heb eigenlijk alle coding gedaan. De eerste sessie was heel de groep aanwezig, maar ik kreeg niet zo heel veel input van mijn teamleden. In de tweede sessie was Nikolaos niet aanwezig en Elvis was na 1 uur al weg dus voor de meerderheid was ik alleen en ook dan heb ik dus alle oefeningen in mijn eentje moeten uitpluizen. Ik vind competitive programming wel leuk omdat het coderen sowieso leuk is, maar ik hou er ook wel van om te moeten nadenken om een complex probleem op te lossen en het uit te vogelen.

## Design patterns


**retrospective:**

Voor dit gedeelte van de cursus wou ik zelf eens een deep dive doen op verschillende design patterns en niet alleen degene die tijdens de lessen waren behandeld. Ik merkte meteen op de er in design patterns een onderscheid gemaakt wordt tussen creational, structural en behavioral patterns. Ik wou graag over de drie categorieën wat bijleren dus heb ik telkens 1 design pattern per categorie uitgekozen en een kleine demo geschreven.

***Creational patterns:***

Deze patterns verwijzen naar het  creëeren van objecten in code.
Voor deze categorie heb ik de Factory design pattern gekozen, omdat deze me aansprak en ik herkende wel stukken code van over de jaren heen waar ik dit pattern zou kunnen gebruikt hebben. Voor deze demo heb ik de gildedRose oefening uitgebreid met een ItemFactory. Deze klasse dient enkel en alleen voor het maken van de juiste Items naarmate de naam van het Item. Hierdoor hoef je alleen de itemFactory aan te spreken bij het creëeren van Items en niet meer de apperte klasses. Hierdoor wordt het ook gemakkelijker om andere ItemClasses to te voegen zonder veel moeite.

***Structural patterns:***

Deze patterns richten zich op de manier waarop klassen en objecten met elkaar worden samengesteld om zo grotere structuren te vormen.
Voor deze categorie koos ik voor de Composite design pattern, omdat deze het probleem van boomstructuren wat oplost en ik dit al heb meegemaakt in mijn opleiding. Dit pattern zorgt ervoor dat je verschillende klasses kan aanmaken in een boomstructuur, maar al die klassen volgen een zelfde interface met de voorgedefineerde methodes, op deze manier worden alle klasses die deel uitmaken van de hierarchie op eenzelfde manier behandeld. en wordt het managen maar ook aanmaken van nieuwe componenten zeer gemakkelijk. voor deze demo heb ik een UiComponent interface gemaakt die een add,remove en render methode heeft. Dan heb ik wat klasses aangemaakt voor een Button en een panel. Een panel kan bijvoorbeeld de add methode gebruiken, maar een button niet. maar toch volgen ze allemaal de interface.

***Behavioral patterns:***

Deze patterns richten zich meestal op de communicate tussen verschillende objecten.
Voor deze categorie koos ik voor de Template pattern. Ik koos deze pattern omdat ik een demo in gedachten had die te maken had met het battleships project van mijn eerste jaar. Ik had veel moeite met het onderscheid tussen vertical en horizontal ships te maken en dan deze te plaatsen op het bord. daardoor koos ik voor de Template pattern omdat deze ervoor zorgt dat je een abstracte klasse maakt met de basisstructuur van je algoritme. terwijl je dan de uiteindelijke uitwerking van de methodes overlaat aan de subklasses. In mijn demo maakte ik een abstracte klasse ShipPlacement waarbij er een paar methodes stonden zoals validateFit, checkCells en markCells. De implementatie van deze methodes werd gemaakt in de Horizontal- en VerticalShipPlacement klasses.


## Refactoring

**refactoring golf excercise:**


| Hole | Best score |
|------|------------|
| 1    | 6          |
| 2    | 8          |
| 3    | 6          |
| 4    | 12         |
| 5    | 4          |
| 6    | 5          |

***Hole 1:***

- replaced != with !objects.equals (+1 point)
- replaced == with objects.equals (+1 point)
- shortened if statement (+4 points)

***Hole 2:***

- renamed pair fields (+4 points)
- changed Pair to Money (+2 points)
- removed type arguments (+2 points)

***Hole 3:***

- removed useless for loop (+2 points)
- added plus method (+2 points)
- implemented plus method (+2 points)

***Hole 4:***

- made money class (+2 points)
- made money class private (+2 points)
- added static method (+2 points)
- added minus method (+2 points)
- removed static money class (+2 points)
- removed if statement and updated return (+2 points)

***Hole 5:***

- made TaxRate class (+2 points)
- implemented TaxRate class (+2 points)

***Hole 6:***

- replaced total with stream util (+5 points)



**gilded rose excercise:**

1. first I made the check on the Aged Brie name into a boolean.
2. I made an item class and moved the method for updating items to that class.
3. Then i removed the duplicate IsAgedBrie check
4. Removed some useless code in the isAgedBrie check
5. made the check on Backstage Pass into a boolean
6. removed the duplicates isBackstage pass checks
7. made the isSulfurass check into a boolean.
8. removed duplicates isSulfurass checks
9. made increaseQuality method for reuseability.
10. made class Aged Brie
11. made class Sulfuras
12. made class Backstage Pass
13. made class Regular Item
14. refactored code.


**Extra research:**

Bij het refactoren is het handig om te weten waar je op moet letten. Dus hieronder zal ik een aantal standaard refactoring principes meegeven.

### Refactoring Technieken
---

***TDD voor refactor:***  
Veel developers kiezen ervoor om volgens een TDD-principe te werken, omdat dit bestaat uit drie stappen: RED/GREEN/REFACTOR.  
1. **RED**: Schrijf een falende test voor de gewenste functionaliteit.  
2. **GREEN**: Implementeer de minimale code om de test te laten slagen.  
3. **REFACTOR**: Verbeter de code zonder de test te breken.  

***Refactor met abstraction:***  
Zoek naar gedeelde stukken code op verschillende plaatsen. Plaats deze code apart in een abstracte klasse of interface om duplicatie te vermijden.  

***Composing:***  
Wanneer methodes te groot worden, betekent dit vaak dat ze te veel functionaliteit bevatten. Splits de methode op in kleinere methodes. Een goede praktijk is dat elke methode één specifieke functionaliteit behandelt.  

***Methodes vereenvoudigen:***  
Als methodes onleesbaar worden, kun je:  
- Variabelen betere namen geven.  
- Overbodige variabelen verwijderen.  
- Lange methodes opsplitsen in kleinere methodes.  

***Functionaliteit verplaatsen:***  
Als verantwoordelijkheden niet logisch verdeeld zijn over klassen, kun je methodes of functies verplaatsen naar de juiste klasse. Dit verbetert de cohesie en vermindert koppeling.  

***Voorbereidende refactoring:***  
Pas deze techniek toe om de code klaar te maken voor nieuwe functionaliteiten. Dit kan door complexe logica te vereenvoudigen, verouderde API’s te vervangen, of de structuur te verbeteren.  


### Best Practices voor Refactoring
---

***Samenwerken met testers:***  
Betrek het QA-team tijdens het refactoren om er zeker van te zijn dat de veranderingen niet zorgt voor nieuwe bugs en de functionaliteit behouden blijft.

***Automatiseren:***  
Gebruik tools zoals linters, statische code-analyzers en automatische tests om het refactorproces te versnellen en fouten te minimaliseren.

***Refactor in kleine stappen:***  
Maak kleine, incrementele wijzigingen om de kans op fouten te verkleinen en het proces overzichtelijk te houden. Dit maakt het eenvoudiger om eventuele problemen snel op te sporen en op te lossen.

***Debuggen en refactoren apart:***  
Houd refactoren en bugfixes gescheiden. Los bekende bugs eerst op en behandel nieuwe problemen die tijdens het refactoren ontstaan als aparte taken.

***Code deduplicatie prioriteren:***  
Zoek naar duplicatie in de code en verplaats gedeelde functionaliteit naar herbruikbare componenten zoals abstracte klassen, interfaces of hulpfuncties. Dit maakt de code beter onderhoudbaar en minder foutgevoelig.

