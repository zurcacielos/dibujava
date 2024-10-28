# Retroceso

## Detalle del proceso
- Explorar la celda: Cuando el algoritmo llega a una celda, la marca como visitada para evitar volver a pasar por ella en el mismo camino.
- Recorrer los vecinos: El algoritmo trata de avanzar hacia las celdas vecinas, buscando un camino que cumpla con las condiciones del problema.
- Retroceder: Si un camino no conduce a una solución (por ejemplo, no se encuentra la celda objetivo o el camino es un callejón sin salida), el algoritmo retrocede a la celda anterior.
- Desmarcar como visitada: Al retroceder, se suele desmarcar la celda actual como no visitada para permitir que futuros caminos puedan usar esa celda. Esto es necesario en problemas donde hay múltiples caminos posibles y el algoritmo necesita explorar todas las combinaciones posibles.

## Ejemplo en un laberinto
Si estás buscando una salida en un laberinto y llegas a un callejón sin salida, el algoritmo retrocede a la celda anterior y desmarca la celda actual como visitada. Así, si más adelante se prueba un camino alternativo, esa celda podrá ser utilizada de nuevo en ese nuevo recorrido.

En resumen, esta técnica de "desmarcar" celdas al retroceder es crucial en problemas de búsqueda con backtracking para permitir la exploración exhaustiva de todos los posibles caminos.

[Buscar Palabra En Grilla](BuscarPalabraEnGrilla.java)