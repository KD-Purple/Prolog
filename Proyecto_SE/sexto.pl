camino(recibidor,puerta1).
camino(puerta1,corredor).
camino(corredor,puerta2).
camino(puerta2,sala).
camino(sala,puerta3).
camino(puerta3,comedor).
camino(comedor,puerta4).
camino(puerta4,cocina).
camino(recibidor,corredor).
camino(corredor,sala).
camino(sala,comedor).
camino(comedor,cocina).

paso(Y,X):-camino(Y,X).
paso(Y,X):-camino(Z,X),camino(Y,Z).
