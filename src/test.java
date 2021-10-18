public class test {

    public static void main(String[] args) {
          String[] Province ={"British Columbia","Yukon","New Brunswick",
                "Newfoundland and Labrador","Northwest Territories","Nova Scotia",
                "Nunavut","Ontario","Prince Edward Island","Quebec"};;
          String[] capital ={"Victoria","Whitehorse","Fredericton",
                "St. John's","Yellowknife","Halifax",
                "Iqaluit","Toronto","Charlottetown","Québec City"};;
          long[] population ={4648055,35874,747101,519716,41786,923598,35944,13448494,142907,8164361};
        int i;
        for (i=0;i<=Province.length-1;i++)
        {
            System.out.printf("aaa:%s,bbb:%s,ccc:%d",Province[i],capital[i],population[i]);
        }

    }
}
