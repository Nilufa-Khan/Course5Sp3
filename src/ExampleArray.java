import java.util.*;

public class ExampleArray {
    public static void main(String[] args) {
        // a generic list that holds integer value
        // an integer object must be specified for generic type, and not the primitive type interfaces
        //the list contains only integer objects
        //adding any other objects into the list produce compile error
        //this improves class cast exception at run time
        List<Integer> integerList = new ArrayList<>();//generic collection//type safety//type casting not needed//code reusability
        List list = new ArrayList();//non generic collection // this can produce class cast exception//not type safety// type casting required
        //linked list previous  data  next
        LinkedList<String> stringLinkedList = new LinkedList<>();
        System.out.println("Add something to linked list");
        stringLinkedList.add("Raj");
        stringLinkedList.add("rahul");
        stringLinkedList.add("Viban");
        stringLinkedList.add("Chetna");
        System.out.println("stringLinkedList = " + stringLinkedList);
        //addFirst //addLast specified method of linked list
        stringLinkedList.addFirst("Priya");
        System.out.println("stringLinkedList = " + stringLinkedList);
        stringLinkedList.addLast("Farheen");
        System.out.println("stringLinkedList = " + stringLinkedList);
        stringLinkedList.remove(1);
        System.out.println("stringLinkedList = " + stringLinkedList);
     integerList.add(12);
        integerList.add(12);
        //integerList.add("12");// this line produce compiler error
        integerList.add(56);
        integerList.add(39);
        System.out.println("integerList = " + integerList);
        Iterator<Integer> integerIterator = integerList.iterator();
        while (integerIterator.hasNext()){
            integerIterator.next();
            integerList.add(45);
            break;
        }
        System.out.println("integerList = " + integerList);
        System.out.println(integerList.contains(34));
        System.out.println("add something into the list");
        list.add("Piu");
        list.add(10);
        list.add('c');
        System.out.println("list = " + list);
        list.add(2,"Java");
        System.out.println("list = " + list);
        list.set(0,"Nilufa");
        System.out.println("list = " + list);
        list.set(0,14);
        System.out.println("list = " + list);
        list.remove(3);
        System.out.println("list = " + list);
        System.out.println(list.indexOf("Java"));
        System.out.println(list.get(2));
        //traditional forloop
        System.out.println("traditional for loop");
        for (int i = 0; i <stringLinkedList.size() ; i++) {
            System.out.println("stringLinkedList.get(i) = " + stringLinkedList.get(i));
        }
        //enhanced for loop
        System.out.println("Enhanced for loop");
        for(String val : stringLinkedList){
            System.out.println("val = " + val);
        }
        System.out.println("Iteratort interface part 1");
        Iterator<String> stringIterator = stringLinkedList.iterator();
        while(stringIterator.hasNext()){
            System.out.println(stringIterator.next());
        }
        System.out.println("Iterator interface part 2");
        Iterator<Integer> integerIterator1 = integerList.iterator();
        while(integerIterator1.hasNext()){
            System.out.println(integerIterator1.next());

         }
        //listIterator is an interface that extends iterator interface, this iterator only used with list implemented classes
        //it moves both forward and backward direction
        ListIterator<Integer> listIterator = integerList.listIterator();
        while(listIterator.hasPrevious()){
            System.out.println("What it is = "+listIterator.previous());
            //System.out.println(listIterator.previousIndex());

        }

        }



        
       /* int[] arr = {12,34,56,78};
        int search = 56;
        int size = arr.length;
        int res = binarySearch(arr,size,0,(size-1),search);
        System.out.println(res);*/

        /*for (int i = 0; i < arr.length; i++) {
            if(arr[i] == search){
                System.out.println("Elements found at index  = " + i);
                break;
            }
        }*/

    }
   /* public static int binarySearch(int[] arr, int size, int high, int low,int key){
        int mid = (high+low) /2 ;
        if(mid == key){
            return mid;
        }
        if(key > mid){
            mid++;
        }else{
            mid--;
        }
        return mid;
    }*/
    


