package singletonpattern;

/**
 * Created by weiqiang3 on 15-10-9.
 */
public class Test {
    public static class StaticTest extends StaticSup {
        String newName = name;
        @Override
        public void setName(String name) {
            super.setName(name);
        }
    }
}
