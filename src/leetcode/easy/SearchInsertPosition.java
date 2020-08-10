package leetcode.easy;

/**
 *  搜索插入位置
 */
public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int L = 0;
        int R = length - 1;
        int res = 0;
        while (L <= R) {
            int mid = (L + R) / 2;
            if(nums[mid] == target) {
                res = mid;
                break;
            }
            if(nums[mid] > target) {
                if(L == mid) {
                    res = mid;
                }
                R = mid - 1;
            }
            if(nums[mid] < target) {
                if(L == mid) {
                    res = mid + 1;
                }
                L = mid + 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {3,5,7,9,10};
        System.out.println(searchInsert(nums, 8));
    }
}
