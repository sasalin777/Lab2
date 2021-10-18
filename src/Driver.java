public class Driver {
    public static void main(String[] args) {
        Province m1 = new Province();
        Province m2 = new Province("British Columbia", " Victoria", 17770);
        Province m3 = new Province("aaa Columbia", " bbb", 777);
        Canada m7 = new Canada();


        Province[] Provinces = {m1, m2,m3};
        for (Province Province : Provinces) {
            System.out.println();
            //  System.out.println(Province.displayAllProvinces());
            System.out.println();
            System.out.println(Province.getDetails());
            System.out.print("=====================================================");

           // System.out.println(Province.isValidProvince("Ontario"));
            //System.out.println(Province.isValidCapitalCity("Iqaluit"));





        }
        Canada[] Province = {m7};
        for (Canada Canada : Province) {
            System.out.println(Canada.displayAllProvinces());
            System.out.print("=====================================================");
            System.out.println(Canada.getNumOfProvincesBetween(1,15));

        }


    }
}