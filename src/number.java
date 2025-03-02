
public class number {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n=1;


        //triangle pyramid increment
        for(int i=0;i<5;i++) {
            for(int j=5;j>=i;j--) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print(n+" ");

                n++;
            }
            System.out.println( );
        }





        //left 90 triangle in num

        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(i);

            }
            System.out.println( );

        }




        //inverted left90 triangle in num
        for(int i=1;i<=5;i++) {
            for(int j=5;j>=i;j--) {
                System.out.print(j);

            }
            System.out.println( );

        }



        //right reapeated  triangle

        for(int i=1;i<=5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(i);

            }
            System.out.println( );

        }



        // inverted right repeated numbers pyramid
        for(int i=5;i>=1;i--) {
            for(int j=1;j<=i;j++) {
                System.out.print(i);

            }
            System.out.println( );

        }


        // triangle row same num
        for(int i=1;i<=5;i++) {
            for(int j=5;j>=i;j--) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }



        // triangle  colm same num
        for(int i=1;i<=5;i++)
        {
            for(int j=0;j<=i;j++) {
                System.out.print(" ");
            }

            for(int k=5;k>=i;k--) {

                System.out.print(i+" ");
            }
            System.out.println();
        }





    }}
