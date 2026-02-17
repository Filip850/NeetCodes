package pl.filip850.ArraysHashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {
  public int[] topKFrequent(int[] nums, int k) {
    //NOTE 1: HashMap <val,freq> will have all the results but unsorted so hard to find two or K biggest
    //NOTE 2: I can move through whole map and bucket them to have list of the most frequent numbers in it.
    //NOTE 3: the bucket will need n+1 len at maximum size (in the worst scenario we will have all numbers with freq one)

    Map<Integer, Integer> numOfOccurs = new HashMap<>();
    for (int num : nums) {
      numOfOccurs.merge(num, 1, Integer::sum);
    }

    List<Integer>[] buckets = new List[nums.length + 1];
    // So buckets[frequency] = value (which is a number) - so I can get numbers from the highest going downward until k satisfied.

    numOfOccurs.forEach((value, freq) -> {
      if (buckets[freq] == null) {
        buckets[freq] = new ArrayList<>();
      }
      buckets[freq].add(value);
    });
    int[] result = new int[k];
    int index = 0;

    for (int freq = nums.length; freq >= 1 && index < k; freq--) {
      if (buckets[freq] != null) {
        for (int value : buckets[freq]) {
          result[index++] = value;
          if (index == k) {
            return result;
          }
        }
      }
    }

    return result;
  }
}
