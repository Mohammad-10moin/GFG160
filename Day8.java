public class Day8 {
    public static void main(String[] args) {
        int smallestPointer=0;
        int profit=0;
        int [] prices={57 ,94 ,87 ,60 ,89 ,82 ,35 ,90 ,86 ,24 ,77 ,38 ,24, 23, 72, 59};
        for (int i = 1; i < prices.length; i++) {
            if(prices[i]>prices[i-1] && prices[i]>prices[smallestPointer]){
                int temp=prices[i]-prices[smallestPointer];
                if(temp>profit){
                    profit=temp;
                }
            }
            else if(prices[i]<prices[i-1] && prices[i]<prices[smallestPointer]){
                smallestPointer=i;
            }
        }
        System.out.println(profit);
    }
}
