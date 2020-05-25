package utils;
import	java.util.ArrayList;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yao
 * @ClassName FileOpt
 * @Description TOOD
 * Date 2020/5/24 16:34
 **/
public class FileOpt {
    static String root = System.getProperty("user.dir");
    static String sourcefilePath =
            root+ File.separator+"src"+File.separator+"io"+File.separator+"source.txt";
    static String resultfilePath =
            root+ File.separator+"src"+File.separator+"out"+File.separator+"result.txt";
    /**
     * 获取txt文件内容并按行放入list中
     */
    public static List<String> readFile() throws Exception {
        FileReader fileReader =new FileReader(sourcefilePath);
        BufferedReader bufferedReader =new BufferedReader(fileReader);
        List<String> list =new ArrayList<String>();
        String str=null;
        while((str=bufferedReader.readLine())!=null) {
            if(str.trim().length()>2) {
                list.add(str);
            }
        }
        return list;
    }

    public static boolean writeFile(String args) {
        try {
            File file = new File(resultfilePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(args);
            bw.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return true;
        }
    }

    public static boolean clearFile() {
        try {
            File file = new File(resultfilePath);
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("");
            bw.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return true;
        }
    }
}
