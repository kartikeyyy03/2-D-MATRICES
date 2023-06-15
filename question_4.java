import java.util.Arrays;
public class question_4 {

    public static void main(String[] args) {
        
        int[][] array={
            {1,2,3,4},
            {5,6,7,8},
            {9,2,3,4}

        };
        int[] SC=new int[array.length];
        for(int i=0;i<array.length;i++){
            int sum=0;

            for(int j=0;j<array[0].length;j++){

                sum+=array[i][j];
                SC[i]=sum;


            }
        }
        System.out.println(Arrays.toString(SC));
    }
    
    
}
