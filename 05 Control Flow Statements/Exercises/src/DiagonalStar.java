public class DiagonalStar {

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }

        for(int row=1; row<=number; row++){
            if (row == 1 || row == number){
                for(int col=1; col<=number; col++){
                    System.out.print('*');
                }
                System.out.println();
            }else {
                for(int col=1; col<=number; col++){
                    if (col == 1 || col == number){
                        System.out.print('*');
                    }else if (col == row || col == (number-row+1)){
                        System.out.print('*');
                    }else{
                        System.out.print(' ');
                    }
                }
                System.out.println();
            }
        }

    }
}
