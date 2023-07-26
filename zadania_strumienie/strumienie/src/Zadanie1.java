/*
Given a list of strings, return a list where each string is replaced by 3 copies of
the string concatenated together.


        copies3(["a", "bb", "ccc"]) ? ["aaa", "bbbbbb", "ccccccccc"]
        copies3(["24", "a", ""]) ? ["242424", "aaa", ""]
        copies3(["hello", "there"]) ? ["hellohellohello", "theretherethere"]*/

import java.util.List;
import java.util.stream.Collectors;

public class Zadanie1 {
    public static void main(String[] args) {

        List<String> list1 = copies3(List.of("a", "bb", "ccc"));
        System.out.println(list1);
        List<String> list2 = copies3(List.of("24", "a", ""));
        System.out.println(list2);
        List<String> list3 = copies3(List.of("hello", "there"));
        System.out.println(list3);
    }

    public static List<String> copies3(List<String> strings) {
        return strings.stream().map(string -> string + string + string).collect(Collectors.toList());
    }
}