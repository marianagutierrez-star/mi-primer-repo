public class Calculadora {
 public int sumar(int a, int b) {
 return a + b;
 }
 public static void main(String[] args) {
 Calculadora calc = new Calculadora();
 int resultado = calc.sumar(5, 10);
 System.out.println("La suma de 5 + 10 es: " + resultado);
 }
}