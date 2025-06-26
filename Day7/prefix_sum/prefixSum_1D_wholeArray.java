public class prefixSum_1D_wholeArray{


    public static void main (String [] args){
        
        int [] arr = {3,8,10,19,4,6,1};
        int [] prefix = new int [arr.length];

        prefix[0] = arr[0];

        for(int i=1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }

        // printing prefic array 
            for(int ele : prefix){
                System.out.print(ele +" ");
            }
            System.out.println(); 
    }
}



