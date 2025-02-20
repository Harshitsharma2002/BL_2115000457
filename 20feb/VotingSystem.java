import java.util.*;

public class VotingSystem {
    
    
    private HashMap<String, Integer> voteMap;
    private LinkedHashMap<String, Integer> orderedVotes;
    private TreeMap<Integer, List<String>> sortedVotes;

    public VotingSystem() {
        this.voteMap = new HashMap<>();
        this.orderedVotes = new LinkedHashMap<>();
        this.sortedVotes = new TreeMap<>(Collections.reverseOrder());  // To sort by descending order
    }

  
    public void castVote(String candidate) {
       
        voteMap.put(candidate, voteMap.getOrDefault(candidate, 0) + 1);

      
        orderedVotes.put(candidate, voteMap.get(candidate));
        
       
        updateSortedVotes(candidate);
    }

    
    private void updateSortedVotes(String candidate) {
        int votes = voteMap.get(candidate);
        
      
        for (Map.Entry<Integer, List<String>> entry : sortedVotes.entrySet()) {
            if (entry.getValue().contains(candidate)) {
                entry.getValue().remove(candidate);
                if (entry.getValue().isEmpty()) {
                    sortedVotes.remove(entry.getKey());
                }
                break;
            }
        }
        
       
        sortedVotes.computeIfAbsent(votes, k -> new ArrayList<>()).add(candidate);
    }

    
    public void displaySortedResults() {
        System.out.println("Results (Sorted by Votes):");
        for (Map.Entry<Integer, List<String>> entry : sortedVotes.entrySet()) {
            for (String candidate : entry.getValue()) {
                System.out.println(candidate + ": " + entry.getKey() + " votes");
            }
        }
    }

 
    public void displayOrderedVotes() {
        System.out.println("Votes in the Order They Were Cast:");
        for (Map.Entry<String, Integer> entry : orderedVotes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votes");
        }
    }

    public int getVoteCount(String candidate) {
        return voteMap.getOrDefault(candidate, 0);
    }

   
    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Alice");

        
        votingSystem.displaySortedResults();
        
        
        votingSystem.displayOrderedVotes();
    }
}
