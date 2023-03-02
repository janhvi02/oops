package code.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class RepeatMap {
    public static void main(String[] args) {


        String str = "abbcddd";
        char[] chars=str.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<chars.length;i++){
            if(map.containsKey(chars[i])){
                map.put(chars[i],map.get(chars[i])+1);
            }else{
                map.put(chars[i],1);
            }
        }
        System.out.println(map);

    }
}