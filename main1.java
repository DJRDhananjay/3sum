import java.util.*;
public class Main
{
	public static void main(String[] args) {
		List<List<Integer>>list=new ArrayList();
		int nums[]={-1,0,1,-4,-2,1};
		Arrays.sort(nums);
		for(int i=0;i<nums.length-2;i++){
		    if(i>0&&nums[i]==nums[i-1]){
		        continue;
		    }
		    int left=i+1;
		    int right=nums.length-1;
		    while(left<right){
		        int sum=nums[i]+nums[right]+nums[left];
		        if(sum<0){
		            left++;
		        }else if(sum>0){
		            right--;
		        }else{
		            List<Integer>triplet=new ArrayList();
		            triplet.add(nums[i]);
		            triplet.add(nums[left]);
		            triplet.add(nums[right]);
		            if(!list.contains(triplet)){
		                list.add(triplet);
		            }
		            while(left<right&&nums[left]==nums[left-1]){
		                left++;
		            }
		            while(left<right&&nums[right]==nums[right+1]){
		                right--;
		            }
		        }
		    }
		}
		System.out.print(list);
	}
}
