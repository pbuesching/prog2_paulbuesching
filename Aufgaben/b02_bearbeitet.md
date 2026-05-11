# Blatt 02:
## Git-Spiel
### 1.
Vorgehen: 
- `git clone`
- Änderung in der Datei `hero.md`
- `git add hero.md` und `git commit -m "Changes in hero.md"` 
- `git merge end -m "Mergin end branch into master"`

Beobachtung:  
Der Merge funktioniert problemlos. Der Merge betrachtet also quasi nur Dateien die seit der erschaffung des Branches in dem neuen Branch bearbeitet wurden. Dateien die nicht bearbeitet wurden werden beim Merge also nicht beachtet und geraten somit auch nicht in Konflikt mit Dateien im Master Branch.

Konfliktlösung:  
/

### 2.
Vorgehen:
- `git clone`
- Änderung in der Datei `rucksack.md` ( `1 Heiltrank` -> `2 Heiltrank`)
- `git add rucksack.md` und `git commit -m "..."`
- `git merge end -m "..."`
- Merge Konflikt : 'Automatic merge failed'
- Manuelles Bearbeiten der Datei `Rucksack.md` mit dem automatisch hinzugefügtem Merge konflikt.
- `git add rucksack.md` und `git commit -m "..."`

Beobachtung:
Nach dem versuchten Merge werden automatisch die Merge Details zur Problemdatei hinzugefügt. Dadurch das ein Konflikt entsteht kann man sehen das beim Mergen nicht die Datein im einzelnen angeguckt werden sondern ob es generell eine Veränderung gibt und wenn ja, das dann nochmal überprüft werden muss, egal ob die Änderungen in den beiden Branches etwas miteinander zu tun haben müssten.  
Nach dem Hinzufügen und commiten der Problemdatei sind die anderen Datein auch automatisch gemerged und man muss sie nicht nochmal extra behandeln.

Konfliktlösung:  
Manuelles Mergen/Bearbeiten der Datei.

### 3.1 (Identische Änderung)
Vorgehen:
- `git clone`
- Änderung in der Datei `stats.md` ( `health` auf `2`)
- `git add stats.md` und `git commit -m "..."`
- `git merge end -m "..."`
- Merge Konflikt : 'Automatic merge failed'
- Manuelles Bearbeiten der Datei `stats.md` mit dem automatisch hinzugefügtem Merge konflikt.
- `git add stats.md` und `git commit -m "..."`

Beobachtung:
Bei dem Mergekonflikt werden nur die anderen neuerungen in der Datei als Problematisch angezeigt, die eigenhändige Änderung auf den gleichen Wert wie im end Branch wird sozusagen nicht erkannt/problematisiert, sondern einfach passig gemerged. Was also einfach nur zählt, ist sozusagen das es eine neue Version von der Datei gibt und nicht der Inhalt, der noch gleich zur Stammdatei von beiden Versionen ist.  
Heißt letzendlich aber auch, dass wenn man die Master datei genau die gleichen Werte einträgt wie in die end Datei, es ohne Probleme Mergen würde.

Konfliktlösung:  
Manuelles Mergen/Löschen der veralteten Werte aus Master Datei.

### 3.2 (Unterschiedliche Änderung)
Vorgehen:
- `git clone`
- Änderung in der Datei `stats.md` ( `hunger` auf `5`)
- `git add stats.md` und `git commit -m "..."`
- `git merge end -m "..."`
- Merge Konflikt : 'Automatic merge failed'
- Manuelles Bearbeiten der Datei `stats.md` mit dem automatisch hinzugefügtem Merge konflikt.
- `git add stats.md` und `git commit -m "..."`

Beobachtung:
Ähnlich wie beim vorangehenden Beispiel entsteht ein Merge Konflikt, diesmal wird auch die Manuelle Änderung mit als Konflikt markiert weil sie sich von der end Datei unterscheidet.

Konfliktlösung:  
Manuelles Mergen/Löschen der unpassenderen Werte.

### 4.
Vorgehen:
- `git clone`
- Änderung in der Datei `rucksack.md` ( `1 Heiltrank` -> `2 Heiltrank`)
- `git add rucksack.md` und `git commit -m "..."`
- `git rebase master end`
- Fehler: CONFLICT (content): Merge conflict in rucksack.md
- Manuelles beheben des Konfliktes.
- `git add rucksack.md`
- `git rebase --continue`
- `git switch master`
- `git merge end -m "..."`

Beobachtung:  
Nach dem Rebasen funktioniert der Merge einwandfrei, (hier hätte zusätzlich der FastForward Command gut funktioniert.). Der Konflikt ist letztendlich aber quasi der gleiche als hätte man direkt gemerged (Es war die gleiche Auswahl/Situation wie in '2.'). Dafür hat man allerdings den Vorteil das man diesen Prozess erstmal sicher auf dem anderen Branch macht. Auch ist mir aufgefallen das man nach diesem rebase erstmal vom Master Branch auf den end Branch geschoben wird.

Konfliktlösung:  
Rebase -> Manuelles anpassen des Konfliktes.


## Katzen-Cafe
- Über GitHub die Fork-Funktion nutzen
- `git clone`

### Gradle

1. `gradle init` ausführen
2. Passige Konfiguration auswählen (Applikation, Java, Groovy, JUnit Jupiter, etc.)
3. Originalen src Ordner in den neuen Gradle Ordner app Verschieben und generierten src Ordner ersetzen.
4. In build.gradle Spotless als Plugin hinzufügen und dafür googleJavaFormat() auswählen.
5. Im build.gradle unter application den Parameter `mainClass = 'catcafe.Main` hinzufügen
6. Über `gradle run` wird nun `catcafe.Main` ausgeführt.
7. Mit `gradle test` lassen sich die JUnit Tests ausführen.

### JUnit

#### Warum sind die von Ihnen formulierten Testfälle Relevenat?
Sie Überprüfen die Funktionalität der Implementierten Methoden. Wenn etwas geändert wird fällt direkt durch diese Tests auf ob dabei etwas wichtiges vergessen wurde oder rausgelöscht wurde was man auf den ersten Blick als irrelevant betrachtete.

#### Warum halten Sie die formulierten Testfälle für unterschiedlich?
Die formulierten Testfälle behandeln zwar teilweise die gleichen Methoden und haben eine ähnliche struktur, allerdings kümmern sie sich um ganz verschiedene Situationen. Sie überprüfen Standart fälle, sowie fehler von der User-Seite aus (z.B. wird korrekt überprüft dass das Min-Gewicht kleiner als das Max-Gewicht ist). Auch Sonderfälle, wie z.B. die dopplung von Daten, werden möglichst versucht bearbeitet zu werden.

## Remotes und CI-Pipeline
Die Pipline wurde hinzugefügt und wird ausgeführt. (Tests wird als fehlgeschlagen angezeigt, liegt aber nicht am Build sonder an einem Test der Fehlschlägt für den meines erachtens nach der Source Code passig geändert werden müsste.)

Link zum Katzen Café Repo: https://github.com/pbuesching/prog2_ybel_catcafe