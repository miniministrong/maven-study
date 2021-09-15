package Study.Maven.Juint;

import java.util.Locale;

public class StringUtils {
    public static String changeStr(String s){
        if (s.length() == 0) {
            return s;
        }
        // String类型有个方法叫做charAt(下标)：是将第几个字符取出并转为字符类型
        // Character字符封装类有一个方法叫做toUpperCase()：是将字符类转换为大写
        // substring(下标)：从下标位置开始截取字符串，截到最后一个字符为止
        // toLowerCase()：是将当前字符串全部转换为小写
        return Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase();
    }
}
