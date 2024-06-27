public class Interview {

    public static void main(String[] args) {
        int arr[] = { 0,1,1,1,0,1,1};
        int count= 0;
        
        for(int i = 0 ; i <= arr.length-1;i++){
            if(arr[i]== 1 ){
                count++;
            }
            if(arr[i]==0){
                
            }

        }
        System.out.println(" the total number of 1 present in arrat = :" + count );
    }
}
