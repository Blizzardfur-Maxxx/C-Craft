gcc C-Craft.c -o C-Craft.exe
javac Main.java
javac MainClassic.java
jar cf dllib.jar Main.class
jar cf dllib-classic.jar MainClassic.class
md "build\lib"
move dllib.jar "build\lib"
move dllib-classic.jar "build\lib"
move C-Craft.exe "build"
del Main.class
del MainClassic.class