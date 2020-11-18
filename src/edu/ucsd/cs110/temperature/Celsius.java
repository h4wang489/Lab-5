package edu.ucsd.cs110.temperature;
public class Celsius extends edu.ucsd.cs110.temperature.Temperature
{
    public Celsius(float t)
    {
        super(t);
    }

    @Override
    public edu.ucsd.cs110.temperature.Temperature toCelsius() {
        return this;
    }

    @Override
    public edu.ucsd.cs110.temperature.Temperature toFahrenheit() {
        float value = ((this.getValue()*9)/5) + 32;
        return new Fahrenheit(value);
    }

    public String toString()
    {
        // TODO: Complete this method
        String s = this.getValue() + " C";
        return s;
    }
}