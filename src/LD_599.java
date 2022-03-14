import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LD_599 {
    class Solution {
        public String[] findRestaurant(String[] list1, String[] list2) {
            int m=list1.length,n=list2.length;
            Map<String,Integer> map=new HashMap<>();
            List<String> ans=new ArrayList<>();
            for(int i=0;i<m;i++){
                map.put(list1[i],i);
            }
            int min=9999;
            for(int j=0;j<n;j++){
                if(!map.containsKey(list2[j])){
                    continue;
                }
                if(min>j+map.get(list2[j])){
                    ans.clear();
                    min=j+map.get(list2[j]);
                    ans.add(list2[j]);
                }else if(min==j+map.get(list2[j])){
                    ans.add(list2[j]);
                }
            }
            return ans.toArray(new String[ans.size()]);
        }
    }
}
