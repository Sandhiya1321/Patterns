public class ProgramX {
    public static void main(String[] args) {
        String name="PROGRAM";
        for (int i = 0; i <name.length() ; i++) {
            for (int j = 0; j <name.length(); j++) {
                if(i==j||i+j==name.length()-1){
                    System.out.print(name.charAt(j));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
