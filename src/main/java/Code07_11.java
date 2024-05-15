class Rabbit9 {
    String shape;
    int xPos;
    int yPos;

    void setPosition(int x, int y) {
        this.xPos = x;
        this.yPos = y;

        System.out.println("xPos : " + this.xPos + " / yPos : " + this.yPos);
    }
}

public class Code07_11 {
    public static void main(String[] args) {
        Rabbit rabbit4 = new Rabbit();
        Rabbit rabbit5 = new Rabbit();
        Rabbit rabbit6 = new Rabbit();

        rabbit4.shape = "원";
        rabbit5.shape = "삼각형";
        rabbit6.shape = "토끼";

        System.out.println("rabbit4.shape : " + rabbit4.shape);
        System.out.println("rabbit5.shape : " + rabbit5.shape);
        System.out.println("rabbit6.shape : " + rabbit6.shape);

        rabbit4.setPosition(100, 100);
        rabbit5.setPosition(-100, 100);
        rabbit6.setPosition(0, -100);

    }
}