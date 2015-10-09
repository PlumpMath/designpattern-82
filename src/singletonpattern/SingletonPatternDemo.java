package singletonpattern;

/**
 * Created by weiqiang3 on 15-10-9.
 */
public class SingletonPatternDemo {
    public static void main(String[] args) {
        SingleObject singleObject = SingleObject.getInstance();
        singleObject.showMessage();
    }
}
