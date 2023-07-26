
import java.util.List;
import java.util.stream.Collectors;

/*Given a list of non-negative integers, return a list of those numbers multiplied by 2, omitting any of the resulting numbers that end in 2.


        two2([1, 2, 3]) ? [4, 6]
        two2([2, 6, 11]) ? [4]
        two2([0]) ? [0]*/
public class Zadanie4 {

    public static void main(String[] args) {
        List<Integer> list1 = two2(List.of(1, 2, 3));
        System.out.println(list1);
        List<Integer> list2 = two2(List.of(2, 6, 11));
        System.out.println(list2);
        List<Integer> list3 = two2(List.of(0));
        System.out.println(list3);

    }
    
    public static List<Integer> two2(List<Integer> nums) {
        return nums.stream().map(num -> num * 2).filter(num -> num % 10 != 2).collect(Collectors.toList());
    }
}
