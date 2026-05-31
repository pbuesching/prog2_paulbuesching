# Blatt 04

Es wurden Aufgabe 1, 2 und 4 Bearbeitet.
Die PR Review wurde von Maxim Pass durchgeführt. Im gegenzug habe ich seine Pull Requests Reviewd.

Link zum Synthax Highlighter Repo:
https://github.com/pbuesching/prog2_ybel_syntaxhighlighting

Link zum Repo von Maxim Pass:
https://github.com/4Max0/prog2_ybel_syntaxhighlighting

## Aufgabe 1 - MiniJavaTokens:
### Aufgabe 1.1
Die geforderten Regulären Ausdrücke (für Strings, Chars, Keywords, Annotationen, verschiedene Kommentare) wurden implementiert.  
Zusätzlich habe ich Reguläre Ausdrücke für:
* methoden
* Escapes
* if / while / (etc.) Strukturen

geschrieben.
Für jede wurde auch eine seperate Farbe in `JavaMiniColours` hinzugefügt

### Aufgabe 1.2
Es wurden diverse Tests geschrieben

## Aufgabe 2 - RegexHighlighter
### Aufgabe 2.1
Die Methode wurde nach beschriebenen Bedingungen implementiert.

### Aufgabe 2.2
Auch diese Methode wurde basierend auf den beschriebenen Bedingungen implementiert.

### Aufgabe 2.3
Es wurden JUnit Test implementiert um Funktionalität und randbedingungen zu Prüfen.  
Dabei wurden Test für die Methoden `collectMatches`, `resolveConflicts` und den gesamten Ablauf durch die gegebene Funktion `computeRegions`  

## Aufgabe 4
### Aufgabe 4.1
Es wurde eine Pipline über GitHub Actions angelegt. Diese wird nur bei Pull Requests und manueller Auslösung ausgeführt.  
Die Pipeline führt wie gefordert `build` `test` `spottlessCheck` aus.  

### Aufgabe 4.2
Es wurden die Branches `feature/MiniJavaTokens` und `feature/RegexHighlighter` erstellt.  
Kurz nach der erstellung wurde jeweils eine Draft-Pull Request erstellt.

### Aufgabe 4.3

Beide Pull Requests wurden durch Maxim Pass reviewd.  
Nach seiner Review wurden noch Anpassungen an `JavaMiniTokens` gemacht. So wurde der Regex für `methoden` verbessert und `keywords` erweitert.  
Dannach wurden die Pull Requests approved und in den `master` gemerged.

Im Gegenzug habe ich die beiden Pull Requests von Maxim Pass reviewd. 
Dieser hatte ebenso den `regexHighlighter` bearbeitet.
