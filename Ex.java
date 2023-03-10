import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Ex {
    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student("Дмитрий Зеленцов", 3.2f));
        list.add(new Student("Регина Рабе", 2f));
        list.add(new Student("Иван Иванов", 5f));
        list.add(new Student("Петр Петров", 4.9f));
        list.add(new Student("Конь Конев", 0.8f));

        StudentGroup studentGroup = new StudentGroup(list);

        System.out.println("\ngroupIterator: ");

        Iterator<Student> iterator = studentGroup.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("\nlistIterator UP: ");

        ListIterator<Student> listIterator = studentGroup.listIterator(1);
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println("\nlistIterator DOWN: ");

        ListIterator<Student> listIterator1 = studentGroup.listIterator(1);

        while (listIterator1.hasNext()) {
            System.out.println(listIterator1.next());
        }

        System.out.println("\nreversIterator: ");

        Iterator<Student> reverseIterator = studentGroup.reverseIterator();
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }
    }
}