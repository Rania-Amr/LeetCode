class Solution {
    public int[] intersection(int[] arr1, int[] arr2) {
          if(arr2.length > arr1.length){
        return intersection(arr2, arr1);
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i =0;
        int j = 0;
        int k =0;
        while(j < arr2.length && i< arr1.length){
          if(arr1[i] < arr2[j]){
              i++;
            }else if(arr1[i] > arr2[j]){
              j++;
            }else{
              if(k==0 || arr1[k-1] != arr2[j]){
                  arr1[k++] = arr2[j];
              }
                
            j++;
            i++;
        }
        }
    return Arrays.copyOfRange(arr1, 0, k);
    }
}