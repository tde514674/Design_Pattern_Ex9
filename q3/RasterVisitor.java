public class RasterVisitor implements Visitor {
    @Override
    public void visit(Shape shape) {
        if (shape instanceof Circle) {
            System.out.println("Saving the circle... with radius= " + ((Circle) shape).getRadius() + " at position "
                    + shape.getxPos() + ", " + shape.getyPos() + " as raster");
        } else if (shape instanceof Triangle) {
            System.out.println("Saving the triangle...with base = " + ((Triangle) shape).getBase() + " height = "
                    + ((Triangle) shape).getHeight() + " at position " + shape.getxPos() + ", " + shape.getyPos()
                    + " as raster");
        } else if (shape instanceof Rectangle) {
            System.out.println("Saving the rectangle...with width = " + ((Rectangle) shape).getWidth() + " height = "
                    + ((Rectangle) shape).getHeight()
                    + " at position " + shape.getxPos() + ", " + shape.getyPos() + " as raster");
        }
    }
}
