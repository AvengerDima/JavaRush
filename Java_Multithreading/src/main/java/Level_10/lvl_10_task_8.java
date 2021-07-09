package Level_10;

/*
Битовые операции
*/

public class lvl_10_task_8 {
    public static void main(String[] args) {
        lvl_10_task_8 solution = new lvl_10_task_8();
        int number = Integer.MAX_VALUE - 133;
        System.out.println(Integer.toString(number, 2)); //1111111111111111111111101111010

        String result = Integer.toString(solution.resetLowerBits(number), 2);
        System.out.println(result); //expected: 1000000000000000000000000000000
    }

    public int resetLowerBits(int number) {
        number = number | (number >> 1);
        number = number | (number >> 2);
        number = number | (number >> 4);
        number = number | (number >> 8);
        number = number | (number >> 16);
        return (number & ~(number >> 1));
    }
}
