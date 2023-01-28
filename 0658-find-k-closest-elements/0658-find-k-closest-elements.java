class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> result = new ArrayList<Integer>();

        if (arr.length == k) {
            for (int i = 0; i < k; i++) {
                result.add(arr[i]);
            }
            
            return result;
        }
        int right =  binarySearch(arr, x); //2
       int  left =right-1;//0
        //[1,2,3,4,5]
        // 0 1 2 3 4
        //       4
        while(right - left - 1 < k){
            if (left == -1) {
                right += 1;
                continue;
            }
             if (right == arr.length || Math.abs(arr[left] - x) <= Math.abs(arr[right] - x)) {
                left -= 1;
            } else {
                right += 1;
            }
        }
          for (int i = left + 1; i < right; i++) {
            result.add(arr[i]);
        }
        
        return result;
    }
    public int binarySearch(int  [] arr, int x){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = left + (right - left)/2;
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] < x){
                left = mid + 1;
            }else{
                right = mid -1;
            }
        }
        return left;
    }
}