/**
 * This class will return with the static method the biggest number from 2 numbers.
 */
public class Max {
    public static int getMax(int n1, int n2) {
        int max;
        if (n1 < n2)
            max = n2;
        else
            max = n1;

        return max;
    }
}
