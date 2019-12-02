import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ss=s.toCharArray() ;
        List<Character> list=new ArrayList<>();
       list.add(ss[0]);
       for(int i=0;i<ss.length;i++){
           if(!list.contains(ss[i]) ){
               list.add(ss[i]);
           }
       }

        for(int k=0;k<list.size();k++){
            System.out.print(list.get(k));
        }
        }

    }

