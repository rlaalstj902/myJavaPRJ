class Rabbit4 {
    private String shape;
    private int xPos;
    private int yPos;

    void setPosition(int x, int y) {
        this.xPos = x;
        this.yPos = y;
    }
}

public class Code07_12 {
    public static void main(String[] args) {
        Rabbit4 rabbit = new Rabbit4();


        rabbit.setPosition(100,200);
    }
}