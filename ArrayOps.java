public class ArrayOps {
    public static void main(String[] args) {
        int [] arrCheck = {0};
        int [] arrCheck2 = {0,0,0,0,1,5,6,1,2,3,5,6};
        System.out.println(contains(arrCheck, 0));
        System.out.println(findMissingInt(arrCheck));
        System.out.println(secondMaxValue(arrCheck));
        System.out.println(containsTheSameElements(arrCheck, arrCheck2));
        System.out.println(isSorted(arrCheck));
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
        if (array.length <= 1) {
            return array.length;
        }
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
            if (array[i] >= max){
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
        boolean isSorted = true;
        int currentValue = array[0];
         for(int i = 1; i < array.length-1; i++){
            if (array[i] >= currentValue) {
                if (!(array[i+1] >= array[i])) {
                    isSorted = false;
                }
                currentValue = array[i];
            }
            else if (array[i] < currentValue) {
                if (!(array[i+1] <= array[i])) {
                    isSorted = false;
                }
                currentValue = array[i];
            }
        }
        return isSorted;
    }
}

