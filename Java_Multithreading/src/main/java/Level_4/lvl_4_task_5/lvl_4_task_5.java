package Level_4.lvl_4_task_5;

/*
Black box
*/

public class lvl_4_task_5 implements Action {
    public static int countActionObjects;

    private int param;

    private Action solutionAction = new Action() {
        //напишите тут ваш код
        private FirstClass first;
        private SecondClass second;

        public void someAction() {
            //напишите тут ваш код
            if (param > 0) {
                if (first == null) {
                    first = new FirstClass() {
                        @Override
                        public void someAction() {
                            super.someAction();
                            lvl_4_task_5.this.someAction();
                        }

                        @Override
                        public Action getDependantAction() {
                            System.out.println(param);
                            param--;
                            return param > 0 ? lvl_4_task_5.this : this;
                        }
                    };
                }
                first.getDependantAction().someAction();
            } else {
                if (second == null) {
                    second = new SecondClass() {
                        @Override
                        public void someAction() {
                            sb.append(SPECIFIC_ACTION_FOR_ANONYMOUS_SECOND_CLASS_PARAM).append(param);
                            super.someAction();
                        }
                    };
                }
                second.someAction();
            }
        }
    };


    public lvl_4_task_5(int param) {
        this.param = param;
    }

    @Override
    public void someAction() {
        solutionAction.someAction();
    }

    /**
     * 5
     * 4
     * 3
     * 2
     * 1
     * class FirstClass, method someAction
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = 0
     * Count of created Action objects is 2
     * class SecondClass, method someAction
     * Specific action for anonymous SecondClass, param = -1
     * Count of created Action objects is 3
     */
    public static void main(String[] args) {
        lvl_4_task_5 solution = new lvl_4_task_5(5);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);

        solution = new lvl_4_task_5(-1);
        solution.someAction();
        System.out.println("Count of created Action objects is " + countActionObjects);
    }
}
