package binary_search;

public class BinarySearch {

    public static int search(int[] numbers, int target) {
        int lo = 0;
        int hi = numbers.length;

        while(lo < hi){
            int mid = Math.round(lo + (hi - lo) / 2);
            int v = numbers[mid];

            if(v == target){
                return mid;
            } else if(v > target){
                hi = mid;
            } else{
                lo= mid + 1;
            }
        }

        return -1;
    }

}


