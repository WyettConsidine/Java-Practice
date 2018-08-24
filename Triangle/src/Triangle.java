public class Triangle {

    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        // initialise instance variables
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public LineSegment getLineSegmentP1P2() {
        return new LineSegment(p1, p2);
    }

    public LineSegment getLineSegmentP2P3() {
        return new LineSegment(p2, p3);
    }

    public LineSegment getLineSegmentP3P1() {
        return new LineSegment(p3, p1);
    }

    /**
     * Uses Heron's formula to get the area of the triangle
     * @return the area of the triangle
     */
    public double getArea() {
        double semiperimeter = this.getPerimeter() / 2;
        double a  = this.getLineSegmentP1P2().getLength();
        double b = this.getLineSegmentP2P3().getLength();
        double c = this.getLineSegmentP3P1().getLength();
        return Math.sqrt(semiperimeter * (semiperimeter - a) * (semiperimeter - b) * (semiperimeter - c));
    }

    public double getPerimeter() {
        return this.getLineSegmentP1P2().getLength() + this.getLineSegmentP3P1().getLength() + this.getLineSegmentP2P3().getLength();
    }

    public String toString() {
        return "Triangle with points " + this.p1 + ", " + this.p2 + ", " + this.p3;
    }
}
