package Demo;

import java.util.*;

public class ExampleList {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("array3");
        arrayList.add("array4");
        arrayList.add("array1");
        arrayList.add("array2");

        for (String alist : arrayList) {
            System.out.println("ArrayList : " + alist);
        }

        ListIterator<String> listIterator = arrayList.listIterator();

        while(listIterator.hasNext()){
            System.out.println("listiterator : " + listIterator.next());
        }

        List<String> linkedList = new LinkedList<>();
        linkedList.add(null);
        linkedList.add("array3");
        linkedList.add("array4");
        linkedList.add("array1");
        linkedList.add("array2");
        linkedList.add(null);

        for (String alinkedlist : linkedList ) {
            System.out.println("ArrayList : " + alinkedlist);
        }
        
        Stack<String> o = new Stack();
        o.add("stack4");
        o.add("stack1");
        o.add("stack2");
        o.add("stack3");
//        o.remove("stack1");
//        System.out.println(o.pop());
        System.out.println(o.size());
        System.out.println("stackpeek  = " + o.peek());

//        o.set(1,"stack11");
//
//        for (int index = 0; index< o.size() ; index++ ){
//            if (o.get(index).equals("stack11")) {
//                    o.set(index, "hello");
//            }
//        }

        for (String e: o ) {
//            e.replace("stack1", "sta");
            System.out.println("stack = " + e);

        }
        
        
        
        
        
        
    }

    void printSomething() {
        System.out.println("print");
    }
    
}
