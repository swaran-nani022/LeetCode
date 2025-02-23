class Solution {

    public boolean hasSameDigits(String s) {

        

        StringBuilder s1=new StringBuilder();

        while(s.length()>2)

        {

            for(int j=0;j<s.length()-1;j++)

            {

            s1.append(((s.charAt(j)-'0')+(s.charAt(j+1)-'0'))%10);

            }

            s=s1.toString();

            s1.setLength(0);

            

        }

        if(s.charAt(0)==s.charAt(1))

        {

            return true;

        }

        else return false;

    }

}




