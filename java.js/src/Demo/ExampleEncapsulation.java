package Demo;

public class ExampleEncapsulation {
    public static void main(String[] args) {
            Encapsulation e = new Encapsulation();
            e.setName("name");
            e.setAge(10);

            System.out.println("Name : " + e.getName());
            System.out.println("age : " + e.getAge());
    }
}
