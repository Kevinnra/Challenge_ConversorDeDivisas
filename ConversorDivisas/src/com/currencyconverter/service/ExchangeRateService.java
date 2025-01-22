package com.currencyconverter.service;

import com.currencyconverter.model.ExchangeRateResponse;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ExchangeRateService {
    private static final String API_URL = "https://v6.exchangerate-api.com/v6/YOUR_API_KEY/latest/USD";
    private ExchangeRateResponse rates;

    public ExchangeRateService() {
        fetchRates();
    }

    private void fetchRates() {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(API_URL))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            Gson gson = new Gson();
            rates = gson.fromJson(response.body(), ExchangeRateResponse.class);
        } catch (IOException | InterruptedException e) {
            System.out.println("Error al obtener las tasas de cambio: " + e.getMessage());
        }
    }

    public double convertCurrency(int option, double amount) {
        if (rates == null || rates.getRates() == null) {
            System.out.println("No se pudieron obtener las tasas de cambio.");
            return 0;
        }

        switch (option) {
            case 1: // USD -> ARS
                return amount * rates.getRates().getArs();
            case 2: // ARS -> USD
                return amount / rates.getRates().getArs();
            case 3: // USD -> BRL
                return amount * rates.getRates().getBrl();
            case 4: // BRL -> USD
                return amount / rates.getRates().getBrl();
            case 5: // USD -> COP
                return amount * rates.getRates().getCop();
            case 6: // COP -> USD
                return amount / rates.getRates().getCop();
            default:
                return 0;
        }
    }
}
