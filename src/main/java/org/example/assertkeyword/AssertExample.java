package org.example.assertkeyword;

public class AssertExample {
    static int value = 3;

    private static int getNumber() {
        value--;
        return value;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            int result = getNumber();
            assert result > 0;
            System.out.println("Output is: " + result);
        }
    }
}
