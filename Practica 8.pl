meses([enero,marzo,abril,junio,octubre]).
historial_empleado(perez,[juan,[ventas,gerente],londres,[enero,1993]]).
historial_empleado(gomez,[jaime,[prod,gerente],luton,[junio,1994]]).
peces([tiburon,lucio,salmon,bacalao]).
pajaros([halcon,paloma,gorrion,canario]).
empleados(gerente,[gomez, sanchez, perez]).
empleados(administrativos,[villar, jimenez, chapa]).
empleados(tecnicos,[gonzalez, flores, salas]).

pertenece(E,[E|_]).
pertenece(E,[_|T]):- pertenece(E,T).

gerente(G):- empleados(gerente,L), pertenece(G,L).
es_empleado(E):- empleados(_,L), pertenece(E,L).
que_empleo(E,Y):- empleados(Y,L), pertenece(E,L).
animal(A):- peces(X), pertenece(A,X).
animal(A):- pajaros(X), pertenece(A,X).
es_pez(A):- peces(X), pertenece(A,X).
es_pajaro(A):- pajaros(X), pertenece(A,X).


