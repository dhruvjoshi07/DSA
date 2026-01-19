public class a {
    public static void characterpattern(int n){
        char ch='A';
        for(int line=1;line<=n;line++){
            for(int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
    public static void halfpyramidpattern(int n){
        for(int line=1;line<=n;line++){
            for(int num=1;num<=line;num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
    public static void sqaurepattern(int n){
        for(int line=1;line<=n;line++){
            System.out.println("****");
        }
    }
    public static void invertedstarpattern(int n){
        for(int line=1;line<=n;line++){
            for(int star=1;star<=n-line+1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void starpattern(int n){
        for(int line=1;line<=n;line++){
            for(int star=1;star<=line;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main (String[]args){
        System.out.println("Patterns:");
        sqaurepattern(4);
        System.out.println("starpattern:");
        starpattern(4);
        System.out.println("inverted star pattern:");
        invertedstarpattern(4);
        System.out.println("half pyramid pattern:");
        halfpyramidpattern(4);
        System.out.println("character pattern:");
        characterpattern(4);
    }
}
