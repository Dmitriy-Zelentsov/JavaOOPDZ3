import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class StudentGroup {

    private List<Student> list;

    public StudentGroup(List<Student> list) {
        this.list = list;
    }

    public Iterator<Student> iterator() {
        return new StudentGroupIter(this);
    }

    public ListIterator<Student> listIterator(int position) {
        return new StudentGroupListIter(this, position);
    }

    public Iterator<Student> reverseIterator() {
        return new RevIter(this);
    }

    public int groupSize() {
        return list.size();
    }

    public Student nextStudent(int index) {
        return list.get(index);
    }
}