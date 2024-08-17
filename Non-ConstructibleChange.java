import java.util.*;

class Program {

  public int nonConstructibleChange(int[] coins) {
    
  Arrays.sort(coins);
    int currChangeCreated=0;
    for(int coin:coins)
    {
      if(coin>currChangeCreated+1){
        return currChangeCreated+1;
      }
      currChangeCreated+=coin;
    }
    
    return currChangeCreated+1;
  }
}
