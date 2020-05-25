package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author Yao
 * @ClassName Loader
 * @Description 装载器,将字节码装载到虚拟机中
 * Date 2020/5/21 11:21
 **/
public class Loader {
    public Loader(){

    }
    public byte[] load() throws IOException {
        System.out.print("\n"+"字节码文件内容:\n");
        InputStream input = new FileInputStream(FileOpt.resultfilePath);
        byte[] b = new byte[input.available()];
        input.read(b);
        String str = new String(b,"GBK");
        System.out.print(str);
        input.close();
        return b;
    }
}
