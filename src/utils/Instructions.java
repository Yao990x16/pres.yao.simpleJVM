package utils;

/**
 * @author Yao
 * @ClassName Instructions
 * @Description 指令集
 * Date 2020/5/21 11:20
 **/
public class Instructions {

    enum INSTRUCTIONS{
        //指令集
        ADD(1,"add"),
        SUB(2,"sub"),
        MUL(3,"mul"),
        DIV(4,"div"),
        //压栈
        PUSH(5,"push"),
        //弹栈
        POP(6,"pop"),
        //复制栈顶值
        DUP(7,"dup"),
        //交换栈顶和次栈顶值
        SWAP(8,"swap"),
        //停机
        HALT(9,"halt");
        //字节码

        private int byteCode;

        //助记符

        private String mnemonic;

        INSTRUCTIONS(int byteCode, String mnemonic) {
            this.byteCode = byteCode;
            this.mnemonic = mnemonic;
        }

        public int getByteCode() {
            return byteCode;
        }

        public void setByteCode(int byteCode) {
            this.byteCode = byteCode;
        }

        public String getMnemonic() {
            return mnemonic;
        }

        public void setMnemonic(String mnemonic) {
            this.mnemonic = mnemonic;
        }
    }
}
