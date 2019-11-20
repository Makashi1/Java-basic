package tables;

public class MultiArray {
    public static void main(String[] args) {





        int [][] numbers = {
                {1,1,1,},
                {2,2,2,2,2,},
                {3,3,3,3,3,3,3}
        };
        System.out.println();
        for (int i= 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.printf("%-3d", numbers [i] [j]);
            }
            System.out.println();
//            1. i = 0 | 0 <3 -> true | i++
//            -> j=0 | 0 <3 true    | j++       1
//            -> j=1 | 1 <3 true    | j++       1 1
//            -> j=2 | 2 <3 true    | j++       1 1 1
//            -> j=3 | 3 <3 false   | j++       1 1 1 \n
//
//            2. i=1 | 1 < 3 true   |i++
//            -> j=0 | 0 < 5 true   |j++       2
//            -> j=1 | 1 < 5 true   |j++       2 2
//            -> j=2 | 2 < 5 true   |j++       2 2 2

            System.out.println(numbers [1] [0]);

        }

    }
}
