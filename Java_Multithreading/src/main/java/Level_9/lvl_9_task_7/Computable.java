package Level_9.lvl_9_task_7;

/* Argument and Value are generic types*/
public interface Computable<Argument, Value> {
    Value compute(Argument argument) throws InterruptedException;
}
