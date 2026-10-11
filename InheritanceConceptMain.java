/*
 * Multiple inheritance means inheriting from more than one parent class.
 * Java classes cannot extend two classes because that can create ambiguity
 * about which inherited implementation should be used (the diamond problem).
 *
 * Invalid Java syntax (comment only):
 * class C extends A, B { }
 *
 * Hybrid inheritance combines two or more inheritance forms, such as
 * hierarchical and multilevel inheritance. Java interfaces are commonly used
 * to combine multiple types/behaviors, but this example intentionally does
 * not declare or implement any interface.
 */
public class InheritanceConceptMain {
    public static void main(String[] args) {
        System.out.println("See comments for multiple and hybrid inheritance concepts.");
    }
}
