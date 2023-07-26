import java.util.List;
import java.util.stream.Collectors;

/*
Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)


        rightDigit([1, 22, 93]) ? [1, 2, 3]
        rightDigit([16, 8, 886, 8, 1]) ? [6, 8, 6, 8, 1]
        rightDigit([10, 0]) ? [0, 0]*/
public class Zadanie2 {
    public static void main(String[] args) {
        List<Integer> list1 = rightDigit(List.of(1, 22, 93));
        System.out.println(list1);
        List<Integer> list2 = rightDigit(List.of(16, 8, 886, 8, 1));
        System.out.println(list2);
        List<Integer> list3 = rightDigit(List.of(10, 0));
        System.out.println(list3);
    }

    public static List<Integer> rightDigit(List<Integer> nums) {
        return nums.stream().map(num -> num % 10).collect(Collectors.toList());
    }
}
