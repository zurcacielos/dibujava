# Conjunto Dispersivo

El conjunto dispersivo o conjunto único, es una estructura de datos que nos permite guardar elementos únicos sin duplicados.

En Java la estructura se llama HashSet, y Hash tiene su origen etimológico en la palabra francesa haché que significa "hacheado" o macheteado o cortado para referirse a un trozo de carne cortada en pedazos más pequeños.

Aplicado a nuestro caso un conjunto hacheado o dispersivo, es una tabla de datos que internamente tiene una función de hacheado o "dispersión" que permite dividirla y hacer que las escrituras y los accesos a datos sean más rápidos y no tengamos que recorrer toda la tabla para buscar si un elemento existe o no.

Ejemplo:
```java
HashSet<String> autos = new HashSet<String>();
cars.add("Volvo");
autos.add("BMW");
autos.add("Ford");

imprimir(autos.contains("Mazda"));
```
y eso imprime false.

La velocidad y el poco espacio utilizado, hace que esta estructura sea útil para la resolución de ciertos problemas, como los que se muestran a continuación.

## [Contiene Duplicado](ContieneDuplicado.java)
