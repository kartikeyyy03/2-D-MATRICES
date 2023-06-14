public class question_2{
    public static void main(String[] args) {


        int[][] arr1={
           {1, 2, 3},
           {4, 5, 6},
           {7, 8, 9}
                       };


        int[][] arr2={
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };



        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){

        int ans=arr1[i][j]-arr2[i][j];
        if(ans>=0){

        System.out.print(" " + ans + " ");
            }
        else{System.out.print(ans + " ");}
    }
    System.out.println();
    }
}
}
//we can vary the code according ton the question. Here I have taken a Matrix of my own. We can also take a matrix from the user.