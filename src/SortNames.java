import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortNames {
    public static void main(String[] args) {
        //All elements in the list  must implement the comparable interface
        //predefined objects are implement comparable interface
        List<String> list = Arrays.asList("Nilufa","Zaid","Rahul","Aakash","Bani");
        Collections.sort(list);
        for(String res : list){
            System.out.println("res = " + res);
        }
        //user defined java objects
        // to implement sorting logic Address class must implement the comparable interface
        //so that addressList can be passed to the collections.sort() method
       /*   public class Address implements Comparable<Address> // the generic specified in the comparable is Address
       this shows that comparable interface only work with objects of the address class..
       the compareTo method must be overriden.. The compareTo() method takes as a parameter the object specified int the generic of the comparable interface
       that is Address.
       public int compareTo(Address obj).. it return the int value.
       if current address  object == Address obj  return = 0;
        if current address  object < Address obj  return = -1;
        if current address  object > Address obj  return = 1;

        List<Address> addressList = Arrays.asList(new Address("Hana",1,"Hip"));*/
    }
}
