//given an array of size N, return the count of pairs(i,j) with arr[i]+arr[j]=K;
// arr[]=[3,5,2,1,-3,7,8,15,6,13]
//N=10;
//K=10
class ARRAYq {
    public static void main(String[] args) {
        int N=10;
        int k=10;
        int count=0;
        int arr[]=new int[] {3,5,2,1,3,7,8,15,6,13};
        for(int i=0;i<N;i++) {
            for(int j=0;j<N;j++) {
                if((arr[i]+arr[j]==k) && (arr[i]!=arr[j])){
                count++;
                }
            }
            
        }
        System.out.println(count);


    }
}