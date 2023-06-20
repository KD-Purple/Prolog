paso(recibidor,corredor).
paso(corredor,sala).
paso(sala,comedor).
paso(comedor,cocina).
paso(recibidor,puerta1).
paso(puerta1,corredor).
paso(corredor,puerta2).
paso(puerta2,sala).
paso(sala,puerta3).
paso(puerta3,comedor).
paso(comedor,puerta4).
paso(puerta4,cocina).
paso(puerta1,puerta2).
paso(puerta2,puerta3).
paso(puerta3,puerta4).
%El movimiento es a la derecha

ir_de(Y,X):- paso(Y,X).
ir_de(Y,X):- paso(Z,X), ir_de(Y,Z).
