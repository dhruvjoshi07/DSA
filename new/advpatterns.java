
// HOLLOW RECTANGLE
public class advpatterns{
    public static void hollow_rectangle(int totalrows,int totalcolumn){
        //outer loop
        for(int i=1;i<totalrows;i++){
            //inner loop
            for(int j=1;j<totalcolumn;j++){
                if(i==1||i==totalrows||j==1||j==totalcolumn){
                    //boundry cells
                    System.out.println("*");
                }else{
                    System.out.println(" ");
                }
        }
        System.out.println();
    }
}
    public static void main(String[] args) {
    hollow_rectangle(10, 7);    
    } 
}