import java.util.*;
public class week2 {

        HashMap<String,Integer> stock = new HashMap<>();
        LinkedHashMap<String,List<Integer>> waiting = new LinkedHashMap<>();

        synchronized boolean purchase(String product,int userId){

            int count = stock.getOrDefault(product,0);

            if(count>0){
                stock.put(product,count-1);
                return true;
            }else{
                waiting.putIfAbsent(product,new ArrayList<>());
                waiting.get(product).add(userId);
                return false;
            }
        }

        int checkStock(String product){
            return stock.getOrDefault(product,0);
        }
    }