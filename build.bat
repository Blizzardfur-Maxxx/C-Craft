gcc C-Craft.c -o C-Craft.exe
javac Main.java
jar cf dllib.jar Main.class
md "build\lib"
move dllib.jar "build\lib"
move C-Craft.exe "build"
del Main.class