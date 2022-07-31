import java.util.Arrays;

public class MoveAblePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[]{this.xSpeed, this.ySpeed};
    }
public void move(){
        float xs = super.getX()+this.xSpeed;
        float ys = super.getY()+this.ySpeed;
        this.setSpeed(xs,ys);
}
    @Override
    public String toString() {
        return "MoveAblePoint{" +
                "xSpeed=" + xSpeed + "x = "+super.getX()+
                ", ySpeed=" + ySpeed + "y = "+super.getY()+ "speed -----> "+ Arrays.toString(this.getSpeed()) +
                '}';
    }
}
