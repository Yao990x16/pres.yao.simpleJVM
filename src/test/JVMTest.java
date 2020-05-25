package test;

import utils.ExecutionEngine;
import utils.Loader;
import utils.TranslateByteCode;

import java.io.IOException;

/**
 * @author Yao
 * @ClassName JVMTest
 * @Description TODD
 * Date 2020/5/22 17:50
 **/
public class JVMTest {
    public static void main(String[] args) throws Exception {
        TranslateByteCode byteCode = new TranslateByteCode();
        byteCode.translate();
        Loader loader = new Loader();
        byte[] b = loader.load();
        ExecutionEngine engine = new ExecutionEngine(b);
        engine.execute();
    }
}
