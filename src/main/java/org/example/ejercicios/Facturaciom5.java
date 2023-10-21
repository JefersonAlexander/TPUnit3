package org.example.ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Facturaciom5 {
	record Factura(String id,
				   String cliente,
				   LocalDate fechafactura,
				   List<Double> precioProducto) {


	}

	public static void main(String[] args) {
		List<Factura> facturas = new ArrayList<>();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		facturas.add(new Factura("factura1", "Mania Sanabria", LocalDate.parse("01/07/1999",formatter), List.of(4500D, 5000D, 2500D)));
		facturas.add(new Factura("factura2", "Juan Perez", LocalDate.parse("15/08/2000",formatter), List.of(3500D, 6000D, 2800D)));

		String idSearchin="factura2";

		for (Factura factura : facturas) {
			List<Double> precios = factura.precioProducto();
				if(factura.id().equals(idSearchin)){
					System.out.println("Factura: " + factura.id());
					System.out.println("Cliente: " + factura.cliente());
					System.out.println("Total: " + calcularTotalFactura(precios));
					System.out.println("Fecha Factura: "+factura.fechafactura() );
				}
		    }
		}

	private static Double calcularTotalFactura(List<Double> precios) {
		Double totalValor = 0D;
		for (Double precio:precios) {
			totalValor += precio;
		}
		return totalValor;
	}
}
