millonario(pedro).
millonario(antonio).
millonario(flora).

soltero(eva).
soltero(flora).
soltero(luis).

amigos(pedro,antonio).
amigos(pedro,flora).
amigos(pedro,juan).
amigos(pedro,vicente).
amigos(luis,felipe).
amigos(luis,maria).
amigos(luis,vicente).
amigos(carlos,paloma).
amigos(carlos,lucia).
amigos(carlos,juan).
amigos(carlos,vicente).
amigos(fernando,eva).
amigos(fernando,pedro).

padre(carlos,fernando).
padre(antonio,maria).
padre(antonio,carlos).

amigos_ricos(A,B):- amigos(A,B), millonario(B).
amigos_ricos_s(X,Y):- amigos(X,Y), millonario(Y), soltero(Y).
hijos_conAmigos(antonio,luis,maria).
hijos_conAmigos(antonio,paloma,carlos).
%hijos_conAmigos(X,Y,Z):- padre(X,Y), amigos(Z,X) ,amigos(X,Z).
