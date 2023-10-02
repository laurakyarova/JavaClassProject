package class11;

public class FindLetterCountInString {
    public static void main(String[] args) {

        /*Create a String that should be combination of letters,
         numbers and special characters. Find out how many Alphabets(abd AZ)
          characters are there in the String.
         */
        String str="Hello #@$% dear Friend#$.";
        int count=str.replaceAll("[^a-zA-Z]","").length();
        System.out.println("Number of alphabet characters are "+count);

         }
    }

