package pl.filip850.ArraysHashing;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCoder {
  public String encode(List<String> strs) {
    //NOTE1: we can use frame attempt to encode it using frame like ##str.len()##str##str2.len()##str2...
    StringBuilder sb = new StringBuilder();
    strs.forEach(str -> {
      sb.append("##");
      sb.append(str.length());
      sb.append("##");
      sb.append(str);
    });
    return sb.toString();
  }

  public List<String> decode(String str) {
    List<String> result = new ArrayList<>();

    Pattern p = Pattern.compile("##(\\d+)##");
    Matcher m = p.matcher(str);

    int index = 0;

    while (m.find(index)) {
      int len = Integer.parseInt(m.group(1));
      int start = m.end();
      String value = str.substring(start, start + len);
      result.add(value);

      index = start + len;
    }

    return result;
  }
}
