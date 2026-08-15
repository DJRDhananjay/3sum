import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int[] nums = {-1, 0, 1, 2, -1, -4};
		ArrayList<ArrayList<Integer>>list=new ArrayList();
		int target=0;
		for(int i=0;i<nums.length;i++){
		    for(int j=i+1;j<nums.length;j++){
		        for(int k=j+1;k<nums.length;k++){
		            if(nums[i]+nums[j]+nums[k]==target){
		                ArrayList<Integer>triplet=new ArrayList();
		                triplet.add(nums[i]);
		                triplet.add(nums[j]);
		                triplet.add(nums[k]);
		                list.add(triplet);
		            }
		        }
		    }
		}
		System.out.print(list);
	}
}
