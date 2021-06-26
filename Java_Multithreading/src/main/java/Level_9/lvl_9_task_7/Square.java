package Level_9.lvl_9_task_7;

public class Square implements Computable<Integer, Integer> {
    @Override
    public Integer compute(Integer integer) throws InterruptedException {
        int val = integer.intValue();
        return val * val;
    }
}
