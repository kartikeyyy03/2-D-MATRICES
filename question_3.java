
import java.util.Arrays;;
public class question_3 {

    public static void main(String[] args) {
    
        int[][] array={
            {1,2,3,4},
            {5,6,7,8},
            {9,2,3,4}
        };


        int[] sumarray = new int[array[0].length];

        for(int i=0;i<array[0].length;i++){
            int sum=0;
            for(int j=0;j<array.length;j++){

                sum=sum+array[j][i];
                sumarray[i]=sum;
            }

            
            
            
            
        }
        
        System.out.print(Arrays.toString(sumarray));
        




        
    }
    
}
