package ru.geekbrains.javacore.qa.homeWork6;

import ru.geekbrains.javacore.qa.homeWork6.period.Periods;

import java.io.IOException;

public interface WeatherProvider {

    public void getWeather(Periods period) throws IOException;
}

