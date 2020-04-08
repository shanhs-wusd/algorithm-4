package cat10.cat12;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Out;

public class Cat {
    public static void main(String[] args) {
        //将所有输入文件复制到输出流(最后一个参数)
        Out out = new Out(args[args.length - 1]);
        for (int i = 0; i < args.length - 1; i++) {
            //将第i个输入文件复制到输出流中
            In in = new In(args[i]);
            String s = in.readAll();
            out.println(s);
            in.close();
        }
        out.close();
    }
}
/**
 * vim data/in1.txt
 * vim data/in2.txt
 * java cat10/cat12/Cat data/in1.txt data/in2.txt data/out.txt
 * vim data/out.txt
 */


