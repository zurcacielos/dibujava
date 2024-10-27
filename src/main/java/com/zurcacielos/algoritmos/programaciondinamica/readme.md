# Programación dinámica

La técnica se basa en la idea de dividir un problema en subproblemas más pequeños y resolverlos de manera recursiva. Se utiliza para resolver problemas en los que se necesita encontrar la mejor solución posible a un problema dado.

Se fundamenta en la idea de que si podemos resolver un subproblema, podemos utilizar esa solución para resolver el problema original. Esto se conoce como la propiedad de la <span style="color: green;">subestructura óptima</span>. Además, si podemos resolver un subproblema, podemos almacenar esa solución y reutilizarla en el futuro. Esto se conoce como la propiedad de <span style="color: green;">superposición de subproblemas</span>.

En programación dinámica, suele usarse una variable llamada dp (abreviatura de "programación dinámica") la cual se utiliza como una tabla o arreglo para almacenar los resultados de subproblemas ya resueltos. Esto permite evitar el cálculo repetido de los mismos subproblemas, mejorando así la eficiencia del algoritmo.

[Cadenas Palindrómicas](CadenasPalindromicas.java)

[Cambio En Monedas](CambioEnMonedas.java)