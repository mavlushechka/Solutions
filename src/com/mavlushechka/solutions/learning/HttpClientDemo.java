package com.mavlushechka.solutions.learning;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.Set;

class HttpClientDemo {
    public static void main(String[] args) throws Exception {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest httpRequest = HttpRequest.newBuilder(new URI("https://www.google.com/")).build();
        HttpResponse<String> httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());

        System.out.println("Response code is " + httpResponse.statusCode());
        System.out.println("Request method is " + httpRequest.method());

        HttpHeaders headers = httpResponse.headers();
        Map<String, List<String>> headersMap = headers.map();
        Set<String> headersField = headersMap.keySet();

        System.out.println("\nHere are the headers:");
        for (String headerField : headersField) {
            System.out.println("Key: " + headerField + " Value: " + headersMap.get(headerField));
        }

        System.out.println("\nHere is the body:");
        System.out.println(httpResponse.body());
    }
}
