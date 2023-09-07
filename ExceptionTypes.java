public class ExceptionTypes {
    public static void main(String[] args) {
        try {
            // ArithmeticException
            int result = 10 / 0;
            // ArrayIndexOutOfBoundsException
            int[] arr = new int[5];
            arr[10] = 5;
            // NullPointerException
            String str = null;
            int length = str.length();
            // NumberFormatException
            String numStr = "abc";
            int num = Integer.parseInt(numStr);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }
    }
}
