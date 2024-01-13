public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        String strCheck = "  tWo wordS";
        System.out.println(capVowelsLowRest(strCheck));
        System.out.println(camelCase(strCheck));
    }

    public static int stringToInt(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
        int digit = str.charAt(i) - '0';
        sum += digit * Math.pow(10, ((str.length() - 1) - i));
        }
        return sum;
        }

    public static String capVowelsLowRest (String string) {
        String str = "";
        for(int i = 0; i < string.length(); i++){
            char currentChar = string.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                str += (char)(currentChar - 32);
            }
            else if(currentChar == ' ' || currentChar == 'A' || currentChar == 'E' || currentChar == 'I' || currentChar == 'O' || currentChar == 'U'){
                str += currentChar;
            }
            else {
                if (currentChar >= 'a' && currentChar <= 'z') {
                    str += currentChar;
                }
                else {
                    str += (char)(currentChar + 32);
                }
            }
        }
        return str;
    }

    public static String camelCase (String string) {
        String str = "";
        String noInitialSpaceString = "";
        int nonSpaceIndex = 0;
       while (nonSpaceIndex < string.length()) {
            if (string.charAt(nonSpaceIndex) != ' ') {
                break;
            }
            else{
                nonSpaceIndex++;
            }
       }
        noInitialSpaceString = string.substring(nonSpaceIndex);
        String firstWord = "";
        int firstSpaceIndex = noInitialSpaceString.indexOf(' '); // saves the index of the first space
        if (firstSpaceIndex == -1) { // if the string doesn't have s space, it returns the lower cased word
            return tolowerCase(noInitialSpaceString); // returns the string lower cased
        }
        for(int i = 0; i < firstSpaceIndex; i++){ // handles the first word, and lower cases it
            firstWord += noInitialSpaceString.charAt(i);
        }
        str += tolowerCase(firstWord); // adds it to the final string
        int lastSpaceIndex = firstSpaceIndex; 
        for(int i = lastSpaceIndex + 1; i < noInitialSpaceString.length(); i++){ // runs each char in the word, starting from the  char after the last space index
            if (noInitialSpaceString.charAt(i) == ' ') { // if the char is space, take the word between the last space to the current space and lower case it
                String currentWord = noInitialSpaceString.substring(lastSpaceIndex + 1, i);
                str += toCamelCase(currentWord);
                currentWord = "";
                lastSpaceIndex++;
            }
        }
        if (lastSpaceIndex < (noInitialSpaceString.length() -1)) {
            str += toCamelCase(noInitialSpaceString.substring(lastSpaceIndex + 1, noInitialSpaceString.length()));
        }
            return str;
        }
    

    public static String tolowerCase (String str){
        String lowerCaseString = "";
        for(int i = 0; i < str.length(); i++){
            char currentChar = str.charAt(i);
            if (currentChar >= 'A' && currentChar <= 'Z') {
                lowerCaseString += (char)(currentChar + 32);
            }
            else{
                lowerCaseString += currentChar;
            }
        }
        return lowerCaseString;
    }

    public static String toCamelCase(String str){
        String camelCaseString = "";
        if (str.charAt(0) >= 'a' && str.charAt(0) <= 'z') {
            camelCaseString += (char)(str.charAt(0) - 32);
        }
        else{
            camelCaseString += str.charAt(0);
        }
        for(int i = 1; i < str.length(); i++){
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                camelCaseString += (char)(str.charAt(i) + 32);
            }
            else{
                camelCaseString += str.charAt(i);
            }
        }
        return camelCaseString;
    }

    public static int[] allIndexOf (String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}

