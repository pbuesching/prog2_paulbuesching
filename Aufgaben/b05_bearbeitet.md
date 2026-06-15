# Blatt 05

## Aufgabe 1 - ANTLR

### Aufgabe 1.1
Verglichen ist das Vorgehen aus Aufgabe 4 an sich kompakter und schneller geschrieben als die ANTLR Version.
Die ANTLR Version braucht zum beginnen erstmal mehr aufwand, da eine extra Grammatik datei erschaffen werden muss in der die Grammatik Definiert wird. Ein Simpler String mit einem Regulären Ausdruck reicht nicht aus.   
Dieser Mehraufwand am Anfang ist am Ende aber auch die größte Stärke der ANTLR Version da diese im Nachhinein strukturierter, besser versändlich und einfacher zu erweitern ist.

### Aufgabe 1.2
Eine Demonstration des Pretty Printers kann über die Main Methode der Klasse `PrettyPrinterShowcase` ausgeführ werden, dabei werden zwei Code beispiele bearbeitet.
Dabei fällt auf das beim zweiten Test größere Teile des Textes fehlen, das passiert dadurch das beim Abarbeiten des Trees manche stellen Abgearbeitet werden ohne den Tree weiter zu verfolgen und so die Traversierung verloren geht.

## Aufgabe 2 - Cycle Chronicles 

#### 2.1.1 Äquivalenzklassenbildung & Grenzwert-Analyse

| Eingabe     | Gültige ÄK           | ungültige ÄK   |
|-------------|----------------------|----------------|
| Fahrrad Typ | 1_gÄK1: Race         | 1_uÄK4: Gravel |
|| 1_gÄK2: Single_speed | 1_uÄK5: E-Bike |
|| 1_gÄK3: Fixxie       |                |

| Eingabe                                    | Gültige ÄK    | ungültige ÄK  |
|--------------------------------------------|---------------|---------------|
| Masse Aufträge x (inklusive neuem Auftrag) | 2_gÄK1: [0-5] | 2_uÄK2: 5 < x |
Grenzwertanalyse: 5(gÄK1) sowie 6(uÄK2)

| Eingabe                                          | Gültige ÄK  | ungültige ÄK  |
|--------------------------------------------------|-------------|---------------|
| Bereits vorhandene Aufträge eines spez. Kunden x | 3_gÄK1: [0] | 3_uÄK2: 0 < x |
Grenzwertanalyse: 0(gÄK1), 1(uÄK2)

#### 2.1.2 Testfälle

| Testnummer | Klassen                  | Eingabe                       | Erwartung |
|------------|--------------------------|-------------------------------|-----------|
| TC1        | 1_gÄK1 & 2_gÄK1 & 3_gÄK1 | Race; 2; 0                    | Gültig    |
| TC2        | 1_gÄK2 & 2_gÄK1 & 3_gÄK1 | Single Speed; 4; 0            | Gültig    |
| TC3        | 1_gÄK3 & 2_gÄK1 & 3_gÄK1 | Fixxie; 0; 0                  | Gültig    |
| TC4        | 1_uÄK5                   | E-Bike                        | Ungültig  |
| TC5        | 1_uÄK4                   | Gravel-Bike                   | Ungültig  |
| TC6        | 3_uÄK2                   | Kunde hat schon Auftrag offen | Ungültig  |
| TC7        | 2_uÄK2                   | 6ter Auftrag                  | Ungültig  |


### 2.2

Tests passig zu den Testcases aus 2.1.2 mithilfe von Mocks erstellt