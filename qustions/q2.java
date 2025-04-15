public class q2 {

    public static int[][] socialNet = {
            {0, 1, 0, 0, 1},
            {0, 0, 0, 1, 0},
            {0, 1, 0, 0, 1},
            {0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0}
    };

    public static int nFollowers(int user) {
        int count = 0;
        for (int i = 0; i < socialNet.length; i++) {
            if (socialNet[user][i] == 1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }


}
