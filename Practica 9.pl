reinado("Felipe IV", 1621, 1665).
reinado("Carlos II", 1665, 1700).
reinado("Felipe V", 1700, 1746).
reinado("Fernando VI", 1746, 1759).
reinado("Carlos III", 1759, 1788).
reinado("Carlos IV", 1788, 1808).

rey(X,Y):- reinado(X,Z,R),  Y=<R, Y >=Z.

leer:-
 write("Escribe el nombre del rey: "),
 read(X),
 write("Escribe su año: "),
 read(Y),
 rey(X,Y).


get_pass:-
 read(X), test_pass(X).

test_pass(contrasena):-
 write('ok').

test_pass(_):-
 write('error').

numeros:-
    write("Escribe un numero: "),
    read(X),
    ver(X).

ver(X):-
    X > 0,
    C is sqrt(X),
    write(C).

ver(X):-
    X < 0,
    write("El numero no es valido").

