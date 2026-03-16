import java.util.*;

class Autocomplete {

    HashMap<String,Integer> queries = new HashMap<>();

    void update(String q){
        queries.put(q,queries.getOrDefault(q,0)+1);
    }

    List<String> search(String prefix){

        List<String> result = new ArrayList<>();

        for(String q:queries.keySet()){
            if(q.startsWith(prefix)){
                result.add(q);
            }
        }

        return result;
    }
}