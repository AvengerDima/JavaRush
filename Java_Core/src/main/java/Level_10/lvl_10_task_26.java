package Level_10;

/*
Алгоритмы-прямоугольники
*/

public class lvl_10_task_26 {
    public static void main(String[] args) {
        byte[][] a1 = new byte[][]{
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 0},
                {1, 1, 0, 1}
        };
        byte[][] a2 = new byte[][]{
                {1, 0, 0, 1},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {1, 0, 0, 1}
        };

        int count1 = getRectangleCount(a1);
        System.out.println("count = " + count1 + ". Должно быть 2");
        int count2 = getRectangleCount(a2);
        System.out.println("count = " + count2 + ". Должно быть 4");
    }

    public static int getRectangleCount(byte[][] a) {
        int countShips = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] == 1) {
                    if (j != 0 && i != 0) {
                        if (a[i - 1][j] != 1 && a[i][j - 1] != 1) {
                            countShips = countShips + 1;
                        }
                    } else {
                        if (i == 0 && j == 0) {
                            countShips = countShips + 1;
                        }else{
                            if (i == 0) {
                                if (a[0][j-1] == 0) {
                                    countShips = countShips + 1;
                                }
                            }
                            if (j == 0) {
                                if (a[i-1][0] == 0) {
                                    countShips = countShips + 1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return countShips;
    }
}
