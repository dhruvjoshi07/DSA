public class a {
    // public static void sqaurepattern(int n){
    //     for(int line=1;line<=n;line++){
    //         System.out.println("****");
    //     }
    // }
    public static void starpattern(int n){
        for(int line=1;line<=n;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String[]args){
        // sqaurepattern(4);
        // System.out.println();
        starpattern(4);
    }
}
