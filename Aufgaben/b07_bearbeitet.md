# Blatt 07

## Aufgabe 1 - Zoo

### Aufgabe 1.2

#### Ausgewählte Datenstruktur:
Ich habe als Datenstruktur ein Set gewählt.
Da Sets keine Duplikate zulassen ist es perfekt geeignet. 
Auch da keine Sortierung Notwendig ist, ist es eine bessere option als eine Liste. Die (mögliche) ständige Veränderung der Gehege sorgt dafür das ein Array mit seiner statischen Größe auch ungeeignet wäre.

## Aufgabe 2 - Logging

### Demo

Die Demo kann über die java Datei Demo.java im Package zoo aufgerufen werden. 
Sie enthält die Methode main, wenn diese aufgerufen wird werden zwei beispiel Zoos erzeugt. Der erste zeigt alle Logs an, beim zweiten werden nur die relevantesten ausgegeben.

## Aufgabe 3 - Reflektion

### Aufgabe 3.1 Generics

- Die Generics helfen dabei von Anfang an die Tiere richtig zuzuweisen und verhindern das ein Falscher Typ in die Falsche Klasse kommt
- Beispielsweise wird beim Aquarium durch `extends Fish` verhindert das man ein Säugetier hinzufügen kann.

### Aufgabe 3.2 Logging

- Logging bietet den Vorteil alle Meldungen sortiert zu haben
- Wenn man zum Debugging nur eine spezielle Stufe braucht kann man die anderen Nachrichten Problemlos ausblenden
- Wenn es nicht gebraucht wird kann es einfach ausgeschalltet werden
- Die Logs können auch einfach in einer Datei gespeichert werden und sind damit nicht von der aktuellen Instanz des Terminals abhängig.


- INFO: Bietet sich für alle möglichen Sachen an. Kann gut genutzt werden um den Fortschritt im Code zu dokumentieren oder zwischenergebnisse Auszugeben.
- WARNING: An stellen wo manche Argumente fehlen oder logisch keinen Sinn machen, aber an sich keine Probleme im Programm auslösen sollten.
- SEVERE: Kurz vor einer Exception, also wenn Argumente fehlen oder falschen Inhalt haben, wenn sie wichtig für das Fortlaufen und richtig Funktionieren des Codes sind.

### Aufgabe 3.3 Streams

- Beim zusammenführen aller Tiere mit `FlatMap` waren Streams deutlich kompakter und hilfreicher als klassische Schleifen
- Auch das sortieren durch eienen simplen Befehl war sehr angenehm

- Unübersichtlich wurde es beim Einsatz von Collect und GroupBy
- Auch im Zusammenhang mit dem Rückgabewert einer Map fand ich es ein bisschen undurchsichtig.