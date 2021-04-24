public class Main {

    public static void main(String[] args) {

        //**************************************************************************************************************
        // CASE 1-) Sub-class object's adress assigned to super class reference = TRUE
        //**************************************************************************************************************
        SuperClass super_ref;
        SubClass sub_ref = new SubClass();
        super_ref = sub_ref; // OK VALID. Because derived object has everything its super class has.
        // We may think that base/super class part's of derived object will be assigned to base class reference.

        //**************************************************************************************************************
        // CASE 2-) Super class objects's adress assigned to sub-class reference = FALSE
        //**************************************************************************************************************
        SuperClass super_ref = new SuperClass();
        SubClass sub_ref;
        sub_ref = super_ref; // INVALID ERROR. PROHIBITED. Because super class does not have everything a sub-class has.
        // The type of the reference tells the compiler which functions and data it can access using it through.

        sub_ref.sub_class_method(); // IT IS NOT POSSIBLE. Because the adress belongs to base class
        //and the base class does not have everything a sub class has.

    }
}
