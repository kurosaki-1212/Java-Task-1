import java.util.*;
public class M9_8 {
    static void aaa(Map<String,String>a){
        for (int i=0;i<a.length;i++){
            System.out.println(a.get(i)+":"+a.get());
        }
        
    }
    public static void main(String[] args) {
        Map<String,String>v=new HashMap<>();
        v.put("赤","red");
        v.put("白","white");
        v.put("黒","black");
        v.put("青","blue");
        v.put("緑","green");
        aaa(v);



    }
}
