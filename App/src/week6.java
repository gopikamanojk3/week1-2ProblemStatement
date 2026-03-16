import java.util.*;

class TokenBucket {

    int tokens;
    int maxTokens;
    long lastRefill;

    TokenBucket(int max){
        tokens = max;
        maxTokens = max;
        lastRefill = System.currentTimeMillis();
    }
}

class RateLimiter {

    HashMap<String,TokenBucket> map = new HashMap<>();

    boolean allow(String client){

        map.putIfAbsent(client,new TokenBucket(1000));
        TokenBucket b = map.get(client);

        if(b.tokens>0){
            b.tokens--;
            return true;
        }
        return false;
    }
}