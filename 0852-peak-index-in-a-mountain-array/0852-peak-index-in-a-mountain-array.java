class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int st=0, end = arr.length-1;
        while(st<=end){
            int mid = (end+st)/2;
            if(arr[mid+1] < arr[mid] && arr[mid] > arr[mid-1]){
                return mid;
            }
            else if(arr[mid+1]<arr[mid]){
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return -1;
    }
}