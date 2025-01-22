package com.currencyconverter;

import com.currencyconverter.service.ExchangeRateService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExchangeRateService service = new ExchangeRateService();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("Bienvenido al convertidor de monedas 🌎");
            System.out.println("1. Dólar -> Peso Argentino");
            System.out.println("2. Peso Argentino -> Dólar");
            System.out.println("3. Dólar -> Real Brasileño");
            System.out.println("4. Real Brasileño -> Dólar");
            System.out.println("5. Dólar -> Peso Colombiano");
            System.out.println("6. Peso Colombiano -> Dólar");
            System.out.println("7. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            if (option >= 1 && option <= 6) {
                System.out.print("Ingresa la cantidad: ");
                double amount = scanner.nextDouble();
                double result = service.convertCurrency(option, amount);
                System.out.printf("Resultado: %.2f\n\n", result);
            } else if (option != 7) {
                System.out.println("Opción inválida. Intenta de nuevo.\n");
            }
        } while (option != 7);

        System.out.println("¡Gracias por usar el convertidor! 🌟");
        scanner.close();
    }
}
