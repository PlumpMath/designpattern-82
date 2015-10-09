package factorypattern;

/**
 * Created by weiqiang3 on 15-10-9.
 */
public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Rectangle draw() method.");
    }
}
