public class question_5 {
    public static void main(String[] args) {
        int[][] array = {
            {1,-2,-3},
            {-4,5,-6},
            {-7,-8,9}
        };





        int sum=0;
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[0].length;j++){
                if(i==j){
                    sum=sum+array[i][j];
                }


            }


          }

          System.out.print(sum);
}
}
