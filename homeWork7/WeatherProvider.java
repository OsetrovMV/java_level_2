package ru.geekbrains.javacore.qa.homeWork7;

import ru.geekbrains.javacore.qa.homeWork7.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    public void getWeather(Periods period) throws IOException;
}