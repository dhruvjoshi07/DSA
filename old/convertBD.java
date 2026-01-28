/*
// Binary to decimal
public class convertBD {

    public static void bintodec(int n){
        int mynum=n;
        int decimal=0;
        int pow=0;
        for(int i=0;n>i;pow++){
            int lastdigit=n%10;
            decimal=decimal+(lastdigit*(int)Math.pow(2,pow));
            n=n/10;
        }
        System.out.println("decimal of "+mynum+"="+decimal);
    }
    public static void main(String[] args) {
        bintodec(101);
    }
}
*/


// decimal to binary
public class convertBD{
    public static void dectobin(int n){
        int myNum=n;
        int bin=0;
        int pow=0;
        for(int i=0;n>i;pow++){
            int rem=n%2;
            bin=bin+(rem*(int)Math.pow(10,pow));
            n=n/2;
        }
        System.out.println("binary form of "+myNum+"="+bin);
    }
    public static void main(String[] args) {
        dectobin(14);
    }
}