public class break_ {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};
        int toSearch=100;
        int i=0;
        for(;i<arr.length;i++){
            if(arr[i]==toSearch){
                break;
            }
        }
        if(i!=arr.length){
            System.out.println("found");
        }else{
            System.out.println("not found");
        }
    }
}
