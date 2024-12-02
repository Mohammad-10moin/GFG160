import java.util.*;

public class Day6 {
    public static void main(String[] args) {

        int [] nums={-5,1,-5};

        Set<Integer> s= new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }

        Iterator<Integer> i= s.iterator();

        List<Integer> l= new ArrayList<>();
        while(i.hasNext()){
            l.add(i.next());
        }
        // List<Integer> l = new ArrayList<>(s);
        int count=0;
        int size=l.size();
        for (int j = 0; j < l.size(); j++) {
            for (int j2 = 0; j2 < nums.length; j2++) {
                if(l.get(j)==nums[j2]){
                    count++;
                }
            }
            if(count<(nums.length/3)){
                l.remove(j);
                j--;
            }
            count=0;
        }
        if(l.size()==size){
            l.clear();
        }
        // List<Integer> result = new ArrayList<>();
        // for (Integer num : l) {
        //     int count = 0;
        //     for (int n : nums) {
        //         if (num.equals(n)) {
        //             count++;
        //         }
        //     }
        //     if (count > nums.length / 3) {
        //         result.add(num);
        //     }
        // }

        for (Integer in : l) {
            System.out.println(in);
        }
    }
}