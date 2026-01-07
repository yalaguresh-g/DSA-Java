package Arrays;

public class TrapRainwater {
    public static int RainWater(int height[]){
        int n=height.length;
        // calculate left max boundry - array
        int leftMax[]=new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n;i++){
            leftMax[i]=Math.max(height[i], leftMax[i-1]);
        }
        // cal right max boundry -array     ------> Auxiliary / helper array
        int rightMax[]=new int [n];  // size
        rightMax[n-1] = height[n-1];
        for(int i=n-2;i>=0 ; i++){
            rightMax[i] =Math.max(height[i], rightMax[i+1]);
        }

        int trappedrWater=0;
        // loop  
        for(int i=0 ; i<n ; i++){
            // water level =min(leftmax boundry ,right max boundry)
           int waterLevel = Math.min(leftMax[i], rightMax[i]);
            // trapped water = water level -height
           trappedrWater += waterLevel -height[i];
        }
        return trappedrWater;
    }
 public static void main(String[] args) {
    int height[]={4,2,0,6,3,2,5};
    RainWater(height);
   // System.out.println(RainWater(height));
 }   
}
