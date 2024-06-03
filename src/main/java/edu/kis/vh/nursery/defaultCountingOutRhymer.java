package edu.kis.vh.nursery;

/**
 * Klasa defaultCountingOutRhymer implementuje prostą strukturę stosu
 * Udostępnia metody do dodawania, usuwania, sprawdzania czy stos jest pełny lub pusty oraz podglądania wartości na szczycie stosu
 */

public class defaultCountingOutRhymer {

    public static final int CAPACITY_STACK = 12;
    public static final int EMPTY_STACK = -1;

    /**
     * Tablica przechowująca wartości stosu
     */
    private int[] NUMBERS = new int[CAPACITY_STACK];

    /**
     * Indeks najwyższego elementu na stosie. Zaczyna się od -1, co oznacza pusty stos
     */
    public int total = EMPTY_STACK;

    /**
     * Dodaje wartość na stos, jeśli stos nie jest pełny.
     *
     * @param in wartość do dodania na stos
     */
    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    /**
     * Sprawdza, czy stos jest pusty.
     *
     * @return true, jeśli stos jest pusty, w przeciwnym razie false.
     */
    public boolean callCheck() {
        return total == -1;
    }

    /**
     * Sprawdza, czy stos jest pełny.
     *
     * @return true, jeśli stos jest pełny, w przeciwnym razie false.
     */
    public boolean isFull() {
        return total == 11;
    }

    /**
     * Podgląda wartość na szczycie stosu bez jej usuwania.
     *
     * @return wartość na szczycie stosu, jeśli stos nie jest pusty, lub -1, jeśli jest pusty.
     */
    protected int peekaboo() {
        if (callCheck())
            return -1;
        return NUMBERS[total];
    }

    /**
     * Usuwa wartość ze szczytu stosu.
     *
     * @return wartość ze szczytu stosu, jeśli stos nie jest pusty, lub -1, jeśli jest pusty.
     */
    public int countOut() {
        if (callCheck())
            return -1;
        return NUMBERS[total--];
    }

}
