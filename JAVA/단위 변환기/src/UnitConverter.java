
public class UnitConverter {
	public static final double KILOGRAMS_PER_POUND = 0.45359237;
	public static final double POUNDS_PER_KILOGRAM = 1 / KILOGRAMS_PER_POUND;
	public static final double CENTIMETERS_PER_INCH = 2.54;
	public static final double INCHES_PER_CENTIMETE = 1 / CENTIMETERS_PER_INCH;
	
	public static double toPounds(double kilograms) {
		return kilograms * POUNDS_PER_KILOGRAM;
    }
    public static double toKilograms(double pounds) {
        return pounds * KILOGRAMS_PER_POUND;
    }
    public static double toCentimeters(double inches) {
        return inches * CENTIMETERS_PER_INCH;
    }
    public static double toInches(double centimeters) {
        return centimeters * INCHES_PER_CENTIMETE;
    }
    public static double toFahrenheit(double celsius) {
    	return celsius * (9.0 / 5.0) + 32.0;
    }
    public static double toCelsius(double fahrenheit) {
    	return (fahrenheit - 32.0) * (5.0 / 9.0);
    }
}
