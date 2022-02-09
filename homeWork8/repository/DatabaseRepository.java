package ru.geekbrains.javacore.qa.homeWork8.repository;

import ru.geekbrains.javacore.qa.homeWork8.entity.WeatherData;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface DatabaseRepository {

    boolean saveWeatherData(WeatherData weatherData) throws SQLException;

    List<WeatherData> getAllSavedData() throws IOException, SQLException;

    void closeConnection();
}
