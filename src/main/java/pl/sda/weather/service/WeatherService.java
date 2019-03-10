package pl.sda.weather.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pl.sda.weather.model.Weather;

import java.io.IOException;
import java.net.URL;

/**
 * @author pmatusiak
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeatherService {
    private String urlAddress;
    private String api;


    public Weather getCityWeather(String location) throws IOException {
        String finalURL = urlAddress + "?key=" + api + "&q=";
        ObjectMapper mapper = new ObjectMapper();
        URL url = new URL(finalURL + location);
        Weather weather = mapper.readValue(url, Weather.class);
        return weather;
    }
}
