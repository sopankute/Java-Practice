


import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListClass {

    public static void main(String[] args) {
        
        // CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

        // List<String> list = new ArrayList<>();  // ConcurrentModificationException
        List<String> originalList = new CopyOnWriteArrayList<>();  

        originalList.add("Milk");
        originalList.add("Breads");
        originalList.add("Eggs");
        originalList.add("Samosa");

        System.out.println(originalList);

        for (String item : originalList) {
            System.out.print("   "+item);           // read 
            if(item.equals("Breads")){
                originalList.add("Butter");                 // write
            }
        }
        System.out.println();
        System.out.println("Final List : "+originalList);

    }
}
