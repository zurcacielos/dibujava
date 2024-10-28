# Técnicas y objetivos

La palabra patrón, de la familia etimológica de padre, y significa en nuestro contexto, modelo, molde o plantilla utilizada para la resolución de problemas.

# Evitar Repeticiones

No hacer la misma cosa dos veces, no calcular lo ya calculado, llevar cuentas e ir dejando rastros en variables acumuladoras o mapas dispersivos, etc.

Muchos algoritmos repiten pasos, iteran sobre estructuras de datos usando las estructuras para (for) y mientras (while), muchas veces anidadas, y juegan, comparan o cotejan al menos dos datos entre sí.

Si comparamos elementos de un arreglo, ej. el 4to con el 9no, tratamos de luego no volver a comparar el 9no con el 4to.

A la vez, tratamos de guardar datos, en forma de suma o en alguna estructura auxiliar para que al procesar cada nuevo elemento, tengamos toda la información posible que nos haya dejado el procesamiento del elemento anterior.

En definitiva es el uso sabio de:
- las estructuras de datos existentes en Java
- los datos que nos dan del problema
- los parámetros de entrada a nuestra función y sus características
- decidir ordenar o pre-procesar dichos parámetros
- qué sistema de recorrido elegimos
- que nos permita resolver el problema de una al primer hallazgo
- o ir almacenando datos en un acumulador o mapa dispersivo, árbol, etc.
- a cada paso podríamos tener mejor información para resolver el problema.

Hay que aprovechar al máximo la información que tenemos del problema.
Especial atención a palabras clave como:
- **entero**: si está podría simplificar el problema, si no está, quizás debamos contemplar intervalos alrededor del cero con números negativos y positivos.
- **positivo, negativo**: idem.
- **menor que, mayor que**: si nos indican que algo siempre es mayor o menor que otro elemento, podría llevarnos a pensar en recorrido único de izquierda a derecha o viceversa.
- **ordenado**: implica lo anterior, o sea que números mayores o iguales están del lado derecho.
- **únicos**: si ciertos datos son únicos, podemos ahorrarnos comparaciones.

Por eso es importante analizar cada palabra del problema para ver si nos aporta algo sobre la morfología y topología de los datos.

Se le suman optimizaciones como:
- usar la misma estructura de salida como estructura auxiliar, en vez de usar múltiples estructuras de datos intermedios.
