# Opdrachtenreeks 1: TDD

## Opdracht 1: List
Implementeer een op een array gebaseerde lijst in de TDD-stijl.
Hou je strikt aan het red-green principe en leg dit vast door middel van git.
Maak dus een commit per nieuwe test, en een commit voor de productie code die deze laat slagen.
Stop ook de eventuele refactorings in een aparte commit.

Je commits zouden er dus als volgt uit kunnen/moeten zien (zoek je eigen stijl)

- **RED** Initial list is empty
- **GREEN** Initial list is empty
- **RED** Insertion makes list not empty
- **GREEN** Insertion makes list not empty
- ...
- **REFACTOR**: Move Exception to inner class.
- ...

## Opdracht 2: Bowling
(Opdracht gestolen van https://kata-log.rocks/tdd)
Implementeer onderstaande opdracht in TDD-stijl.

### Bowling Regels
Het spel bestaat uit 10 frames. In elk frame heeft de speler twee worpen om 10 kegels om te gooien. De score voor het frame is het totaal aantal omgegooide kegels, plus bonussen voor strikes en spares.

Een spare is wanneer de speler alle 10 de kegels omgooit in twee worpen. De bonus voor dat frame is het aantal kegels dat in de volgende worp wordt omgegooid.

Een strike is wanneer de speler alle 10 de kegels omgooit bij zijn eerste worp. Het frame is dan voltooid met een enkele worp. De bonus voor dat frame is de waarde van de volgende twee worpen.

In het tiende frame mag een speler die een spare of strike gooit extra ballen werpen om het frame te voltooien. Er mogen echter niet meer dan drie ballen geworpen worden in het tiende frame.

### Vereisten
Schrijf een klasse `Game` die twee methoden heeft:

`void roll(int)` wordt aangeroepen elke keer dat de speler een bal gooit. Het argument is het aantal omgegooide kegels.
`int score()` retourneert de totale score voor dat spel.

Hou je strikt aan het red-green principe en leg dit vast door middel van git.
Maak dus een commit per nieuwe test, en een commit voor de productie code die deze laat slagen.
Hier zal je in de refactor fase ook werk hebben, zeker in de test-code. Maak voldoende gebruik van hulp-functies.
