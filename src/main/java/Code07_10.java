class Rabbit2 {
    String shape;
    int xPos;
    int yPos;

    Rabbit2() {
        shape = "토끼";
    }

    void setPosition(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }
}

public class Code07_10 {
    public static void main(String[] args) {
        Rabbit2 rabbit = new Rabbit2();

        System.out.println("rabbit : " + rabbit.shape);
    }
}
