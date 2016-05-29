package ObserverPattern.Displays;

import ObserverPattern.Interfaces.DisplayElement;
import ObserverPattern.Subjects.JavaWeatherData;
import ObserverPattern.Subjects.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jordan on 5/29/16.
 */
public class JavaCurrentConditionsDisplay implements Observer, DisplayElement{
    Observable observable; // An observable object
    private float temperature;
    private float humidity;

    public JavaCurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof JavaWeatherData) {
            JavaWeatherData javaWeatherData = (JavaWeatherData)obs;
            this.temperature = javaWeatherData.getTemperature();
            this.humidity = javaWeatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
            + "F degrees and " + humidity + "% humidity");
    }
}
