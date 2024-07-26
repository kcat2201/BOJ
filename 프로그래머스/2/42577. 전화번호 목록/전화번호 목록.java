import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
           Arrays.sort(phone_book);
            int length=phone_book.length;
            
            for(int i=1;i<length;i++){
                String pre=phone_book[i-1];
                if(phone_book[i].indexOf(pre)==0) return false;
            }
            return true;
    }
}