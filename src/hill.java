
public class hill {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        //hill pattern nrml &reverse
        for(int i=1;i<=4;i++) {
            int n=1;
            for(int j=4;j>=i;j--) {
                System.out.print(" ");
            }
            for(int j=1;j<i;j++) {
                System.out.print(n++ +" ");

            }
            for(int j=1;j<=i;j++) {
                System.out.print(n-- +" ");

            }
            System.out.println();
        }



//hill pattern increase
        for(int i=1;i<=4;i++) {
            int n=1;
            for(int j=4;j>=i;j--) {
                System.out.print(" ");
            }
            for(int j=1;j<i;j++) {
                System.out.print(n++ +" ");

            }
            for(int j=1;j<=i;j++) {
                System.out.print(n++ +" ");

            }
            System.out.println();
        }

    }


}

