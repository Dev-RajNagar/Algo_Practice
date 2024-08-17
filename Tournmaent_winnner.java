import java.util.*;

class Program {
    public int Home_TEAM_WON = 1;
  
  public String tournamentWinner(
      ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
    String currBest= "";
    HashMap<String,Integer> scores= new HashMap<String,Integer>();
    scores.put(currBest,0);

    for(int idx= 0 ; idx < competitions.size();idx++)
    {
      ArrayList<String> competition = competitions.get(idx);
      int result= results.get(idx);
      String h_team = competition.get(0);
      String a_team = competition.get(1);
      String winningteam = (result == Home_TEAM_WON) ? h_team : a_team;

      updateScores(winningteam,3,scores);
        if(scores.get(winningteam)>scores.get(currBest)){
          currBest= winningteam;
        }}
    return currBest;
  }
 
    public void updateScores(String team, int points, HashMap<String,Integer> scores)
    {
      if(!scores.containsKey(team)){
        scores.put(team,0);
      }
     scores.put(team, scores.get(team)+points);
  }
  public static void main(String[] args) {
          
  }
}