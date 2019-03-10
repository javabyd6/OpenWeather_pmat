package pl.sda.weather.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author pmatusiak
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Condition {
    private String text;
    private String icon;
    private int code;
}
