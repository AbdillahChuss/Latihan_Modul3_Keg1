import java.util.Stack;
public class Main {
    public static void main(String[] args) {

        Lat1_Mod3 s = new Lat1_Mod3(5);


        s.push("bebek");
        s.push("ikan");
        s.push("tikus");

        System.out.println("Next : " + s.peek());
        s.push("burung");
        System.out.println(s.pop());
        s.push("buaya");

        int count = s.search("bebek");

        while (count != -1 && count > 1) {
            s.pop();
            count--;
        }
        System.out.println(s.pop());
        System.out.println(s.empty());
    }
}
