# Técnicas y objetivos

Tratamos de que nuestros algoritmos sean eficientes y vemos que algunas técnicas se repiten, y eso lo observamos como patrones de resolución de problemas.

# Eviar Repeticiones

No hacer la misma cosa dos veces, no calcular lo ya calculado, llevar cuentas e ir dejando rastros en variables acumuladoras o mapas dispersivos, etc.

Muchos algoritmos repiten pasos, iteran sobre estructuras de datos usando las estructuras para (for) y mientras (while), muchas veces anidadas, y juegan, comparan o cotejan al menos dos datos entre sí.

Si comparamos elementos de un array, ej. el 4to con el 9no, tratamos de luego no volver a comparar el 9no con el 4to.

A la vez, tratamos de guardar datos, en forma de suma o en alguna estructura auxiliar para que al procesar cada nuevo elemento, tengamos toda la información posible que nos haya dejado el procesamiento del elemento anterior.

En definitiva es el uso sabio de:
- las estructuras de datos existentes en Java
- los datos que nos dan del problema
- los parámetros de entrada a nuestra función y sus características
- decidir ordenar o pre-procesar dichos parámetros
- qué sistema de recorrido elegimos
- que nos permita resolver el problema de una al primer hallazgo
- o ir almacenando datos en un acumulador o mapa dispersivo, árbol, etc.
- para que a cada paso tengamos mejor información para resolver el problema.
