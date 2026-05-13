// V3: Implementación funcional
public class Factorial {
public static long calcular(int n) {
return LongStream
.rangeClosed(1, n)
.reduce(1, (a, b) -> a * b);
}
}