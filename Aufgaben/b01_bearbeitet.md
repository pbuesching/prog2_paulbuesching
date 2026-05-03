# Blatt 01:
## Git
### Aufgabe 1: Git Status erklären

In der Ausgabe des Befehls `git status` im Projektordner `pm-lecture` erfährt man zuerst, dass sich das Projekt aktuell auf der branche `b03` befindet.  
Darauf folgen die Informationen, dass die Dateien `CONTRIBUTING.md` und `homework/b03.md` geändert wurden aber noch nicht in den Index aufgenommen wurden.  
In der nächsten Zeile (`Untracked files:`) gibt git einem die Rückmeldung, dass die Datei `foo.java` im Arbeitsverzeichnis ist, aber eine nicht-versionierte Datei ist.  
Als Letztes gibt git die Ausgabe, das keine Änderungen der Staging Area hinzugefügt wurden, die man commiten könnte, darauf folgt noch ein Hinweis mit welchen Befehlen man das tun könnte.  
Darauf hin ist die Ausgabe beendet.

Um die Datei `foo.java` dem Git Repo hinzuzufügen würde ich folgende Befehlssequenz nutzen:  
`git add foo.java`  
`git commit -m "java.foo hinzugefügt"`

### Aufgabe 2: Git-Spiel

#### 1.
- An Tag 1 passiert 
- Der Held hat das erste Mal 4 experience Punkte mit dem Commit `tag 01.03`
- Mit dem Commit `tag 02` wird der Hunger Wert das erste mal auf 10 gesetzt
- Er hatte über die Zeit 2 Heiltränke
- Der Held hat für je 5 Gold ein Zwergenbrot und einen Heiltrank gekauft.
- Zwischen den beiden Commit Versionen wird ein Satz im questlog hinzugefügt. Der Held verliert sein Gold während sein health Wert auf 10 steigt und hunger wert auf 0 sinkt. In den Commits (tag03.01-17) dazwischen verhandelt der Held mit den Shopkeeper um Brot und Heiltrank. 
- Am Ende von Tag 03 isst der Held ein Zwergenbrot.

#### 2.
1. In der Datei stats.md den experience Wert auf 42 erhöhen.
2. `git add stats.md` ausführen
3. `git commit --amend` ausführen

#### 3.
1. Geschichte weiterschreiben
2. `git add questlog.md` ausführen
3. `git commit -m "tag 04.6"` ausführen

#### 4.
1. Geschichte in `questlog.md` weiterschreiben
2. Änderungen in `rucksack.md`
3. Anpassungen in `stats.md`
4. `git add .` ausführen
5. `git commit -m "tag 04.7"` ausführen

#### 5.
1. Datei `gear.md` erstellen
2. `git add gear.md` ausführen
3. `stats.md` bearbeiten
4. `git add stats.md` ausführen
5. `git commit -m "tag 04.8"` ausführen


### Aufgabe 3: Commit-Meldungen

#### Commit 46530b6:
Gut hervorzuheben finde ich erstmal die verlinkung auf ein Issue, als auch die Strukturierung des Commits.
Die Stichpunkte mit dem vorangestelltem '*' geben allem eine gute struktur und lesbarkeit.  
Inhaltlich finde ich die Commit-Message aber eher schwach.  
Die erste Zeile/Überschrift gibt kaum Infos woran genau gearbeitet wurde, sondern zeigt nur ein Wages Überthema. Eine art Tag am Anfang wie es in anderen Commits vorhanden ist könnte schonmal helfen, dazu noch eine etwas präzisserer Wortwahl, z.B. `rebased Layer system 5` o.ä.  
Der Punkt `rebase` alleine ist zwar nicht schlecht aber doppelt sich mit dem Punkt `rebase/merge`. Zusätzlich ist der Punkt `spotlessApply` (soweit ich ihn verstehe) auch sehr ähnlich zum rebase Thema. Daher denke ich könnte man eher einen stichpunkt machen, der die drei Punkte zusammenfäst.  
Den letzten Punkt finde ich solide, evtl. hätte man noch dazu schreiben können was genau daran geupdated wurde, je nachdem wie groß diese Themen selber sind.
#### Commit 3e37472:
Im Vergleich zum anderen Commit finde ich diesen deutlich besser. 
Was gleich ist, ist der Bezug auf ein Issue und die Strukturierung mithilfe von '*'-Stichpunkten. Beides finde ich hier auch wieder gut.  
Die Überschrift nutzt am Anfang eine art Tag, dadurch wird schonmal besser zugeordnet worum es geht. Den Text selber finde ich auch passig, da er genau beschreibt was verbessert wurde.  
Die darauf folgenden Stichpunkte sagen gut aus was im Detail verbessert wurde, sie sind dabei aber auch nicht zu lang, sondern kurz und prägnant.
Generell sehe ich an dieser Commit Message kaum verbesserungspotenzial.

## Installation der Tools für Prog2

### Gradle

1. Durch das nutzen von `gradle tasks` bekommt man im Terminal eine liste aller ausführbaren tasks
2. Aufgebaut ist die angelegte Struktur in mehrere Odner, am wichtigsten das Verzeichnis 'app->src->main->java' und 'app->src->test' in diese beiden Ordner kommt der geschriebene Java Codes und die Tests. Im Hauptverzeichnis gibt es noch zwei weitere Odner. Der Ordner 'build' wird zukünftig die erzeugten Datein beim Kompilieren und Ausführen des Source Codes enthalten. Der andere Ordner 'gradle' gehört zum Gradle wrapper, wovon sich auch zwei dateien im Hauptverzeichnis befinden (gradlew/gradlew.bat).
3. Das build script ist in mehrere abschnitte Unterteilt:
- plugins: Hier wird festgelegt welche Plugins genutzt werden
- repositories: Legt fest wo dependencies her geladen werden (hier MavenCentral)
- dependencies: Dieser Block zeigt welche dependencies für das Projekt benötigt werden (z.B. JUnit)
- java: Hier wird festgelegt welche Java Version genutzt wird
- tasks: Am ende können eigene Task definiert werden, der hier eingeführte Task besteht nur aus einem call zu einer funktion die kurt davor im block 'dependencies' implementiert worden ist.
- application: Das application plugin legt fest wo die Java Datein gespeichert werden/wo die main gespeichert wird.
4. In der IDE IntelliJ gibt es an der rechten Seite ein gradle Logo, wenn man diesen Tab öffnet bekommt man eine Liste von allen Tasks. Diese kann man durch einen simplen Doppelklick ausführen.


### Spotless

Die main.java wird sich durch spotless ändern sobald man in der Konsole `gradle spotlessApply` anwendet.
