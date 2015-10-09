package factorypattern;

/**
 * Created by weiqiang3 on 15-10-9.
 */
public class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equals("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equals("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equals("SQUARE")) {
            return new Square();
        }
        return null;
    }
}
