package Level_10.lvl_10_task_13;

public class MoveEfficiency implements Comparable<MoveEfficiency> { //Эффективность хода
    private int numberOfEmptyTiles;
    private int score;
    private Move move;

    public MoveEfficiency(int numberOfEmptyTiles, int score, Move move) {
        this.numberOfEmptyTiles = numberOfEmptyTiles;
        this.score = score;
        this.move = move;
    }

    public Move getMove() {
        return move;
    }

    @Override
    public int compareTo(MoveEfficiency o) {
        if (numberOfEmptyTiles > o.numberOfEmptyTiles) {
            return 1;
        } else if (numberOfEmptyTiles < o.numberOfEmptyTiles) {
            return -1;
        } else {
            if (score > o.score) {
                return 1;
            } else if (score < o.score) {
                return -1;
            }
        }
        return 0;
    }
}
