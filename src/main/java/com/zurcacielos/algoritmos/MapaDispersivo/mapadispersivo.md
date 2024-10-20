# Mapa Dispersivo

El mapa dispersivo, o tabla dispersiva, es una estructura de datos que nos permite guardar pares de claves y valores.

En Java la estructura se llama HashMap, y Hash tiene su origen etimológico en la palabra francesa haché que significa "hacheado" o macheteado o cortado para referirse a un trozo de carne cortada en pedazos más pequeños.

Aplicado a nuestro caso un mapa hacheado o dispersivo, es una tabla de datos que internamente tiene una función de hacheado o "dispersión" que permite dividirla y hacer que las escrituras y los accesos a datos sean más rápidos y no tengamos que recorrer toda la tabla para buscar una clave o índice.

Ejemplo:
    
```java
miMapa[11] = 29; // aquí 11 es la clave y 29 el valor

imprimir(miMapa[11]);

```
y eso imprime 29.

La velocidad y el poco espacio utilizado, hace que el mapa dispersivo sea útil para la resolución de ciertos problemas, como los que se muestran a continuación.

## [Suma de dos](SumaDeDos.java)
