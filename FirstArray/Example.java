package FirstArray;

public class Example {
    public static void main(String args[]){

        //Arrays store one datatype
        int numberOfChristmasGifts[];
        numberOfChristmasGifts = new int[2];

        numberOfChristmasGifts[0] = 7;
        numberOfChristmasGifts[1] = 3;
        System.out.println(numberOfChristmasGifts[0]);
        System.out.println(numberOfChristmasGifts[1]);
        numberOfChristmasGifts[0] = 123;
        numberOfChristmasGifts[1] = 234;

        System.out.println(numberOfChristmasGifts[0]);
        System.out.println(numberOfChristmasGifts[1]);


    }



}
