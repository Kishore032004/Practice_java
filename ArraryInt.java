import java.util.*;
public class ArraryInt{
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++)
        a.add(i);

        System.out.println(a);
        a.remove(5);
        System.out.println(a);

        for (int i = 0; i < a.size(); i++)
		System.out.print(a.get(i) + " ");
    }
}