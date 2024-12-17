
public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {25, 16, 12, 8, 4, 6, 62, -1, 7};
        int target = 12;
        System.out.println(linearSearch(arr, target, 1, 6));
    }
    static int linearSearch(int [] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;

        }
        for(int index=start;index<=end;index++){
            int element=arr[index];
            if(element==target){
                return index;
            }
        }
        return -1;
    }
}
