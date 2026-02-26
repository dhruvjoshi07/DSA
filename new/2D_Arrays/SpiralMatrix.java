import java.util.*;
public class SpiralMatrix {
        /* 
    //approach
    start row=0 then 1 in iteration
    end row=n-1 then 2 in iteration
    start column=0 then 2 in iteration1 
    end column=m-1 then 2 in iteration
        */
    public static void spiral(int matrix[][]){
         int startRow=0;
                int startCol=0;
                int endRow=matrix.length-1;
                int endCol=matrix[0].length-1;
                while(startRow<=endRow && startCol<=endCol){
                    
                //top
                for(int j=startCol;j<=endCol;j++){
                    System.out.print(matrix[startRow][j]+" ");
                }
                
                //right
                for(int i=startRow+1;i<=endRow;i++){
                    System.out.print(matrix[i][endCol]+" ");
                }

                //bottom
                for(int j=endCol-1;j>=startCol;j--){
                    if(startRow==endRow){ //jb ans aa jaye tb repeat na aye ans
                        break;
                    }
                    System.out.print(matrix[endRow][j]+" ");
                }

                //Left
                for(int i=endRow-1;i>=startRow;i--){
                    if(startCol==endCol){
                        break;
                    }
                    System.out.print(matrix[i][startCol]+" ");
                }

                startRow++;
                startCol++;
                endRow--;
                endCol--;;
            }
            System.out.println();
        }
    public static void main(String[] args){
        try(Scanner sc= new Scanner(System.in)){
            int matrix[][]=new int[4][4];
            for(int i=0;i<matrix.length;i++){
                for(int j=0;j<matrix[0].length;j++){
                    matrix[i][j]=sc.nextInt();
                }
            }
        spiral(matrix);
        sc.close();
        }
    }
}