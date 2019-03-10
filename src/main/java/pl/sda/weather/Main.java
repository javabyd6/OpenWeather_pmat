package pl.sda.weather;


import com.fasterxml.jackson.databind.ObjectMapper;
import pl.sda.weather.model.Weather;

import java.io.IOException;
import java.net.URL;

/**
 * @author pmatusiak
 */
public class Main {

    public static void gimmeWeather(String location) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            Weather weather = mapper.readValue(new URL("http://api.apixu.com/v1/current.json?key=99981e5867494a2cb0d122910191003&q=" + location), Weather.class);
            System.out.println(weather.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        gimmeWeather("Warsaw");
    }
}
