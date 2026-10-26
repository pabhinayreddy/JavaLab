import java.util.*;
class Student {
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
    public String toString() {
        return name + "-" + marks;
    }
}
public class B3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "Java", "C", "Python", "Java", "C",
                "Python", "HTML", "Java", "C", "HTML");
        Set<String> hashSet = new HashSet<>(list);
        Set<String> linkedHashSet = new LinkedHashSet<>(list);
        Set<String> treeSet = new TreeSet<>(list);
        System.out.println("HashSet: " + hashSet);
        System.out.println("LinkedHashSet: " + linkedHashSet);
        System.out.println("TreeSet: " + treeSet);
        Set<String> duplicates = new HashSet<>();
        Set<String> unique = new HashSet<>();
        for (String item : list) {
            if (!unique.add(item)) {
                duplicates.add(item);
            }
        }
        System.out.println("Duplicates: " + duplicates);
        Set<Integer> a = new HashSet<>(
                Arrays.asList(2, 4, 6, 8, 10));
        Set<Integer> b = new HashSet<>(
                Arrays.asList(4, 8, 12));
        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Difference A-B: " + difference);
        TreeSet<String> names = new TreeSet<>(
                Arrays.asList("Ravi", "Anil", "Sita", "Bala"));
        System.out.println("Ascending Names: " + names);
        System.out.println("Descending Names: " + names.descendingSet());
        Comparator<Student> studentComparator =
                Comparator.comparingInt((Student s) -> s.marks)
                        .thenComparing(s -> s.name);
        TreeSet<Student> students = new TreeSet<>(studentComparator);
        students.add(new Student("Ravi", 85));
        students.add(new Student("Anil", 92));
        students.add(new Student("Sita", 78));
        students.add(new Student("Bala", 85));
        System.out.println("Students Sorted by Marks:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}