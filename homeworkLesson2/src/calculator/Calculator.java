package calculator;

public class Calculator {
    public static void main(String[] args) {
        // Переменные цельсия и фаренгейта
        double celsius = 17.0;
        double farenheit = 65.0;
        double meter = 12.0;
        double inches = 320.0;
        double miles = 12.6;
        double kilometres = 0.5;
        double kilogram = 51.4;
        double pounds = 64.2;
        double kmH = 78.6;
        double miH = 45.0;

        System.out.println(celsiusToKelvin(celsius));
        System.out.println(celsiusToFahrenheit(celsius));
        System.out.println(farenheitToCelsius(farenheit));
        System.out.println(metersToInches(meter));
        System.out.println(inchesToMeters(inches));
        System.out.println(milesToKilometres(miles));
        System.out.println(kilometresToMiles(kilometres));
        System.out.println(kilogramToPound(kilogram));
        System.out.println(poundsToKilograms(pounds));
        System.out.println(kmHToMiH(kmH));
        System.out.println(miHToKmH(miH));

        //convFrom - receives only string: "days", "hours", "min", "sec", "random text";
        //convTo - receives only string: "days", "hours", "min", "sec", "random text";
        System.out.println(secondsTo(100000.00, "hours", "days"));




    }
    // Конвертация из цельсия в кельвин
    static double celsiusToKelvin(double a){
        double result = a + 273.15;
        return result;
    };
    // Конвертация из цельсия в фаренгейт
    static double celsiusToFahrenheit(double b){
        double result = 9.0/5.0 * b + 32;
        return result;
    };
    //Конвертация из фаренгейта в цельсий
    static double farenheitToCelsius(double c){
        double result = 5.0/9.0 * (c - 32);
        return result;
    };
    //Конвертация метры-дюймы
    static double metersToInches(double d){
        double result = d * 39.37;
        return result;
    };
    //Конвертация дюймы-метры
    static double inchesToMeters(double e){
        double result = e / 39.37;
        return result;
    };
    //Конвертация мили-км
    static double milesToKilometres(double f){
        double result = f * 1.609;
        return result;
    };
    //Конвертация км-мили
    static double kilometresToMiles(double g){
        double result = g * 0.621;
        return result;
    };
    //Конвертация килограммы-фунты
    static double kilogramToPound(double h){
        double result = h * 2.20462;
        return result;
    };
    //Конвертация фунты-килограммы
    static String poundsToKilograms(double i){
        String result = i + " pounds is " + (i*0.453592) + " kilogramms";
        return result;
    };
    //Конвертация км\ч => миль\ч
    static String kmHToMiH(double j){
        String result = "Speed in " + j + " km/h is " + (j * 0.6214) + " mi/h";
        return result;
    };
    //Конвертация миль\ч => км\ч
    static String miHToKmH(double k){
        String result = "Speed in " + k + " mi/h is " + (k * 1.60934) + " km/h";
        return result;
    };
    //Конвертация времни в секундах в дни, часы, минуты
    static String secondsTo(double time, String convFrom ,String convTo) {
        if (convFrom == "sec") {
            if (convTo == "days") {
                String result = "In " + time + " seconds there are count of days: " + time / (60 * 60 * 24);
                return result;
            } else if (convTo == "hours") {
                String result = "In " + time + " seconds there are count of hours: " + time / (60 * 60);
                return result;
            } else if (convTo == "min") {
                String result = "In " + time + " seconds there are count of minutes: " + time / 60;
                return result;
            } else if (convTo == "sec"){
                String result = "In " + time + " seconds there are count of seconds: " + time;
                return result;
            } else {
                String errorOut = "Something went wrong !";
                return errorOut;
            }

        } else if (convFrom == "min") {
            if (convTo == "days") {
                String result = "In " + time + " minutes there are count of days: " + time / (60 * 24);
                return result;
            } else if (convTo == "hours") {
                String result = "In " + time + " minutes there are count of hours: " + time / 60;
                return result;
            } else if (convTo == "min") {
                String result = "In " + time + " minutes there are count of minutes: " + time;
                return result;
            } else if (convTo == "sec"){
                String result = "In " + time + " minutes there are count of seconds: " + time * 60;
                return result;
            } else {
                String errorOut = "Something went wrong !";
                return errorOut;
            }
        } else if (convFrom == "hours") {
            if (convTo == "days") {
                String result = "In " + time + " hours there are count of days: " + time / 24;
                return result;
            } else if (convTo == "hours") {
                String result = "In " + time + " hours there are count of hours: " + time;
                return result;
            } else if (convTo == "min") {
                String result = "In " + time + " hours there are count of minutes: " + time * 60;
                return result;
            } else if (convTo == "sec"){
                String result = "In " + time + " hours there are count of seconds: " + (time * 60 * 60);
                return result;
            } else {
                String errorOut = "Something went wrong !";
                return errorOut;
            }
        } else if (convFrom == "days") {
            if (convTo == "days") {
                String result = "In " + time + " days there are count of days: " + time;
                return result;
            } else if (convTo == "hours") {
                String result = "In " + time + " days there are count of hours: " + time * 24;
                return result;
            } else if (convTo == "min") {
                String result = "In " + time + " days there are count of minutes: " + (time * 24 * 60);
                return result;
            } else if (convTo == "sec"){
                String result = "In " + time + " days there are count of seconds: " + (time * 24 *  60 * 60);
                return result;
            } else {
                String errorOut = "Something went wrong !";
                return errorOut;
            }

        } else {
            String errorOut = "Something went wrong !";
            return errorOut;
        }



    };

}
