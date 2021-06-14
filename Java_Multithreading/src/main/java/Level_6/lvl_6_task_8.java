package Level_6;

/*
Мудрый человек думает раз, прежде чем два раза сказать
*/

public class lvl_6_task_8 {
    int var1;
    int var2;
    int var3;
    int var4;
    public final Object lock1 = new Object();
    public final Object lock2 = new Object();

    public lvl_6_task_8(int var1, int var2, int var3, int var4) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
        this.var4 = var4;
    }

    public int getSumOfVar1AndVar2() {
        synchronized (lock1) {
            return var1 + var2;
        }
    }

    public int getSumOfVar3AndVar4() {
        synchronized (lock2) {
            return var3 + var4;
        }
    }

    public static void main(String[] args) {

    }
}
