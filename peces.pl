peces([tiburon,lucio,salmon,bacalao]).
pajaros([halcon,paloma,gorrion,canario]).

animal(A):- peces(X), pertenece(A,X).
animal(A):- pajaros(X), pertenece(A,X).

es_pez(A):- peces(X), pertenece(A,X).

es_pajaro(A):- pajaros(X), pertenece(A,X).
