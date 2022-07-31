public class Main {
    public static void main(String[] args) {
        Point point = new Point(2.0f,3.0f);
        MoveAblePoint moveAblePoint = new MoveAblePoint(point.getX(), point.getY(), 4.0f,5.0f);
//        moveAblePoint.move();
        System.out.println(moveAblePoint);
        System.out.println("move lan 1");
        moveAblePoint.move();
        System.out.println(moveAblePoint);
        System.out.println("move lan 2");
        moveAblePoint.move();
        System.out.println(moveAblePoint);
    }
}