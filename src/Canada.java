public class Canada {


     public static String[] Province = {"British Columbia", "Alberta", "Manitoba",
            "Saskatchewan", "Northwest Territories", "Nova Scotia",
            "Nunavut", "Ontario", "Prince Edward Island", "Quebec"};

    public static String[] capital = {"Victoria", "Edmonton", "Winnipeg",
            "Regina", "Yellowknife", "Halifax",
            "Iqaluit", "Toronto", "Charlottetown", "Quebec City"};

    public static long[] population = {4648055, 4067175, 1278365, 1098352, 41786, 923598, 35944, 13448494, 142907, 8164361};


    public Canada() { this(Province, capital, population );}

    public Canada(String[] province, String[] capital, long[] population) {
        Canada.Province=Province;
        Canada.capital=capital;
        Canada.population =population;

    }

    public static String displayAllProvinces() {
        int i=0;
        int l=Province.length;
        for (i=0;i<=l-1;i++) {

            System.out.printf("\nThe capital of %s (population. %d) is %s.",Province[i],population[i],capital[i]);
        }
                return "";
    }
    public boolean getNumOfProvincesBetween(int min, int max){
       long lmin=min*1000000;
       long lmax=max*1000000;
       for (int j=0;j<= Province.length-1;j++){
            if ((Canada.population[j] >= lmin) && (Canada.population[j] <= lmax)) {
                System.out.printf("\nThe capital of %s (population. %d) is %s.",Province[j],population[j],capital[j]);

            }
        }


        return false;
    }


}