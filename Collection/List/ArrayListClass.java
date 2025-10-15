package List;


import java.util.ArrayList;
// import java.util.List;
// import java.util.Arrays;
// import java.util.Collection;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;
import java.util.Collection;
import java.util.List;


// class MyComparator implements Comparator<Integer>{
//    public int compare(Integer o1, Integer o2) { 
//          return o1 - o2;   // Ascending
//          // return o2 - o1;   // Descending
//    }
// }
public class ArrayListClass {
   // Initial capacity = 10
   // increment with = 1.5 times
   // can set manually

    public static void main(String[] args) {

       
      List<String> list=new ArrayList<>();   // empty array.
      list.add("Apple");
      list.add("Bana");
      list.add("Cherryy");
      list.add("Apple");

      System.out.println(list);

      // System.out.println();

      list.sort((s1, s2)->s1.length()-s2.length());

      // list.sort(new Comparator<String>() {
      //    public int compare(String s1, String s2){
      //       return s1.length()-s2.length();
      //    }
      // });
      System.out.println(list);
      

/*
      ArrayList<Integer> list=new ArrayList<>();
         // Adding elements
         list.add(60); list.add(70); list.add(10); list.add(40); list.add(80); list.add(50);

         System.out.println(list);
         // Collections.sort(list);
         list.sort(new Comparator<Integer>(){
            public int compare(Integer o1, Integer o2) { 
               // return o1 - o2;   // Ascending
               return o2 - o1;   // Descending
            }
         });

         // list.sort((s1, s2)->s1-s2);   // Lambda
         System.out.println(list);  


         // toArray()
         // Object[] arrObjects = list.toArray(); // List to array
         // for (Object object : arrObjects) {
         //    System.out.print("  "+object);
         // }

       // List.of()
      List<Integer> list1= List.of(23,45,46,78,89,34,21);   // Returns an unmodifiable list
      System.out.println(list1);    


      // Arrays.asList()
      // List<Integer> list2 = Arrays.asList(23,45,46,78,89,34,21);
      // System.out.println(list2);
      // System.out.println(list2.getClass().getName()+"\n");

      // // list2.add(Integer.valueOf(55));  // UnsupportedOperationException
      // list2.set(4, 55);     // UnsupportedOperationException
      // System.out.println(list2);
      // System.out.println();

      // Integer[] arr = {23, 45, 46, 78, 89, 34, 21};
      // List<Integer> list3 = Arrays.asList(arr);       // primitive types array not accept
      // System.out.println(list3);
      // System.out.println(list3.getClass().getName()+"\n");

      // String[] arr1 = {"sds", "fred", "jkk", "uyoi"};
      // List<String> list4  = Arrays.asList(arr1);
      // System.out.println(list4);


      //     ArrayList<Integer> list=new ArrayList<>();
      //    // Adding elements
      //    list.add(60);
      //    list.add(70);
      //    list.add(10);
      //    list.add(40);
      //    list.add(80);
      //    list.add(50);
      //    list.add(10);
      //    list.add(20);
      //    list.add(30);
       
      //   // 1 println
      //    System.out.println(list);

      //    System.out.println("Size : "+list.size());
      //    System.out.println(list);


         // List<Integer> subList = list.subList(3, 7);
         // System.out.println(subList);

         // int index = list.lastIndexOf(Integer.valueOf(10));    // 6
         // System.out.println(index);

         // int index = list.indexOf(Integer.valueOf(80));
         // System.out.println(index);

         // list.clear();  // clear list

         // System.out.println(list.isEmpty());

         // list.add(4, 44);

         // list.set(4, 77);     // replace 44 with specified element 77


         // list.remove(Integer.valueOf(50));
         
         // System.out.println(list.remove(2));    // 10
         
         // System.out.println(list.contains(44));



        // 2 Index-Based
         for(int i=0; i<list.size(); i++){
            System.out.print("  "+list.get(i));
         }
         System.out.println();

         // 3 For-Each
         for(Integer e:list){
            System.out.print("  "+e);
         }
         System.out.println();

         // 4 Iterator
         Iterator<Integer> itr = list.iterator();
         while (itr.hasNext()) {
            System.out.print("  "+itr.next());
         }
         System.out.println();

        // 5 ListIterator-Bidirectional
        ListIterator<Integer> listItr = list.listIterator();
         while (listItr.hasNext()) {
            System.out.print("  "+listItr.next());
         }
         System.out.println();

        // 6 Lambda Expression - forEach
        list.forEach(element->{System.out.print("  "+element);});
        System.out.println();

        // 7 Streams - Java 8+
         list.stream().forEach(System.out::print);

*/



    }

}
