package pl.filip850.ArraysHashing;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class LongestConsecutive {
  public int longestConsecutive(int[] nums) {
    // Brute force could use two nested loops → O(n^2)
    // Sorting would give something around O(n log n)
    // However, the problem suggests that an O(n) solution is possible
    // We can use a Set and check whether (num + 1) exists to build consecutive sequences
    // If num-1 does not exist, we have start of a sequence.

    int longest = 0;
    Set<Integer> numSet = Arrays.stream(nums)
        .boxed()
        .collect(Collectors.toSet());

    for (int num : numSet){
      if (!numSet.contains(num-1)){
        int len = 1;
          while(numSet.contains(num+len)) len++;
          longest = Math.max(longest, len);
      }
    }

    return longest;
  }
}
