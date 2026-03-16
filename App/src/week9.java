import java.util.*;

class TwoSum {

    List<int[]> findTwoSum(int[] nums,int target){

        HashMap<Integer,Integer> map = new HashMap<>();
        List<int[]> result = new ArrayList<>();

        for(int i=0;i<nums.length;i++){

            int comp = target - nums[i];

            if(map.containsKey(comp)){
                result.add(new int[]{map.get(comp),i});
            }

            map.put(nums[i],i);
        }

        return result;
    }
}