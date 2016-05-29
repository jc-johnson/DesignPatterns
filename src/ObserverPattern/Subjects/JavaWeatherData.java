package ObserverPattern.Subjects;

import java.util.Observable;

/**
 * Created by jordan on 5/29/16.
 */
public class JavaWeatherData extends Observable {
    private float temperature;
    private float humidity;
    private float pressure;


    /**
     * Constructor no longer needs to create
     * a data structure to hold Obserevers
     */
    public JavaWeatherData() {}

    public void measurementsChagned(){
        /**
         * indicates state that has changed
         * before calling notifyObservers()
         */
        setChanged();

        /**
         * Note we aren't sending a data object with
         * notifyObservers. That means we're using
         * the pull model.
         */
        notifyObservers();
    }

    public void setMeasurments(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChagned();
    }

    public float getTemperature(){
        return temperature;
    }

    public float getHumidity(){
        return humidity;
    }

    public float getPressure(){
        return pressure;
    }


}
