import java.util.List;
import java.util.ArrayList;

class oops {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // creating list
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Grapes");
        list.add("Orange");
        System.out.println("Fruits:"+list);

        list.remove("Cherry");
        System.out.println("Fruits:"+list);

        String find_fruit = list.get(3);



    }
}
