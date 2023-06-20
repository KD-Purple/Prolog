padres(edward,victoria,albert).
padres(alice,victoria,albert).
padres(cecilia,victoria,albert).
padres(pablo,victoria,albert).
padres(gerardo,victoria,nicolas).
padres(humberto,victoria,nicolas).
padres(sofia,victoria,nicolas).
padres(victoria,gloria,silvio).
padres(armando,gloria,silvio).
padres(laura,gloria,silvio).
padres(leonor,laura,juan).
padres(elena,laura,juan).
padres(felipe,laura,juan).
conyuge(victoria,albert).
conyuge(victoria,nicolas).
conyuge(gloria,silvio).
conyuge(laura,juan).
mujer(victoria).
mujer(gloria).
mujer(laura).
mujer(alice).
mujer(sofia).
mujer(elena).
mujer(leonor).
mujer(cecilia).
hombre(albert).
hombre(edward).
hombre(pablo).
hombre(armando).
hombre(silvio).
hombre(nicolas).
hombre(gerardo).
hombre(humberto).
hombre(juan).
hombre(felipe).

madre_de(M1,M2):- padres(M1,M2,X), conyuge(M2,X).
padre_de(P1,P2):- padres(P1,X,P2), conyuge(X,P2).
hermana_de(A,B):- mujer(A), madre_de(A,X), madre_de(B,X).
hermano_de(A,B):- hombre(A), madre_de(A,X), madre_de(B,X).
hermano(A,B):- madre_de(A,X), madre_de(B,X), not(A=B).
sobrino_de(A,B):- hermano(B,X), madre_de(A,X).
sobrino_de(A,B):- hermano(B,X), padre_de(A,X).
tio_de(A,B):- sobrino_de(B,A).
primo(A,B):- tio_de(X,A), madre_de(B,X).
primo(A,B):- tio_de(X,A), padre_de(B,X).
