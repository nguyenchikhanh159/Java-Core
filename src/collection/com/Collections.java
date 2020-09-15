package collection.com;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.SortedSet;
import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.SortedMap;
public class Collections {
    public static void main(String[] args){
        //////Using list interface
        ////// ArrayList
        List<String> listString = new ArrayList<String>();

        listString.add("One");
        listString.add("Two");
        listString.add("Two");
        listString.add("Three");
        listString.add("Three");
        listString.add("Four");
        //////Set element 2 = four
        listString.set(2,"four");
        ////// Remove element of index 0
        listString.remove(0);
        listString.add("One");
        listString.remove("One");


        //////For loop
        for (int i = 0; i < listString.size(); i++) {
            System.out.println(listString.get(i));
        }
        /////Using interator
        ListIterator<String> listIterator = null;
        listIterator = listString.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
        ///////// LinkedList
        List<String> LinkedList = new LinkedList<String>();
        LinkedList.add("One");
        LinkedList.add("Two");
        LinkedList.add("Two");
        LinkedList.add("Three");
        LinkedList.add("Three");
        LinkedList.add("Four");

        LinkedList.remove("Two");
      /////// Using set interface

        /////// HashSet
        Set<Integer> hashsetInteger = new HashSet<>();
        hashsetInteger.add(41);
        hashsetInteger.add(1);
        hashsetInteger.add(0);
        hashsetInteger.add(8);
        hashsetInteger.add(1);
        hashsetInteger.add(0);
        hashsetInteger.add(3);
        hashsetInteger.add(10);
            System.out.println(hashsetInteger+"\n");
        ListIterator<String> listIterator2=null;
        ///////TreeSet
        Set<Integer> treesetInteger = new TreeSet<>();
        treesetInteger.add(41);
        treesetInteger.add(1);
        treesetInteger.add(0);
        treesetInteger.add(8);
        treesetInteger.add(1);
        treesetInteger.add(3);
        treesetInteger.add(10);

        System.out.println(treesetInteger+"\n");
        ////////Using SortedSet
        ////////TreeSet
        SortedSet<String> sortedSetString = new TreeSet<String>();
        sortedSetString.add("Monday");
        sortedSetString.add("Tuesday");
        sortedSetString.add("Wednesday");
        sortedSetString.add("Thursday");
        sortedSetString.add("Saturday");
        sortedSetString.add("Sunday");
        System.out.println(sortedSetString+"\n");
        ///////////Map interface collection
        ////////// HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(4, "Four");
        hashMap.put(5, "Five");
        hashMap.put(0, "Zero");
        hashMap.put(6, "Six");
        hashMap.put(21, "Twenty first");
        hashMap.put(5, "Five");
        System.out.println(hashMap);
        ///////// TreeMap
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "One");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");
        treeMap.put(0, "Zero");
        treeMap.put(6, "Six");
        treeMap.put(21, "Twenty first");
        treeMap.put(5, "Five");
        System.out.println(treeMap);

        //////////Using SortedMap
        ///////// TreeMap
        SortedMap<Integer, String> sortedMapDomain = new TreeMap<>();
        sortedMapDomain.put(1, "One");
        sortedMapDomain.put(2, "Two");
        sortedMapDomain.put(4, "Four");
        sortedMapDomain.put(5, "Five");
        sortedMapDomain.put(0, "Zero");
        sortedMapDomain.put(6, "Six");
        sortedMapDomain.put(21, "Twenty first");
        sortedMapDomain.put(5, "Five");
        System.out.println(sortedMapDomain);

    }
}
