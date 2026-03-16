import java.util.*;

class MultiCache {

    LinkedHashMap<String,String> L1 =
            new LinkedHashMap<>(10000,0.75f,true);

    HashMap<String,String> L2 = new HashMap<>();

    String getVideo(String id){

        if(L1.containsKey(id)){
            return L1.get(id);
        }

        if(L2.containsKey(id)){
            String data = L2.get(id);
            L1.put(id,data);
            return data;
        }

        String dbData = "VideoData";
        L2.put(id,dbData);
        return dbData;
    }
}