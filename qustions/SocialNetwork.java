public class SocialNetwork {

    public static int[][] socialNet = {
            {0, 1, 0, 0, 1},
            {0, 0, 0, 1, 0},
            {0, 1, 0, 0, 1},
            {0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0}
    };

    // Returns an array containing all the users that the given user follows
    public static int[] whoUserFollows(int user){
        return null; // Placeholder
    }


    //Returns the number of followers that the given user has
    public static int nFollowers(int user){
        return -1;
    };

    //Returns the user that has the largest number of followers
    public static int mostPopularUser(){
        return -1;
    };

    //Returns an array containing all the users that the given user follows
    //The array's length is the number of users that the given user follows

    public static void main(String[] args) {
        System.out.println("User 1 has " + nFollowers(1) + " followers.");
        System.out.println("User 2 has " + nFollowers(2) + " followers.");
        System.out.println("User 3 has " + nFollowers(3) + " followers.");

        int popularUser = mostPopularUser();
        System.out.println("The most popular user is: User " + popularUser);

        int[] follows0 = whoUserFollows(0);
        System.out.print("User 0 follows: ");
        if (follows0 != null) {
            for (int user : follows0) {
                System.out.print(user + " ");
            }
        }
        System.out.println();

        int[] follows2 = whoUserFollows(2);
        System.out.print("User 2 follows: ");
        if (follows2 != null) {
            for (int user : follows2) {
                System.out.print(user + " ");
            }
        }
        System.out.println();
    }


}
