class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
           int n = arr1.length-1;
    int [] arr= new int [arr1.length];
    Map <Integer, Integer> map =new HashMap<>();  
    for(int i = 0; i< arr2.length;i++){
        map.put(arr2[i], 0);
    }
    for(int i = 0; i< arr1.length;i++){
        if(map.containsKey(arr1[i])){
            map.put(arr1[i], map.get(arr1[i])+1);
        }else{
            arr[n--] = arr1[i];
        }
    }
    int k =0;
    for(int i = 0; i< arr2.length;i++){
       int size =map.getOrDefault(arr2[i],0);
       for(int j =0; j< size;j++){
           arr[k++] = arr2[i];
       }
       map.remove(arr2[i]);
    }
    Arrays.sort(arr,k,arr.length);
        return arr;
    }
}