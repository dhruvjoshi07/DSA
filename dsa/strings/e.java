package strings;
//largest string="apple","mango","banana"
public class e {
    public static void main(String args[]){
        //lexicographic(mtlb alphabetically) and .compareTo and .comparetoIgnoreCase
        String fruits[]={"apple","mango","banana"};
        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    } 
}

/* NOTE:
String str1="abc";
String str2="abc";
String str3=new String("abc");
Ismei str1 and str2 equal ho jaati pr str 3 nhi cuz of interning
*Two types of memory=stack memory and heap memory
*/