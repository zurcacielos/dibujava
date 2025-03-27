`for (int num : nums) { ... }
HashSet<Integer> conjunto = new HashSet<>();
conjunto.add(num);
conjunto.contains(num);
int n = nums.length;
int[] res = new int[n];
res[0] = 1;
for (int i = 1; i < n; i++) { ... }
int posfijo = 1;
for (int i = n - 1; i >= 0; i--) { ... }
int[] nums = {1, 2, 3, 4};
for (int i = 0; i < resultado.length; i++) { ... }
int n = s.length();
if (n == 0) { ... }
int inicio = 0, fin = 0;
for (int i = 0; i < n; i++) { ... }
int largoImpar = expandirDesdeCentro(s, i, i);
int largoPar = expandirDesdeCentro(s, i, i + 1);
int largo = Math.max(largoImpar, largoPar);
if (largo > fin - inicio) { ... }
return s.substring(inicio, fin + 1);
while (izq >= 0 && der < s.length() && s.charAt(izq) == s.charAt(der)) { ... }
int n = s.length();
int contador = 0;
for (int i = 0; i < n; i++) { ... }
int largoImpar = expandirDesdeCentro(s, i, i);
int largoPar = expandirDesdeCentro(s, i, i + 1);
contador += largoImpar + largoPar;
while (izq >= 0 && der < s.length() && s.charAt(izq) == s.charAt(der)) { ... }
int[] nums = { 10, 6, 2, 7, 11, 15 };
int[] nums2 = { 10, 6, 2, 7, 11, 15, 11 };`