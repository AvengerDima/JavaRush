package Level_10;

/*
Кроссворд
*/

import java.util.ArrayList;
import java.util.List;

public class lvl_10_task_27 {
    public static void main(String[] args) {
        int[][] crossword = new int[][]{
                {'f', 'd', 'e', 'r', 'l', 'k'},
                {'u', 's', 'a', 'm', 'e', 'o'},
                {'l', 'n', 'g', 'r', 'o', 'v'},
                {'m', 'l', 'p', 'r', 'r', 'h'},
                {'p', 'o', 'e', 'e', 'j', 'j'}
        };
        detectAllWords(crossword, "home", "same");
        /*
Ожидаемый результат
home - (5, 3) - (2, 0)
same - (1, 1) - (4, 1)
         */
    }

    public static List<Word> detectAllWords(int[][] crossword, String... words) {
        List<Word> list = new ArrayList<>();
        int[] indexM = new int[] {-1, -1, 0, 1, 1, 1, 0, -1};
        int[] indexN = new int[] {0, 1, 1, 1, 0, -1, -1, -1};
        for (int j = 0; j < crossword.length; j++) {
            for (int i = 0; i < crossword[j].length; i++) {
                for(String s:words){
                    if (crossword[j][i] == (int) s.charAt(0)) {
                        for (int t = 0; t < indexM.length; t++) {
                            try {
                                StringBuilder temp = new StringBuilder();
                                int n = j;
                                int m = i;
                                for (int count = 0; count < s.length(); count++) {
                                    temp.append((char) crossword[n][m]);
                                    n = n + indexN[t];
                                    m = m + indexM[t];
                                }
                                if (temp.toString().equals(s)) {
                                    Word word = new Word(s);
                                    word.setStartPoint(i, j);
                                    word.setEndPoint(m - indexM[t], n - indexN[t]);
                                    list.add(word);
                                }
                            } catch (ArrayIndexOutOfBoundsException ignored) {
                            }
                        }
                    }
                }
            }
        }
        return list;
    }

    public static class Word {
        private String text;
        private int startX;
        private int startY;
        private int endX;
        private int endY;

        public Word(String text) {
            this.text = text;
        }

        public void setStartPoint(int i, int j) {
            startX = i;
            startY = j;
        }

        public void setEndPoint(int i, int j) {
            endX = i;
            endY = j;
        }

        @Override
        public String toString() {
            return String.format("%s - (%d, %d) - (%d, %d)", text, startX, startY, endX, endY);
        }
    }
}
