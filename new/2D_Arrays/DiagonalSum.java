import java.util.*;
public class DiagonalSum {
    public static void diagonal(int matrix[][]){
        int sum=0;
    }
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[4][4];
        int n=matrix.length;
        int m=matrix[0].length;
        //rows and columns
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        
        //output
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
