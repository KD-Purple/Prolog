hace_reir("Son como niños").
hace_reir("Little nicky").
hace_reir("¿Donde estan las rubias?").
hace_reir("Nosotros los nobles").
hace_reir("Megamente").
hace_llorar("Diario de una pasion").
hace_llorar("Forest Gump").
hace_llorar("Tarzan").
hace_llorar("Desde mi cielo").
hace_llorar("Yo soy Sam").

comedia(X):- hace_reir(X).
triste(X):- hace_llorar(X).
