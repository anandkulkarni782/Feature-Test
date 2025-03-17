package org.example.STRING;

public class StringReverseWithoutUsingReverseMethd {
    public static String reverse(String str) {
        StringBuffer sb = new StringBuffer();
        for(int i = str.length()-1;i>=0;i--)
        {
              sb.append(str.charAt(i));
        }

        return sb.toString();

    }

    public static void main(String [] args)
    {
        System.out.println(StringReverseWithoutUsingReverseMethd.reverse("ANAND"));
    }
}
