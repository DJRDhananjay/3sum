import java.util.*;
class Solution {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>list=new ArrayList();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer>triplet=new ArrayList();
                        triplet.add(nums[i]);
                        triplet.add(nums[j]);
                        triplet.add(nums[k]);
                        if(!list.contains(triplet)){
                            list.add(triplet);
                        }
                    }
                }
            }
        }
        return list;
    }
    public static void main(String[] args){
        int nums[]={-1,0,1,2,-1,-4};
        System.out.print(threeSum(nums));
    }
}
