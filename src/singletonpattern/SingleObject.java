package singletonpattern;

/**
 * Created by weiqiang3 on 15-10-9.
 */
public class SingleObject {
    //加载类时即创建对象
    private static SingleObject singleObject = new SingleObject();
    //私有的构造方法
    private SingleObject() {

    }
    //公共的访问接口
    public static SingleObject getInstance() {
        return singleObject;
    }

    public void showMessage() {
        System.out.println("Hello World");
    }
}
