import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int [] nums={2,1,5,5,5,5,6,6,6,6,6};
        Set<Integer> s= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        Iterator<Integer> i= s.iterator();
        int count=0;
        List<Integer> l= new ArrayList<>();
        while(i.hasNext()){
            for(int j=0;j<nums.length;j++){
                if(i.next()==nums[j]){
                    count++;
                }
                if(count>nums.length/3){
                    l.add(nums[j]);
                    count=0;
                }
            }
        }
    }
}