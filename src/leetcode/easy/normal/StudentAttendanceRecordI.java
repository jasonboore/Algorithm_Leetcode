package leetcode.easy.normal;

/**
 *
 * 学生出勤记录 I
 */
public class StudentAttendanceRecordI {
    public static boolean checkRecord(String s) {
        int countA = 0, countL = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'A') {
                countA++;
                countL = 0;
            }else if(s.charAt(i) == 'L') {
                countL++;
            }else {
                countL = 0;
            }
            if(countA > 1 || countL > 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "LALL";
        System.out.println(checkRecord(s));
    }
}
