public class triangle {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n=1;
        for(int i=0;i<=6;i++) {
            for(int j=6;j>=i;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
                System.out.print(i+" ");

            System.out.println();

        }

    }

}
