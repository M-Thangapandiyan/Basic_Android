package Demo;

public class ExamplePolymorphism {

    public static void main(String[] args) {

        System.out.println(" same name diff arguments (method overloading) = " + Polymorpsim.multiplay(2,3,1));
        System.out.println(Polymorpsim.multiplay(1,2));

        Polymorpsim p = new Polymorpsim();
        System.out.println("same name diff types of arguments (method overriding) = " + p.add(1,2));
        System.out.println(p.add("1","2"));
    }
}


