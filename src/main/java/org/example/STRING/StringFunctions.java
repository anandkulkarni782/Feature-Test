package org.example.STRING;

public class StringFunctions {

    public  static void main(String [] args)
    {
         String s1 = "Anand";
         String s2 = "Kulkarni";
         String s3 = "Anand";
         System.out.println("Message From length()"+" "+s1.length()); // Length function will return the Length of String

         String Result=s1.concat(s2); // concat Function will join two Different Strings and will create one string.
         System.out.println("Message From concat()"+" "+Result);

         System.out.println("Message From charAt() Function"+" "+ s1.charAt(2)); // charAt() Function will return character from specified index.

        String result = s1.substring(0,2);   // substring  method returns the string from start and end locations.

        System.out.println("Message Coming from substring() Method" +" "+result);

        System.out.println(s1.equals(s3)); // equals() Used TO check the sequence of characters  in string.

        System.out.println(s1.equalsIgnoreCase(s3)); // equalsIgnoreCase() Method will Not check the case of string.

        System.out.println("This message coming from contains() Method"+" "+s1.contains("an")); // Contains method it will check the passing substring available in String it will return true or false

        System.out.println("This message coming from startsWith() Method"+" "+s1.startsWith("A")); // startsWith Method will check the specified string is starting with mentioned letter or Not

////////////////////////////ReplaceAll Method To Remove Special Character ///////////////////////////////////

                String str = "anand$Kulkarni#123!456";
                // Remove all numbers (0-9) and special characters
                String cleanedStr = str.replaceAll("[^a-zA-Z]", "");

                System.out.println(cleanedStr);  // Output: anandKulkarni

        ////////////////////////////////////////////////////////////////////////////////////////////

        // Manual Way to remove Special Character from String // using Enhanced ForLoop //

        String  ak="An&an#d1Kulk*a!r#n^i*";
        char[] charArray = ak.toCharArray();
        StringBuilder result1 = new StringBuilder();
        for(char c : charArray)
        {
            if(Character.isLetter(c))
            {
               result1.append(c);
            }
        }

        System.out.println("Result Coming from ReplaceAll Method"+" "+result1);

///////////////////////////////////// Normal Filteration //////////////////////////////////////////////////

        String ac="Anagha%$)Chikshe!!@@";
        char[]  cleanString =ac.toCharArray();
        StringBuilder SB = new StringBuilder();
        for(int i = 0;i< cleanString.length;i++)
        {
             if(Character.isLetter(cleanString[i]))
            {
                SB.append(cleanString[i]);
            }
        }
        System.out.println(SB);

            }
        }






