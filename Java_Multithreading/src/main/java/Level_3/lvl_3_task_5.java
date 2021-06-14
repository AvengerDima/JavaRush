package Level_3;

/*
Inner
*/

public class lvl_3_task_5 {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static lvl_3_task_5[] getTwoSolutions() {
        lvl_3_task_5[] solutions = new lvl_3_task_5[2];
        solutions[0] = new lvl_3_task_5();
        solutions[1] = new lvl_3_task_5();
        solutions[0].innerClasses[0] = solutions[0].new InnerClass();
        solutions[0].innerClasses[1] = solutions[0].new InnerClass();
        solutions[1].innerClasses[0] = solutions[1].new InnerClass();
        solutions[1].innerClasses[1] = solutions[1].new InnerClass();
        return solutions;
    }

    public static void main(String[] args) {

    }
}
