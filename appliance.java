//COLLECTION MAPS IN JAVA
import java.util.Map;
import java.util.HashMap;

class appliance {
    public static void main(String[]args){
        Map<Integer,String> appliance = new HashMap<>();//Creating Empty Map
        System.out.println("appliance DETAIL");
        System.out.println("");

        appliance.put(1,"TV");
        appliance.put(2,"FAN");
        appliance.put(3,"Fridge");
        appliance.put(4,"AC");
        appliance.put(5,"WAshing Machine");

        System.out.println("appliance"+appliance);

        for(Map.Entry<Integer,String>entry : appliance.entrySet()){
            System.out.println("appliance:"+entry.getKey()+entry.getValue());
        }




    }
}