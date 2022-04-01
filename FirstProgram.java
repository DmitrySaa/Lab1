class FirstClass {
    public static void main(String[] s) {
        int i, j;

        for (i = 1; i <= 8; i++) {
            for(j = 1; j <= 8; j++) {
                var o = new SecondClass();
                o.setA(7);
                o.setB(10);
                System.out.print(o.Summ(o.getA(), o.getB()));
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
