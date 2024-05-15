import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        List<Student1> li = Arrays.asList(
                new Student1(0, "Akash", 40000.78),
                new Student1(3, "Faraz", 53435.90),
                new Student1(2, "Khan", 534235.89),
                new Student1(5, "Alok", 56.89));

        List<Student1> li1 = Arrays.asList(
                new Student1(1, "rana", 45000.78),
                new Student1(6, "eavi", 5385.90),
                new Student1(9, "kobss", 53435.89),
                new Student1(7, "vijay", 5634.89));

        List<List<Student1>> StudenList = new ArrayList<>();
        StudenList.add(li1);
        StudenList.add(li);

        //use of flat map

       List<Student1> finalStudentList= StudenList.stream().flatMap(List::stream).toList();
    //    System.out.print(finalStudentList);

    // finalStudentList.forEach(n->System.out.println(n));


    //for List<List<Map<key,value>>> 

    List<List<Map<String,Object>>> listOfListOfMapOfStudents=new ArrayList<>();

    List<Map<String,Object>> listOfMapStudents=new ArrayList<>();

    Map<String,Object> student1=new HashMap<>();

    student1.put("1", new Student1(12, "Ravi", 76768.00));
    student1.put("2", new Student1(11, "shubam", 768.00));
    student1.put("3", new Student1(10, "arif", 99768.00));

    Map<String,Object> student2=new HashMap<>();

    student2.put("4", new Student1(13, "zabi", 78963.00));
    student2.put("5", new Student1(14, "alok", 33768.00));
    student2.put("6", new Student1(15, "arvind", 22768.00));

    Map<String,Object> student3=new HashMap<>();

    student3.put("7", new Student1(16, "shilender", 11963.00));
    student3.put("8", new Student1(17, "parv", 34568.00));
    student3.put("9", new Student1(18, "mishra", 267868.00));

    listOfMapStudents.add(student1);
    listOfMapStudents.add(student2);
    listOfMapStudents.add(student3);

    listOfListOfMapOfStudents.add(listOfMapStudents);

    List<Map<String,Object>> l11=listOfListOfMapOfStudents.stream().flatMap(List::stream).toList();

    l11.forEach(n->System.out.println(n));

    }

}
