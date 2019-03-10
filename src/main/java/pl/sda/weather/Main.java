package pl.sda.weather;


import pl.sda.weather.model.Weather;
import pl.sda.weather.service.WeatherService;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author pmatusiak
 */
public class Main {

    public static void checkWeather() throws IOException {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj miasto ");
        String location = sc.nextLine();

        WeatherService weatherService = new WeatherService("http://api.apixu.com/v1/current.json", "99981e5867494a2cb0d122910191003");
        Weather weather = weatherService.getCityWeather(location);

        System.out.println("Pogoda w mieście " + location + " to: " + weather.getCurrent().getTemp_c());

        sc.close();
    }

    public static void main(String[] args) throws IOException {
        checkWeather();
    }
}
