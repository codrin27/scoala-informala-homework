/**
 * This class use the method "valid" to check if the hours and minutes have the correct format.
 */
public class Validation {
    public static boolean valid(int a, int b)
    {
        return (a >= 0 && a <= 23 && b >= 0 && b <= 59);
    }
}
