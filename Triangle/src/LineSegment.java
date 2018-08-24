public class LineSegment {

    private Point p1;
    private Point p2;

    /**
     * Constructor for objects of class LineSegment
     */
    public LineSegment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1(){
        return this.p1;
    }

    public Point getP2(){
        return this.p2;
    }

    /**
     * @return direction vector of the line
     */
    public Point getChange() {
        return new Point(this.p2.getX() - this.p1.getX(), this.p2.getY() - this.p1.getY());
    }

    public double getSlope() {
        return ((double)(this.p2.getY()) - this.p1.getY()) / (this.p2.getX() - this.p1.getX());
    }

    public double getLength() {
        return Math.sqrt(Math.pow(this.getChange().getX(), 2) + Math.pow(this.getChange().getY(), 2));
    }

    public double getYIntercept() {
        return this.p1.getY() - this.getSlope() * this.p1.getX();
    }

    public String toString() {
        return "f(x) = " + String.valueOf(this.getSlope()) + "x + " + String.valueOf(this.getYIntercept()) + "; " + String.valueOf(Math.min(p1.getX(), p2.getX())) + " <= x <= " + String.valueOf(Math.max(p1.getX(), p2.getX()));
    }
}
