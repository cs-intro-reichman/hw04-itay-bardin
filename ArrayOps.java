public class ArrayOps {
    public static void main(String[] args) {
        int [] arrCheck = {0,1,2,3,5,6};
        int [] arrCheck2 = {0,0,0,0,1,5,6,1,2,3,5,6};
        System.out.println(contains(arrCheck, 0));
        System.out.println(findMissingInt(arrCheck));
        System.out.println(secondMaxValue(arrCheck));
        System.out.println(containsTheSameElements(arrCheck, arrCheck2));
    }
    public static boolean contains (int [] array, int n){
        boolean isContained = false;
        for(int i = 0; i < array.length; i++){
            if (array[i] == n) {
                isContained = true;
            }
        }
        return isContained;
    }
    public static int findMissingInt (int [] array) {
        int missingInt = 0;
        for(int i = 0; i < array.length; i++){
                if (!contains(array, i)) {
                    missingInt = i;
                }
            }
        return missingInt;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int secondMax = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] > max){
                secondMax = max;
                max = array[i];
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        boolean containsTheSameElements = true;
        if (array1.length >= array2.length) {
         for(int i = 0; i < array1.length; i++){
            if (!contains(array2, array1[i])) {
                containsTheSameElements = false;
            }
        }
    }
        else if (array1.length < array2.length) {
         for(int i = 0; i < array2.length; i++){
            if (!contains(array1, array2[i])) {
                containsTheSameElements = false;
            }
        }
    }
        return containsTheSameElements;
    }

    public static boolean isSorted(int [] array) {
        // Write your code here:
        return false;
    }

}
