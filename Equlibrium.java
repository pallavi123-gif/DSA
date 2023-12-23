public class Equlibrium {
    public static void main(String[] args) {
        int arr[]=new int[]{ -1,3,2,4,5,6};
        int leftsum=0;
        int rightsum=0;
        for(int i=1;i<arr.length;i++) {
            leftsum=leftsum[i-1]+arr[i];
        }
        for(int i=i+1;i<arr.length;i++){
            rightsum=rightsum[i-1]+arr[i];
        }
        System.out.println(rightsum+leftsum);
    }
}