public class StringUtil {

    public static String repeat(String msj, int num){
        StringBuilder result= new StringBuilder();
        for (int i = 0; i < num; i++) {
            result.append(msj);
        }
        
        
        return result.toString();
    }
}
