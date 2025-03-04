//COLLECTION MAPS IN JAVA
import java.util.Map;
import java.util.HashMap;

class map {
    public static void main(String[]args){
        Map<String,Integer> country = new HashMap<>();//Creating Empty Map
        System.out.println("COUMTRIES DETAIL");
        System.out.println("");

        country.put("INDIA",1);
        country.put("CHINA",2);
        country.put("NORTH KOREA",7);

        System.out.println("COUMTRIES"+country);

        for(Map.Entry<String,Integer>entry : country.entrySet()){
            System.out.println("COUNTRIES :"+entry.getKey()+entry.getValue());
        }




    }
}