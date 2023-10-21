package org.example.ejercicios;

import java.util.ArrayList;
import java.util.List;

public class  CalculaAreaTriangulo1 {
	public static void main(String[] args) {
		Triangulo triangulo = new Triangulo( 0.5,5.0, 4.0);

		System.out.println("Altura del triángulo: " + triangulo.altura());
		System.out.println("Base del triángulo: " + triangulo.base());
		System.out.println("Área del triángulo: " + area(triangulo));
	}

	record Triangulo(double constante,
					 double altura,
					 double base) { }

	private  static  double area(Triangulo triangulo){
		double area= triangulo.constante()*triangulo.base()* triangulo.altura();
        return area;
    }
}
