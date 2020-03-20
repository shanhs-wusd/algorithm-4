package cat10;

import com.alibaba.fastjson.JSON;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdOut;

import java.util.List;

public class SqlDeal {
    public static void main(String[] args) {
        String outPut = "";
        String[] phonesJson = In.readStrings(args[0]);
        String phonesResult = "";
        for (String s : phonesJson) {
            phonesResult += s;
        }
        List<Phone> phones = JSON.parseArray(phonesResult, Phone.class);
        for (Phone phone : phones) {
            outPut += "'" + phone.getPhone() + "',";
        }
        StdOut.println(outPut);
    }
}
