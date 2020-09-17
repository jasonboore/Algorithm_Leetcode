package leetcode.easy.normal;

/**
 * 密钥格式化
 */
public class LicenseKeyFormatting {
    public static String licenseKeyFormatting(String S, int K) {
        S = S.replace("-", "").toUpperCase();
        if(S.length() < 1) {
            return S.toUpperCase();
        }
        StringBuilder sb = new StringBuilder();
        int count = K;
        int i = S.length() - 1;
        while (i > -1) {
            sb.insert(0, S.charAt(i--));
            count--;
            if(count == 0) {
                sb.insert(0, '-');
                count = K;
            }
        }
        S = sb.toString().charAt(0) == '-' ? sb.toString().substring(1, sb.length()) : sb.toString();
        return S;
    }

    public static void main(String[] args) {
        String s = "---";
        System.out.println(licenseKeyFormatting(s, 2));
    }
}
