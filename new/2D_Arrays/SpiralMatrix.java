import java.util.*;
public class SpiralMatrix {
    public static void main(String[] args){
        try(Scanner sc= new Scanner(System.in)){
            int matrix[][]=new int[4][4];
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j]=sc.nextInt();
                }
                
            }
            sc.close();
        }
    }
}
