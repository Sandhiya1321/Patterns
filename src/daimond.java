public class daimond {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n=10;
        //normal
        for(int i=1;i<=n;i++) {

            for(int j=n;j>=i;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print(k +" ");

            }
            System.out.println();
        }


        //inverted
        for(int i=n;i>=1;i--) {

            for(int j=n+1;j>=i;j--) {
                System.out.print(" ");

            }
            for(int k=1;k<i;k++) {
                System.out.print(k+" ");

            }
            System.out.println();
        }

    }

}



