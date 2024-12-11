// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;

public class Day7 {
    public static void main(String[] args) {
        // int [] prices={100,180,260,310,40,535,695};
        // int [] prices={86 ,92 ,24 ,5 ,34 ,72 ,68, 52 ,27, 95 ,41 ,28 ,35};
        int [] prices={57 ,94 ,87 ,60 ,89 ,82 ,35 ,90 ,86 ,24 ,77 ,38 ,24, 23, 72, 59};
        // int [] prices={1,2,1,2,1,2};
        // int [] a={4, 2, 2, 2, 4};

        int profit=0;
        if(prices.length==1){
            profit=0;
        }
        else{
            for(int i=1;i<prices.length;i++){
                if(prices[i]>prices[i-1]){
                    int temp=prices[i]-prices[i-1];
                    if(profit<temp){
                        profit=temp;
                    }
                }
            }
        }
        System.out.println(profit);

































        // The below is my first approach
        // int profit=0;
        // int lowpointer=0;
        // int highpointer=1;
        // while(prices[highpointer]<prices[lowpointer]){
        //     lowpointer=highpointer;
        //     highpointer=lowpointer+1;
        // }

        // while (highpointer<prices.length-1) {
        //     if(prices[highpointer]<prices[highpointer+1]){
        //         highpointer=highpointer+1;
        //     }
        //     else{
        //         profit=profit+prices[highpointer]-prices[lowpointer];
        //         lowpointer=highpointer+1;
        //         highpointer=lowpointer+1;
        //         if(highpointer<prices.length-1){
        //             while(prices[highpointer]<prices[lowpointer]){
        //                 lowpointer=highpointer;
        //                 highpointer=lowpointer+1;
        //             }
        //         }
        //     }
        //     if ((highpointer==prices.length-1) && (prices[lowpointer]<prices[highpointer])) {
        //         profit=profit+prices[highpointer]-prices[lowpointer];
        //         lowpointer=highpointer+1;
        //         highpointer=lowpointer+1;
        //     }
        // }
        // System.out.println(profit);




















        // int smallIndex=0;
        // int count=0;
        // List<Integer>Profit= new ArrayList<>(); 
        // Profit.add(prices[1]-prices[0]);
        // for (int i = 2; i < prices.length; i++) {
        //     if(prices[smallIndex]<prices[i]){
        //         if(Profit.get(count)<prices[i]-prices[smallIndex]){
        //             Profit.remove(count);
        //             Profit.add(prices[i]-prices[smallIndex]);
        //         }
        //         else if(Profit.get(count)==prices[i]-prices[smallIndex]){
        //             Profit.add(prices[i]-prices[smallIndex]);
        //             count++;
        //         }
        //     }
        //     else if(prices[smallIndex]>prices[i]){
        //         smallIndex=i;
        //         count++;
        //         Profit.add(prices[smallIndex]-prices[i+1]);
        //     }
        // }
        // // Collections.sort(Profit);
        // System.out.println(Profit);
        // int ans=0;
        // for (Integer integer : Profit) {
        //     if(integer>=0){
        //         ans+=integer;
        //     }
        // }
        // // for (int i = 0; i < Profit.size(); i++) {
        // //     if(Profit.get(i)>0){
        // //         ans=ans-Profit.get(i);
        // //         break;
        // //     }
        // // }
        // System.out.println(ans);
    }
}
