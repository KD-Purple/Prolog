amigo(pedro,carlos).
amigo(kevin,victor).
amigo(victor,ramiro).
amigo(carlos,victor).
amigo(amanda,paloma).
amigo(paloma,pedro).

amigo_de(Y,X):- amigo(Y,X).
amigo_de(Y,X):- amigo(Z,X), amigo_de(Y,Z).
