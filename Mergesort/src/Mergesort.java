import java.util.Arrays;
//https://studyflix.de/informatik/mergesort-1324
public class Mergesort {
    static int[] input = {7,4,8,5,1,2,11,0,10,-1,365};

    public static void main(String[] args) {
        System.out.println("Unsorted list:");
        for (int i = 0; i < input.length;i++) {
            System.out.print(input[i] + " ");
        }
        System.out.println();
        System.out.println("Sorted list:");
        if (input.length > 2) {
            int[] output = split(input);
            for (int i = 0; i < output.length;i++) {
                System.out.print(output[i] + " ");
            }
        }
        else {
            int[] output = sort(input);
            for (int i = 0; i < output.length;i++) {
                System.out.print(output[i] + " ");
            }
        }
    }

    static int[] sort (int[] splitedList) {
        int[] myArr1 = new int[1];
        if (splitedList[0] > splitedList[1]) {
            myArr1[0] = splitedList[0];
            splitedList[0] = splitedList[1];
            splitedList[1] = myArr1[0];
        }
        return splitedList;
    }

    static int[] split (int[] input) {
        int[] myArr1 = new int[input.length/2];
        int[] myArr2 = new int[input.length - input.length/2];

        myArr1 = Arrays.copyOfRange(input, 0, input.length/2);
        myArr2 = Arrays.copyOfRange(input,input.length/2, input.length);

        if (myArr1.length > 2) {
            myArr1 = split(myArr1);
        }
        if (myArr2.length > 2) {
            myArr2 = split(myArr2);
        }
        else {
            if (myArr1.length > 1) {myArr1 = sort(myArr1);}
            if (myArr2.length > 1) {myArr2 = sort(myArr2);}
        }


        int[] returnArray = merge(myArr1,myArr2);
        return returnArray;

    }

    static int[] merge (int[] myArr1,int[] myArr2) {
        int[] returnArray = new int[myArr1.length + myArr2.length];
        int i = 0;
        int j = 0;
        int skip = 0;
        for (int ii = 0;ii < returnArray.length;ii++) {
            if (j >= myArr2.length || skip != -1 && myArr1[i] <= myArr2[j]) {
                System.arraycopy(myArr1, i,returnArray,i+j,1);
                i++;
                if (i >= myArr1.length) {
                    skip = -1;
                }
            }
            else {
                System.arraycopy(myArr2, j, returnArray, i+j, 1);
                    j++;
            }
        }
        return returnArray;
    }



}
