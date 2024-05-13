package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    public static int CAPACITY_STACK = 12;
    public static int EMPTY_STACK = -1;
    private int[] NUMBERS = new int[CAPACITY_STACK];

    public int total = EMPTY_STACK;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == -1;
        }
        
            public boolean isFull() {
                return total == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return -1;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return -1;
                        return NUMBERS[total--];
                    }

}
