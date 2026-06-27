package June27;

import java.util.HashMap;
import java.util.Map;

public class P1 {
    static void main(String[] args) {


        String str = "aabcbadec";

        System.out.println(" How Many a b c  Using map " );

        Map<Character,String> map = new HashMap<>();

        for(char ch : str.toCharArray()){

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }
            else{
                /*map.put(ch,1);*/
            }
        }





    }
}
