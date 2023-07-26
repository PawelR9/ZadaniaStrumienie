/*
Given a list of strings, return a list where each string has "y" added at its end, omitting any resulting strings that contain "yy" as a substring anywhere.


        noYY(["a", "b", "c"]) ? ["ay", "by", "cy"]
        noYY(["a", "b", "cy"]) ? ["ay", "by"]
        noYY(["xx", "ya", "zz"]) ? ["xxy", "yay", "zzy"]*/


import java.util.List;
import java.util.stream.Collectors;

public class Zadanie3 {

    public static void main(String[] args) {
        List<String> list1 = noYY(List.of("a", "b", "c"));
        System.out.println(list1);
        List<String> list2 = noYY(List.of("a", "b", "cy"));
        System.out.println(list2);
        List<String> list3 = noYY(List.of("xx", "ya", "zz"));
        System.out.println(list3);
    }

    public static List<String> noYY(List<String> strings) {
        return strings.stream().map(string -> string + "y").filter(string -> !string.contains("yy")).collect(Collectors.toList());
    }
}
