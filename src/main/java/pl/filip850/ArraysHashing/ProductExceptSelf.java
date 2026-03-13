package pl.filip850.ArraysHashing;

public class ProductExceptSelf {

  public int[] productExceptSelf(int[] nums) {
    //Solution after hints my own idea was to brutal force it but i knew that there was probably better way
    //So i looked for hint (i want this repo to have the best solutions)
    int[] suffix = new int[nums.length];
    int[] prefix = new int[nums.length];

    prefix[0] = 1;
    for (int i = 1; i < nums.length; i++) {
      prefix[i] = prefix[i-1] * nums[i-1];
    }
    suffix[nums.length-1] = 1;
    for (int i = nums.length - 2; i >= 0; i--) {
      suffix[i] = suffix[i + 1] * nums[i + 1];
    }

    int[] result = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      result[i] = prefix[i] * suffix[i];
    }

    return result;
  }

}
