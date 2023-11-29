import java.lang.reflect.Array;
import java.util.Arrays;

class RemoveTheOccuranceOf_a_InString{
    public static void main(String[] args) {
        String str = "anurag is a boy";
        String withouta="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!='a'){
                withouta=withouta+str.charAt(i);
            }
        }
        System.out.println(withouta);
        }
    }    
