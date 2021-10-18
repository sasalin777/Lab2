import java.util.Arrays;


public class Province {

    private String name;
    private String capital;
    private long population;

    public static final String DEFAULT_PROVINCE="British Columbia";
    public static final String DEFAULT_CAPITAL="Victoria";
    public static final long DEFAULT_POPULATION=4648055;

    //contractor

    public Province() { this(DEFAULT_PROVINCE, DEFAULT_CAPITAL, DEFAULT_POPULATION );}
    public Province(String name,String capital, long population)
    {
        if ((isValidProvince(getName())) && (isValidCapitalCity(getCapital())) &&(isValidPopulation(getPopulation())))
        {
        //checkName(name);
        //checkCapital(capital);
        //checkPopulation(population);
        setName(name);
        setCapital(capital);
        setPopulation(population);}
        else{
        this.population = DEFAULT_POPULATION; // 4,648,055
        this.name = DEFAULT_PROVINCE; // “British Columbia”
        this.capital = DEFAULT_CAPITAL; // “Victoria”

    }
    }



    //getdata





    //check isValidProvince
    boolean isValidProvince(String getName){
        String provinceArray[]={"British Columbia","Yukon","New Brunswick",
                "Newfoundland and Labrador","Northwest Territories","Nova Scotia",
                "Nunavut","Ontario","Prince Edward Island","Quebec"};

        int checkProvince=Arrays.asList(provinceArray).indexOf(getName);

        return (checkProvince != -1  );
    }
    //check isValidCapitalCity

    boolean isValidCapitalCity(String getCapital){
        String CapitalCityArray[]={"Victoria","Whitehorse","Fredericton",
                "St. John's","Yellowknife","Halifax",
                "Iqaluit","Toronto","Charlottetown","Québec City"};

        int checkProvince=Arrays.asList(CapitalCityArray).indexOf(getCapital);

        return (checkProvince != -1  );

    }


    boolean isValidPopulation(long population){

        return ((getPopulation()>=30000) && (getPopulation()<=15000000) );

    }






    public String getDetails(){


        return String.format("The capital of %s (population. %d) is %s.",getName(),getPopulation(),getCapital());


    }












    public String getName() {
        return name;
    }

    public final void setName(String name) {
        //checkName(name);
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public final void setCapital(String capital) {
        //checkCapital(capital);
        this.capital = capital;
    }

    public long getPopulation() { return population; }

    public final void setPopulation(long population) {
        //checkPopulation(population);
        this.population = population;
    }



}
