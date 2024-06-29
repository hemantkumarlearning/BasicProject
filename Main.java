import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer> (Arrays.asList(1,2,1,45,5,8,9));
        System.out.println(list);
        System.out.println(list.subList(2,4));

    }
}