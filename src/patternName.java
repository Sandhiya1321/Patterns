public class patter_name {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String name="SANDY";
        int length=name.length();
        for(int i=0;i<length;i++ ) {
            for(int j=0;j<=i;j++) {
                System.out.print(name.charAt(j)+" ");
            }
            System.out.println();
        }

    }

}
