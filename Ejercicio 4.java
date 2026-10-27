import java.util.Random;
public class Main {
public static void main(String[] args) {
// Crear el generador de números aleatorios
Random aleatorio = new Random();
// Generar un número entre 1 y 7
int numero = aleatorio.nextInt(7) + 1;
// Mostrar el número generado
System.out.println("Número generado: " + numero);
// Determinar el día de la semana
switch (numero) {
case 1:
System.out.println("Día correspondiente: lunes");
break;
case 2:
System.out.println("Día correspondiente: martes");
break;
case 3:
System.out.println("Día correspondiente: miércoles");
break;
case 4:
System.out.println("Día correspondiente: jueves");
break;
case 5:
System.out.println("Día correspondiente: viernes");
break;
case 6:
System.out.println("Día correspondiente: sábado");
break;
case 7:
System.out.println("Día correspondiente: domingo");
break;
}
}
}