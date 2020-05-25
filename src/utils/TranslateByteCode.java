package utils;
import	java.nio.file.Files;
import java.nio.file.Paths;
import	java.util.ArrayList;

import java.io.*;
import java.util.List;

/**
 * @author Yao
 * @ClassName TranslateByteCode
 * @Description 将源程序转换成字节码
 * Date 2020/5/22 17:49
 **/
public class TranslateByteCode {
    public void translate() throws Exception {
        if(Files.exists(Paths.get(FileOpt.resultfilePath))){
            FileOpt.clearFile();
        }
        List<String> list = new ArrayList<String> ();
        list = FileOpt.readFile();
        String[] strings = (String[]) list.toArray(new String[list.size()]);
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] strs = str.split(" ");
           for(int j = 0; j<strs.length; j++){
               switch (strs[j]){
                   case "":
                       continue;
                   case "PUSH":
                       int push = Instructions.INSTRUCTIONS.PUSH.getByteCode();
                       FileOpt.writeFile(Integer.toBinaryString(push)+" ");
                       System.out.println("写入:PUSH "+ Integer.toBinaryString(push));
                       break;
                   case "POP":
                       FileOpt.writeFile(Integer.toBinaryString(Instructions.INSTRUCTIONS.POP.getByteCode())+" ");
                       System.out.println("写入:POP "+ Integer.toBinaryString(Instructions.INSTRUCTIONS.POP.getByteCode()));
                       break;
                   case "DUP":
                       FileOpt.writeFile(Integer.toBinaryString(Instructions.INSTRUCTIONS.DUP.getByteCode())+" ");
                       System.out.println("写入:DUP "+ Integer.toBinaryString(Instructions.INSTRUCTIONS.DUP.getByteCode()));
                       break;
                   case "SWAP":
                       FileOpt.writeFile(Integer.toBinaryString(Instructions.INSTRUCTIONS.SWAP.getByteCode())+" ");
                       System.out.println("写入:SWAP "+ Integer.toBinaryString(Instructions.INSTRUCTIONS.SWAP.getByteCode()));
                       break;
                   case "HALT":
                       FileOpt.writeFile(Integer.toBinaryString(Instructions.INSTRUCTIONS.HALT.getByteCode())+" ");
                       System.out.println("写入:HALT "+ Integer.toBinaryString(Instructions.INSTRUCTIONS.HALT.getByteCode()));
                       break;
                   case "ADD":
                       FileOpt.writeFile(Integer.toBinaryString(Instructions.INSTRUCTIONS.ADD.getByteCode())+" ");
                       System.out.println("写入:ADD "+ Integer.toBinaryString(Instructions.INSTRUCTIONS.ADD.getByteCode()));
                       break;
                   case "SUB":
                       FileOpt.writeFile(Integer.toBinaryString(Instructions.INSTRUCTIONS.SUB.getByteCode())+" ");
                       System.out.println("写入:SUB "+ Integer.toBinaryString(Instructions.INSTRUCTIONS.SUB.getByteCode()));
                       break;
                   case "MUL":
                       FileOpt.writeFile(Integer.toBinaryString(Instructions.INSTRUCTIONS.MUL.getByteCode())+" ");
                       System.out.println("写入:MUL "+ Integer.toBinaryString(Instructions.INSTRUCTIONS.MUL.getByteCode()));
                       break;
                   case "DIV":
                       FileOpt.writeFile(Integer.toBinaryString(Instructions.INSTRUCTIONS.DIV.getByteCode())+" ");
                       System.out.println("写入:DIV "+ Integer.toBinaryString(Instructions.INSTRUCTIONS.DIV.getByteCode()));
                       break;
                       default : FileOpt.writeFile(Integer.toBinaryString(Integer.parseInt(strs[j]))+" ");
                           System.out.println("写入:数字 "+ strs[j] + "的2进制表示: " + Integer.toBinaryString(Integer.parseInt(strs[j])));
               }
           }
        }
    }
}

