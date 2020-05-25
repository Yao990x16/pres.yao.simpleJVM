package utils;

import java.io.UnsupportedEncodingException;

/*
 * @author Yao
 * @ClassName ExecutionEngine
 * @Description 执行字节码
 * Date 2020/5/21 11:22
 */

/**
 * @author Yao
 */
public class ExecutionEngine {
    byte[] b;
    public ExecutionEngine(byte[] b) {
        this.b = b;
    }

    public void execute() {
        String[] str = new String(b).split(" ");
        System.out.println("\nstr内容: "+"\nstr长度:"+str.length);
        System.out.println("第一个内容的长度: "+str[0].length());
        for(String s : str){
            System.out.println(s);
        }
        //栈
        int[] stack = new int[100];
        //栈顶指针
        int sp = -1;
        //程序计数器
        int pc = 0;
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(Integer.toBinaryString(Instructions.INSTRUCTIONS.PUSH.getByteCode()))){
                System.out.println("push前,栈顶指针: "+sp);
                stack[sp+1] = Integer.parseInt(str[i+1],2);
                sp = sp + 1;
                pc = pc +1 ;
                i = i + 1;
                System.out.println("push后,栈顶指针: "+sp);
                continue;
            }
            if(str[i].equals(Integer.toBinaryString(Instructions.INSTRUCTIONS.ADD.getByteCode()))){
                System.out.println("add前,栈顶指针: "+sp);
                int num1 = stack[sp-1];
                int num2 = stack[sp];
                int result = num1+num2;
                stack[sp-1] = result;
                sp=sp-1;
                pc=pc+1;
                System.out.println("add后,栈顶指针: "+sp);
            }
            if(str[i].equals(Integer.toBinaryString(Instructions.INSTRUCTIONS.SUB.getByteCode()))) {
                int num1 = stack[sp-1];
                int num2 = stack[sp];
                int result = num1-num2;
                stack[sp-1] = result;
                sp = sp-1;
                pc = pc+1;
            }
            if(str[i].equals(Integer.toBinaryString(Instructions.INSTRUCTIONS.MUL.getByteCode()))) {
                int num1 = stack[sp-1];
                int num2 = stack[sp];
                int result = num1*num2;
                stack[sp-1] = result;
                sp = sp-1;
                pc = pc+1;
            }
            if(str[i].equals(Integer.toBinaryString(Instructions.INSTRUCTIONS.DIV.getByteCode()))) {
                int num1 = stack[sp-1];
                int num2 = stack[sp];
                int result = num1/num2;
                stack[sp-1] = result;
                sp = sp-1;
                pc = pc+1;
            }
            if(str[i].equals(Integer.toBinaryString(Instructions.INSTRUCTIONS.HALT.getByteCode()))) {
                System.out.print("\n"+"计算结果为:"+stack[sp]);
                break;
            }
        }
    }
}
