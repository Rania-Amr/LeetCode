class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;
        int k =0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] > nums2[j]){
                j++;
            }else if(nums1[i] < nums2[j]){
                i++;
            }else{
             nums2[k++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(nums2,0,k);
    }
}