public class chapter1_3 {
    public static void main(String[] args) {
        System.out.println("    J");
        System.out.println("    J");
        System.out.println("J   J");
        System.out.println(" J J ");
        System.out.println();
        System.out.println("   A   ");
        System.out.println("  A A  ");
        System.out.println(" AAAAA ");
        System.out.println("A     A");
        System.out.println();
        for(int i = 0; i < 4; i++) {
            for (int j = 0; j <= 6; j++) {
                if (j == i || j == 6 - i)
                    System.out.print("V");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }


}
