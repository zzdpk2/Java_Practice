public class InnerClassPracticeEntrance {
    public static void main(String[] args) {
        Body body = new Body();
        // 通过外部类的对象，调用外部类的方法，里面间接使用内部类Heart
        body.methodBody();

        System.out.println("=======================");

        Body.Heart heart = new Body().new Heart();
        heart.beat();

    }
}
