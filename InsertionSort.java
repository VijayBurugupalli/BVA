public class Insertion{
    public static void main(String[] args){
        int[] arr=new int[]{5,2,4,6,1,3,7,9,8};
        for(int j=1;j<arr.length;j++){
            int temp;
            int i=j-1;
            while(i>=0 && arr[i]>arr[i+1]){
                temp=arr[i+1];
                arr[i+1]=arr[i];
                arr[i]=temp;
                i=i-1;
            }
        }
        System.out.print("sorted:");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
