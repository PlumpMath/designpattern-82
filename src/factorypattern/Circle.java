package factorypattern;

/**
 * Created by weiqiang3 on 15-10-9.
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("inside Circle draw method.");
    }
}
