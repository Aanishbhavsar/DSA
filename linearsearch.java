
public class LinearSearch {
    public static void main(String[] args){
        int []num={10,20,13,12,30,23,309,87,67,-90};
        int target=30;
        int answer=linearSearch(num,target);
        System.out.println(answer);
    }
    static int linearSearch(int []arr,int target){
        if(arr.length==0) {
            return -1;
        }
        for(int index=0;index<arr.length;index++)
        {
            int element=arr[index];
            if(element==target){
                return index;
            }

        }
        return -1;
    }
}
