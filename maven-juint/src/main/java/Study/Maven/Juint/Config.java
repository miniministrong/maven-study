package Study.Maven.Juint;

public class Config {
    public String getConfigFile(String filename) {
        // 获取当前系统的名字并且全部转换成小写
        String os = System.getProperty("os.name").toLowerCase();
        // contains()方法：判断字符串中是否有子字符串
        if (os.contains("win")){
            return "C:\\" + filename;
        }
        if (os.contains("unix") || os.contains("linux") || os.contains("mac")) {
            return "/usr/local/" + filename;
        }
        throw new UnsupportedOperationException();
    }
}