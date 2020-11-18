package edu.ucsd.cs110.temperature;
public class Fahrenheit extends edu.ucsd.cs110.temperature.Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public edu.ucsd.cs110.temperature.Temperature toCelsius() {
        float value = ((this.getValue()-32)*5)/9;
        return new Celsius(value);
    }

    @Override
    public edu.ucsd.cs110.temperature.Temperature toFahrenheit() {
        return this;
    }

    public String toString()
    {
        // TODO: Complete this method
        return this.getValue() + " F";
    }
}