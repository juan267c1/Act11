package javahomework;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
import java.util.Scanner;

public class Act11Java {
 public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in)); 
        int sqrt, circ, opc, trin;
        String repeat;
       do{
        System.out.println("Que figura deseas saber la area y perimetro?");
        System.out.println("1) Circulo\n2) Cuadrado\n3) Triangulo");
        opc= sc.nextInt();

      switch(opc){
          case 1:
        System.out.println("Cual es el tamaño de la figura?");
        circ = sc.nextInt();
        Circle circle = new Circle(circ);
        System.out.println("Area del circulo es: "+circle.area());
        System.out.println("Perimetro del circulo es: "+ circle.perimeter());
        break;
          case 2:
         System.out.println("Cual es el tamaño de la figura?");
        sqrt = sc.nextInt();
        Square square = new Square(sqrt);
        System.out.println("Area del cuadrado es: "+ square.area());
        System.out.println("Perimetro del cuadrado es: "+square.perimeter());
        break;
        
          case 3:
        System.out.println("Cual es el tamaño de la figura?");
        trin = sc.nextInt();
        triangle triangle = new triangle(trin);
        System.out.println("Area del triangulo es: "+ triangle.area());
        System.out.println("Perimetro del triangulo es: "+triangle.perimeter());
        break;

    }System.out.println("Repetir menu?\n si o no");
    repeat=lector.readLine();
       }while(repeat.equals("si"));
 
}
}

