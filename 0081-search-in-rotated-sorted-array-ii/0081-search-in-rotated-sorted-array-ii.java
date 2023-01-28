class Solution {
    public boolean search(int[] arr, int key) {
           int start = 0, end = arr.length - 1;
    while (start <= end) {
      int mid = start + (end - start) / 2;
      if (arr[mid] == key)
        return true;

      if ((arr[start] == arr[mid]) && (arr[end] == arr[mid])) {
        ++start;
        --end;
      } else if (arr[start] <= arr[mid]) { // left side is sorted in ascending order
        if (key >= arr[start] && key < arr[mid]) {
          end = mid - 1;
        } else { //key > arr[mid]
          start = mid + 1;
        }
      } else { // right side is sorted in ascending order       
        if (key > arr[mid] && key <= arr[end]) {
          start = mid + 1;
        } else {
          end = mid - 1;
        }
      }
    }

    // we are not able to find the element in the given array
    return false;
    }
}