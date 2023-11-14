public class Bird {
    private String name;
    private static int numBird = 0;

    public Bird() {
        numBird++;
    }

    public void setName(String nm) {
        name = nm;
    }

    public String getName() {
        return name;
    }

    public static int getNum() {
        return numBird;
    }


    public static void main(String[] args) {
        Bird b1 = new Bird();
        Chicken c1 = new Chicken();
        Chicken c2 = new Chicken();
        Penguin p1 = new Penguin();
        Penguin p2 = new Penguin();
        Penguin p3 = new Penguin();

        System.out.println("鳥の数: " + Bird.getNum());
        System.out.println("ニワトリの数: " + Chicken.getNum()); 
        System.out.println("ペンギンの数: " + Penguin.getNum());

}

}



  
