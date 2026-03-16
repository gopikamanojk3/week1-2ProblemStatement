import java.util.*;

class PlagiarismDetector {

    HashMap<String, Set<String>> map = new HashMap<>();

    void addDocument(String id,String text){

        String[] words = text.split(" ");

        for(int i=0;i<words.length-4;i++){
            String gram = words[i]+" "+words[i+1]+" "+words[i+2]+" "+words[i+3]+" "+words[i+4];

            map.putIfAbsent(gram,new HashSet<>());
            map.get(gram).add(id);
        }
    }
}