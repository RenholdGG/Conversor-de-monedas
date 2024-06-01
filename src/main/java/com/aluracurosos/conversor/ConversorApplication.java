package com.aluracurosos.conversor;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.Locale;
import java.util.Scanner;


@SpringBootApplication
public class ConversorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConversorApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {

		int seleccionMenu = 0;
		double monto = 0;
		String ciclo;
		Scanner scanner = new Scanner(System.in);

		System.out.println("""
            *******************************************************
                     BIENVENIDOS AL CONVERSOR DE MONEDAS!
            *******************************************************
            1-Convertir de USD (Dolares) => a EUR (EUROS).
            2-Convertir de EUR (EUROS) => a USD (Dolares).
            3-Convertir de USD (Dolares) => a ARS (Peso Argentino).
            4-Convertir de ARS (Peso Argentino) => a USD (Dolares).
            5-Convertir de USD (Dolares) => a BOB (Peso Boliviano).
            6-Convertir de BOB (Peso Boliviano) => a USD (Dolares).
            7-Convertir de USD (Dolares) => a COP (Peso Colombiano).
            8-Convertir de COP (Peso Colombiano) => a USD (Dolares).
            9-Convertir de USD (Dolares) => a GTQ (Quetzalez).
            10- Convertir de GTQ (Quetzales) => a USD (Dolares).
            11-Salir
            """);
		System.out.println("Seleccione su conversion: ");

		//Inicio ciclo menu con while, sale al usar 11
		while (seleccionMenu != 11) {
			seleccionMenu = scanner.nextInt();
			System.out.println("Cantidad a convertir: ");
			monto = scanner.nextDouble();
			Conversor conversor = new Conversor();

			//Test line para visualizar las opciones seleccionadas
			//System.out.println("Menu: " + seleccionMenu + " Monto: " + monto);

			//Switch que manda a llamar a la funcion, envia las monedas a convertir y el monto
			switch (seleccionMenu) {
				case 1:
					System.out.println("El rate de conversion de: " + monto + "USD a EUR es de: " +
					conversor.conversion("USD", "EUR", monto));
					System.out.println("¿Desea continuar? S/N");
					ciclo = scanner.next();
					if (ciclo.toUpperCase(Locale.ROOT).contentEquals("N")) {
						System.out.println("selecciono No");
						seleccionMenu = 11;
					} else {
						System.out.println("Seleccione su conversion: ");
					}
					break;

				case 2:
					System.out.println("El rate de conversion de: " + monto + "EUR a USD es de: " +
							conversor.conversion("EUR", "USD", monto));
					System.out.println("¿Desea continuar? S/N");
					ciclo = scanner.next();
					if (ciclo.toUpperCase(Locale.ROOT).contentEquals("N")) {
						System.out.println("selecciono No");
						seleccionMenu = 11;
					} else {
						System.out.println("Seleccione su conversion: ");
					}
					break;

				case 3:
					System.out.println("El rate de conversion de: " + monto + "USD a ARS es de: " +
							conversor.conversion("USD", "ARS", monto));
					System.out.println("¿Desea continuar? S/N");
					ciclo = scanner.next();
					if (ciclo.toUpperCase(Locale.ROOT).contentEquals("N")) {
						System.out.println("selecciono No");
						seleccionMenu = 11;
					} else {
						System.out.println("Seleccione su conversion: ");
					}
					break;

				case 4:
					System.out.println("El rate de conversion de: " + monto + "ARS a USD es de: " +
							conversor.conversion("ARS", "USD", monto));
					System.out.println("¿Desea continuar? S/N");
					ciclo = scanner.next();
					if (ciclo.toUpperCase(Locale.ROOT).contentEquals("N")) {
						System.out.println("selecciono No");
						seleccionMenu = 11;
					} else {
						System.out.println("Seleccione su conversion: ");
					}
					break;

				case 5:
					System.out.println("El rate de conversion de: " + monto + "USD a BOB es de: " +
							conversor.conversion("USD", "BOB", monto));
					System.out.println("¿Desea continuar? S/N");
					ciclo = scanner.next();
					if (ciclo.toUpperCase(Locale.ROOT).contentEquals("N")) {
						System.out.println("selecciono No");
						seleccionMenu = 11;
					} else {
						System.out.println("Seleccione su conversion: ");
					}
					break;

				case 6:
					System.out.println("El rate de conversion de: " + monto + "BOB a USD es de: " +
							conversor.conversion("BOB", "USD", monto));
					System.out.println("¿Desea continuar? S/N");
					ciclo = scanner.next();
					if (ciclo.toUpperCase(Locale.ROOT).contentEquals("N")) {
						System.out.println("selecciono No");
						seleccionMenu = 11;
					} else {
						System.out.println("Seleccione su conversion: ");
					}
					break;

				case 7:
					System.out.println("El rate de conversion de: " + monto + "USD a COP es de: " +
							conversor.conversion("USD", "COP", monto));
					System.out.println("¿Desea continuar? S/N");
					ciclo = scanner.next();
					if (ciclo.toUpperCase(Locale.ROOT).contentEquals("N")) {
						System.out.println("selecciono No");
						seleccionMenu = 11;
					} else {
						System.out.println("Seleccione su conversion: ");
					}
					break;

				case 8:
					System.out.println("El rate de conversion de: " + monto + "COP a USD es de: " +
							conversor.conversion("COP", "USD", monto));
					System.out.println("¿Desea continuar? S/N");
					ciclo = scanner.next();
					if (ciclo.toUpperCase(Locale.ROOT).contentEquals("N")) {
						System.out.println("selecciono No");
						seleccionMenu = 11;
					} else {
						System.out.println("Seleccione su conversion: ");
					}
					break;

				case 9:
					System.out.println("El rate de conversion de: " + monto + "USD a GTQ es de: " +
							conversor.conversion("USD", "GTQ", monto));
					System.out.println("¿Desea continuar? S/N");
					ciclo = scanner.next();
					if (ciclo.toUpperCase(Locale.ROOT).contentEquals("N")) {
						System.out.println("selecciono No");
						seleccionMenu = 11;
					} else {
						System.out.println("Seleccione su conversion: ");
					}
					break;

				case 10:
					System.out.println("El rate de conversion de: " + monto + "GTQ a USD es de: " +
							conversor.conversion("GTQ", "USD", monto));
					System.out.println("¿Desea continuar? S/N");
					ciclo = scanner.next();
					if (ciclo.toUpperCase(Locale.ROOT).contentEquals("N")) {
						System.out.println("selecciono No");
						seleccionMenu = 11;
					} else {
						System.out.println("Seleccione su conversion: ");
					}
					break;
				default:
					System.out.println("Seleccion inválida, intente de nuevo");
					seleccionMenu = scanner.nextInt();
			}
		}

		System.out.println("""
            *******************************************************
                  ¡GRACIAS POR UTILIZAR NUESTROS SERVICIOS!
            *******************************************************
                """);

	}

}





