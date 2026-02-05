package array;
/*Que.Given n non negative intgers representing an elevaion map
 where the width of each bar is 1,compute how much water 
 it can trap after  raining*/
 //elevation=height=[4,2,0,6,3,2,5]
 //We use "auxillary array" means helper
//logic=trapped water=waterlevel-height[i]:it gives traped water
public class trw {
//learning:single bar,double bar,ascending or descending bar=no trap

    public static int trappedRainWater(int height[]){
        //cal left max boundry
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for(int i =1;i<height.length;i++){
            leftmax[i]=Math.max(height[i],leftmax[i-1]);
        }
    
        //cal right max boundry
        int rightmax[]=new int[height.length];
        rightmax[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }
        //loop
        int trappedwater=0;
        for(int i=0;i<height.length;i++){
            int waterlevel=Math.min(leftmax[i],rightmax[i]);
            //waterlvl=min(leftmax,rightmax)
            trappedwater+=waterlevel-height[i];
        }
        return trappedwater;
        
        //logic
    }
    public static void main(String[] args){
        int height []={4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
}
