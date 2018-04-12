package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchy {

  static private List<String> haystack = new ArrayList<>();

  public static void main(String[] args) {
    haystack = Arrays.asList(/* Enter string literal values here! */);
  }


  static int binarySearch(List<String> haystack, String needle) {
    int index = 0;
    for (int i = 0 ; i < haystack.size() ; i++) {
      if (haystack.get(i).equals(needle) ) {
        index = i;
        break;
      } else if (needle.compareTo(haystack.get(i)) < 0){
        index = ((-1) * i - 1);
        break;
      } else {
        index = ((-1) * haystack.size());
      }
    }
    System.out.println(index);
    return index;
  }
}
