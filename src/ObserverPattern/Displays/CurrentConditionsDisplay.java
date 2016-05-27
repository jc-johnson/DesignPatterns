package ObserverPattern.Displays;

import ObserverPattern.Interfaces.DisplayElement;
import ObserverPattern.Interfaces.Observer;
import ObserverPattern.Interfaces.Subject;

/**
 * Created by Jordan on 5/27/2016.
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement{

    private float temperature;
    private float humidity;
    private Subject weatherData;

    // constructor is passed weatherData object(subject)
    // and we use it to register teh display as an observer
    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    // just prints out the most recent temp and humidity
    public void display(){
        System.out.println("Current conditions: " + temperature
            + "F degrees and " + humidity + " % humidity");
    }
}
