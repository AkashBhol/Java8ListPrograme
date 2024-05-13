
package Demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Student> li = new ArrayList<>();
        li.add(new Student(1, "akash", 8000.90f));
        li.add(new Student(4, "prakasha", 800000.90f));
        li.add(new Student(3, "bikasha", 8900.90f));
        li.add(new Student(2, "alok", 98600.90f));
        li.add(new Student(8, "bijay", 7800.90f));

        forEach it is internally using consumer
        li.stream().forEach(p->
        System.out.println(p)
        );

        // filter
        // i want all the records whose sal is morethen 8000
        li= li.stream().filter(p->(double) p.getSal()>=8000).toList();
        li.forEach(System.out::println);//::->method reference

        // sorted
        // based on id
        li=li.stream().sorted((e1,e2)->(int) e1.getId()-e2.getId()).toList();
        li.stream().forEach(p->System.out.println(p));

        // sorted based on sal
        // on doubl value
        li=li.stream().sorted((e1,e2)->
        Float.compare(e1.getSal(),e2.getSal())).toList();
        li.stream().forEach(p->System.out.println(p));

        // sort and find the secnd heightest sal
        li=li.stream().sorted((e1,e2)->Float.compare(e2.getSal(),
        e1.getSal())).skip(1).limit(1).toList();
        li.stream().forEach(p->System.out.println(p));
        ArrayList<String> li2=new ArrayList<>();
        // li.stream().map(p->p.getName()).forEach(p->System.out.println(p));

        // find the sal in range

        li.stream().filter(p -> {
            if (p.getSal() >= 10000 && p.getSal() <= 1000000) {
                return true;
            }
            return false;
        })
                .map(r -> r.getSal())
                .collect(Collectors.toList());
    }
}
