public class array_sum{
    public static void main(String [] args){
        int array[][]={
            {1,3,7,8},
            {2,4,9,10},
            {12,13,14,18}

        };
        int sum =0;
        for ( int i = 0;i<array.length;i++){
            for ( int j=0;j<array[i].length;j++){
                sum = sum+ array[i][j];

            }
        }
        System.out.print("sum is "+ sum);

    }

}