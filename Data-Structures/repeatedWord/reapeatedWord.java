package repeatedWord;

import java.util.ArrayList;


public class reapeatedWord {
    public static void main(String[] args){
        String myStr = "Once upon a time, there was a brave princess who...";
        System.out.println(reapeatedWord(myStr));

    }

    public static String reapeatedWord(String Str){
        if(Str.isEmpty()){
            return "Empty String";
        }
        int count ;
        String result = "";
        String myStr = Str;
        String words[] = myStr.toLowerCase().split(" ");

        ArrayList array = new ArrayList();
        for (int i = 0; i < words.length; i++) {
            count=1;
            for (int j =i+1; j<words.length; j++){
                if(words[i].equals(words[j])){
                    count++;
                    array.add(words[i]);
                    words[j] = "0";
                }
            }
        }
        result= (String)array.get(0);
        return result;
    }




}
