package javaapplication7;

import java.util.InputMismatchException;
import java.util.Scanner;


public class Final1 {
public static void main(String[] args) {
Scanner sn = new Scanner(System.in);
boolean salir = false;
int opcion;
while (!salir) {
System.out.println("\n1. Sumatoria");
System.out.println("2. Promedio");
System.out.println("3. Raiz n esima");
System.out.println("4. Factorial");
System.out.println("5. Salir\n");
try {
System.out.println("Elige una opcion");
opcion = sn.nextInt();
switch (opcion) {
case 1:
Scanner ingreso = new Scanner(System.in);
int numr, sumatoria = 0, k;
System.out.print("Ingresa un numero: ");
numr = ingreso.nextInt();
for(k = 0; k <= numr; k++){
sumatoria = sumatoria + k;
}

 System.out.print("La sumatoria de 1 a " + numr + " es " + sumatoria + "\n");
break;
case 2:
int n,s=0,x;
double p;
Scanner teclado = new Scanner(System.in);
System.out.println("Ingresar cantidad de números:");
n=teclado.nextInt();
for(int i=1;i<=n;i++)
{
System.out.println("Número "+i+"=");
x=teclado.nextInt();
s=s+x;
}
p=s/n;
System.out.println("El Promedio es:" +p);
break;
case 3:
Scanner entrada = new Scanner(System.in);
double indice, radicando;
float resultado;
System.out.println("Ingresa radicando");
radicando = entrada.nextDouble();
System.out.println("Ingresa indice");
indice = entrada.nextDouble();
resultado = (float) Math.pow(radicando, 1 / indice);
System.out.println("La raiz " + indice + " de " + radicando + " es : " + resultado);
break;
case 4:
long factorial=1;
int num;
Scanner numero = new Scanner(System.in);
System.out.print("Introduce un número: ");
num = numero.nextInt();
for (int i = num; i > 0; i--) {
factorial = factorial * i;}
System.out.println("El factorial de " + num + " es: " + factorial);
break;
case 5:
salir = true;
break;
default:
System.out.println("Copiar un número entre 1 y 5");
}

 }
catch (InputMismatchException e) {
System.out.println("Copiar un número");
sn.next();
}
finally{
System.out.println("\nFin del ejercicio.");
}
}
}
}