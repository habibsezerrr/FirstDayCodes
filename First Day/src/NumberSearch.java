public class NumberSearch {

    public static void main(String[] args) {

        int[] numbers = new int[]{1,2,5,7,9,0};
        int wanted = 7;
        boolean isThere = false;

        for (int number : numbers){
            if(number == wanted){
                isThere = true;
                break;
            }
        }

        if(isThere){
            System.out.println("Number is available");
        }else{
            System.out.println("Number is not available");
        }
    }
}
