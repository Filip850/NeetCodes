package pl.filip850.ArraysHashing;

import java.util.*;

public class GroupAnagrams {
  public List<List<String>> groupAnagrams(String[] strs) {
    //NOTE1: Anagram needs to be the same len
    //NOTE2: Anagram needs to have the same num of letters
    //NOTE3: We can make hash of strings by converting int[26] when hash will be string form of this map making it a key.

    Map<String, List<String>> groupedAnagrams = new HashMap<>();

    for(String word: strs){
      int[] letters = new int[26];
      for(char character: word.toCharArray()){
        letters[(int) character-97]++;
      }
      groupedAnagrams.computeIfAbsent(buildHash(letters), k -> new ArrayList<>()).add(word);
    }
    List<List<String>> result = new ArrayList<>();
    groupedAnagrams.forEach((k, v) -> result.add(v));
    return result;
  }

  private String buildHash(int[] letters){
    StringBuilder builder = new StringBuilder(26);
    for(int counted: letters){
      builder.append(counted).append(",");
    }
    return builder.toString();
  }
}
