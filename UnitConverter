/**
A class that handles unit conversions for length and temperature.
*/
public class UnitConverter {
    /**
    Converts a length value from one unit to another.
    Supported units: cm, m, km, inch
    @param value the value to convert
    @param fromUnit the source unit
    @param toUnit the target unit
    @return the converted value
    */
    public double convertLength(double value, String fromUnit, String toUnit) {
        // Convert everything to meters first
        double meters;
        switch (fromUnit.toLowerCase()) {
            case "cm":   meters = value / 100; break;
            case "m":    meters = value; break;
            case "km":   meters = value * 1000; break;
            case "inch": meters = value * 0.0254; break;
            default:
                System.out.println("Unknown from unit: " + fromUnit);
                return 0;
        }

        // Convert meters to target unit
        switch (toUnit.toLowerCase()) {
            case "cm":   return meters * 100;
            case "m":    return meters;
            case "km":   return meters / 1000;
            case "inch": return meters / 0.0254;
            default:
                System.out.println("Unknown to unit: " + toUnit);
                return 0;
        }
    }

    /**
    Converts a temperature value from one unit to another.
    Supported units: c (Celsius), f (Fahrenheit), k (Kelvin)
    @param value the value to convert
    @param fromUnit the source unit
    @param toUnit the target unit
    @return the converted value
    */
    public double convertTemperature(double value, String fromUnit, String toUnit) {
        // Convert everything to Celsius first
        double celsius;
        switch (fromUnit.toLowerCase()) {
            case "c": celsius = value; break;
            case "f": celsius = (value - 32) * 5.0 / 9; break;
            case "k": celsius = value - 273.15; break;
            default:
                System.out.println("Unknown from unit: " + fromUnit);
                return 0;
        }

        // Convert Celsius to target unit
        switch (toUnit.toLowerCase()) {
            case "c": return celsius;
            case "f": return celsius * 9.0 / 5 + 32;
            case "k": return celsius + 273.15;
            default:
                System.out.println("Unknown to unit: " + toUnit);
                return 0;
        }
    }
}
