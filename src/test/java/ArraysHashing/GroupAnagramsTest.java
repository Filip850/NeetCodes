package ArraysHashing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pl.filip850.ArraysHashing.GroupAnagrams;

import java.util.*;

public class GroupAnagramsTest {

  private final GroupAnagrams groupAnagrams;

  public GroupAnagramsTest() {
    this.groupAnagrams = new GroupAnagrams();
  }

  @Test
  @DisplayName("Single word")
  void singleWord() {
    List<List<String>> expected = new ArrayList<>(List.of(new ArrayList<>(List.of("hat"))));
    List<List<String>> actual = groupAnagrams.groupAnagrams(new String[]{"hat"});

    expected.forEach(Collections::sort);
    actual.forEach(Collections::sort);

    Assertions.assertEquals(expected, actual);
  }

  @Test
  @DisplayName("Two word anagram")
  void twoWordAnagram() {
    List<List<String>> expected = new ArrayList<>(List.of(new ArrayList<>(List.of("act", "cat"))));
    List<List<String>> actual = groupAnagrams.groupAnagrams(new String[]{"act", "cat"});

    expected.forEach(Collections::sort);
    actual.forEach(Collections::sort);

    Assertions.assertEquals(expected, actual);
  }

  @Test
  @DisplayName("Multiple anagrams")
  void multipleAnagrams() {
    List<List<String>> expected = new ArrayList<>(List.of(
        new ArrayList<>(List.of("stop", "pots", "tops")),
        new ArrayList<>(List.of("hat")),
        new ArrayList<>(List.of("act", "cat"))
    ));
    List<List<String>> actual = groupAnagrams.groupAnagrams(
        new String[]{"act", "pots", "tops", "cat", "stop", "hat"}
    );

    expected.forEach(Collections::sort);
    actual.forEach(Collections::sort);

    expected.sort(Comparator.comparing(List::getFirst));
    actual.sort(Comparator.comparing(List::getFirst));

    Assertions.assertEquals(expected, actual);
  }

  @Test
  @DisplayName("Edge case long letters")
  void longLetterCase() {
    List<List<String>> expected = new ArrayList<>(List.of(
        new ArrayList<>(List.of("bbbbdddddd")),
        new ArrayList<>(List.of("bbbbbbbbbc"))
    ));

    List<List<String>> actual = groupAnagrams.groupAnagrams(
        new String[]{"bbbbdddddd", "bbbbbbbbbc"}
    );

    expected.forEach(Collections::sort);
    actual.forEach(Collections::sort);

    expected.sort(Comparator.comparing(List::getFirst));
    actual.sort(Comparator.comparing(List::getFirst));

    Assertions.assertEquals(expected, actual);
  }

}
