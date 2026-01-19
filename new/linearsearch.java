public class linearsearch {
    
    // for strings
    public static int search(String food[],String key){
        for(int i=0;i<food.length;i++){
            if(food[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    // for numbers
    public static int search(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i]){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
    String arr[]={"dosa","idli","rice","chole","burger"};
        String key="burger";

        int index=search(arr,key);

        if(index==-1){
            System.out.print("NOT IN MENU");
        }
        else{
            System.out.print("The key is on:"+index);
        }

        System.out.println();

        int arrr[]={33,45,11,67,23};
        int keyy=67;

        int indexx=search(arrr,keyy);

        if(indexx==-1){
            System.out.print("NOT FOUND");
        }
        else{
            System.out.print("The key is on:"+indexx);
        }
        }
    }
        

        
    


