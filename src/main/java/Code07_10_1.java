class Rabbit3 {
    String shape;
    int xPos;
    int yPos;

    Rabbit3(String shape) {
        this.shape = shape;
    }
    void setPosition(int xPos,int yPos){
        this.xPos = xPos;
        this.yPos = yPos;
    }
}

public class Code07_10_1{
    public static void main(String[] args) {
        String rabbitColor = "파란색";

        Rabbit3 rabbit = new Rabbit3(rabbitColor);
        System.out.println("rabbit : " + rabbit.shape);
    }
}
