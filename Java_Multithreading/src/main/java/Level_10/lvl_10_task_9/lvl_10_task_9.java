package Level_10.lvl_10_task_9;

/*
Swap по-новому
*/

public class lvl_10_task_9 {
    public static void main(String[] args) {
        /* expected output
        x=4, y=5
        x=5, y=4
         */

        Pair pair = new Pair(4, 5);
        System.out.println(pair);
        pair.swap();
        System.out.println(pair);
    }
}
