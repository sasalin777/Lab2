public class Canada {

    public static String[] province = {"British Columbia", "Alberta", "Manitoba", "Saskatchewan", "Northwest Territories", "Nova Scotia", "Nunavut", "Ontario", "Prince Edward Island", "Quebec"};

    public static String[] capital = {"Victoria", "Edmonton", "Winnipeg", "Regina", "Yellowknife", "Halifax", "Iqaluit", "Toronto", "Charlottetown", "Quebec City"};

    public static long[] population = {4_648_055, 4_067_175, 1_278_365, 1_098_352, 41_786, 923_598, 35_944, 13_448_494, 142_907, 8_164_361};

    public Canada() { this(province, capital, population);}

    public Canada(String[] province, String[] capital, long[] population) {
        Canada.province = province;
        Canada.capital = capital;
        Canada.population = population;
    }

    public static String displayAllProvinces() {
        int i = 0;
        int l = province.length;
        for (i = 0;i <= l - 1; i++) {
            System.out.printf("\nThe capital of %s (population. %d) is %s.", province[i], population[i], capital[i]);
        }
        return "";
    }
    public boolean getNumOfProvincesBetween(int min, int max){
        long lmin = min*1_000_000;
        long lmax = max*1_000_000;
        for (int j = 0; j <= province.length - 1; j++){
            if ((Canada.population[j] >= lmin) && (Canada.population[j] <= lmax)) {
                System.out.printf("\nThe capital of %s (population. %d) is %s.", province[j], population[j], capital[j]);
            }
        }
        return false;
    }
}