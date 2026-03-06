class Solution {
    public int removeElement(int[] nums, int val) {
        int myPointer = (nums.length - 1);
        while(myPointer >= 0 && nums[myPointer] == val){
            myPointer--;
        }

        for(int i = 0; i < myPointer; i++){
            if(nums[i] == val){
                
                int temp = nums[myPointer];
                nums[myPointer] = nums[i];
                nums[i] = temp;
                
                myPointer--;
                while(myPointer >= 0 && nums[myPointer] == val){
                myPointer--;
                }
            }
        }
        return (myPointer+1);
    }
}