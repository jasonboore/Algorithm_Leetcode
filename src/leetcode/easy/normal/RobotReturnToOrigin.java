package leetcode.easy.normal;

/**
 * 机器人能否返回原点
 */
public class RobotReturnToOrigin {
    public boolean judgeCircle(String moves) {
        int x = 0, y = 0;
        for (int i = 0; i < moves.length(); i++) {
            char c = moves.charAt(i);
            switch (c) {
                case 'U':
                    x += 1;
                    break;
                case 'D':
                    x -= 1;
                    break;
                case 'L':
                    y -= 1;
                    break;
                case 'R':
                    y += 1;
                    break;
            }
        }
        return x == 0 && y == 0;
    }
}
