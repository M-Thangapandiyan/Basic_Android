package Demo;

public class ExampleInheritance {

    public static void main(String[] args) {

        //SingleLevel Inheritance
//        SingleLevelInheritance1 si = new SingleLevelInheritance1();
//        si.hello();
//        si.world();


//        SingleLevelInheritance s = new SingleLevelInheritance();
//        s.hello();

        //Hierarchical Inheritance
           //subclass
        SingleLevelInheritance1 singleLevelInheritance = new SingleLevelInheritance1();
        singleLevelInheritance.hello();
        singleLevelInheritance.world();

        HierarchicalInheritance hierarchicalInheritance = new HierarchicalInheritance();
        hierarchicalInheritance.exampleHi();
        hierarchicalInheritance.hello();



    }


}
