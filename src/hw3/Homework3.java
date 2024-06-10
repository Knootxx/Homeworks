package hw3;

public class Homework3 {
    public static void main(String[] args) {

        int[] nums = new int[]{-2, 5, 1, -9, 0, 2, 5, 1, 8, 10};
        int result = SearchLinear(nums, 7);
        if (result == -1) {
            System.out.println("Число не найдено" + result);

        } else {
            System.out.println("Число найдено " + result);

        }
    }

    public static int SearchLinear(int[] nums, int indexfind) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == indexfind) {
                return i;
            }

        }
        return -1;
    }
}





