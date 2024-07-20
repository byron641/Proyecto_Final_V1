package com.example.proyectofinalv1;

import java.util.List;

public class WeatherResponse {
    private List<Weather> weather;
    private Main main;

    public List<Weather> getWeather() {
        return weather;
    }

    public Main getMain() {
        return main;
    }

    public class Weather {
        private String description;

        public String getDescription() {
            return description;
        }
    }

    public class Main {
        private float temp;

        public float getTemp() {
            return temp;
        }
    }
}