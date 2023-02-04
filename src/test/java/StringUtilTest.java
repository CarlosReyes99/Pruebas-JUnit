public class StringUtilTest {
    public static void main(String[] args) {
        assertEquals(StringUtil.repeat("hola", 3), "holaholahola");


    }

    private static void assertEquals(String current, String expected) {

        if (!current.equals(expected)){
            throw new RuntimeException(current+" is not equal to "+expected);
        }
    }

}