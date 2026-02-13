package com.techie.LtiMindtreeQues;

import java.util.HashMap;
import java.util.Map;

public class LongestSubStringWithoutrepeatingCharacter {
    public static void main(String[] args) {
      System.out.println(""+lengthOfLongestSubString("abcadabb"));
    }
    /*abcadabb
    1. read each charcter
    char arr[] =s.toCharArray;

    2. loop each chacrter
    for(int i=0;i<arr.length();i++){
    3. put each element inside map
    map.put(arr[i],i);

    4.before putting check whether this chacrter repeadted or not
     int idx = map.getOrDefault(arr[i],-1);
5.if its repeated update the res (that this index has unique character before repeating)
create one pointer left =0 which is pointer 0th index right is in ath index which is 3
if(idx ! =-1){
   res = Math.max(res,right -1-left+1);// this is update the result
   left=idx+1;
}
    }
    }
    *
    *
    * */
    public static int lengthOfLongestSubString(String s) {
        int res = 0;
        char arr[] = s.toCharArray();
        int idx = 0;
        int left = 0;
        int right = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (; right < arr.length; right++) {
            idx =map.getOrDefault(arr[right],-1);//check chacrter repaetd or not if yes store the index;
            if(idx !=-1 && idx >=left){
              res=  Math.max(res,right-1-left+1);//
                left = idx+1;
            }
 map.put(arr[right],right);
        }
        return Math.max(res,right-1-left+1);
    }
}
