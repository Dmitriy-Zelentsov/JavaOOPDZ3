import java.util.ListIterator;

public class StudentGroupListIter extends StudentGroupIter implements ListIterator<Student> {


    public StudentGroupListIter (StudentGroup studentGroup, int current) {
        super(studentGroup);
        index = current;
    }

    @Override
    public boolean hasPrevious() {
        return index > -1;
    }

    @Override
    public Student previous() {
        return studentGroup.nextStudent(index--);
    }

    @Override
    public int nextIndex() {
        return index;
    }

    @Override
    public int previousIndex() {
        return index - 1;
    }

    @Override
    public void remove() {

    }

    @Override
    public void set(Student student) {

    }

    @Override
    public void add(Student student) {

    }
}