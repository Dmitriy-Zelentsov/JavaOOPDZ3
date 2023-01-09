import java.util.Iterator;

public class StudentGroupIter implements Iterator<Student> {

    int index = 0;
    StudentGroup studentGroup;

    public StudentGroupIter (StudentGroup studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public boolean hasNext() {
        return index < studentGroup.groupSize();
    }

    @Override
    public Student next() {
        return studentGroup.nextStudent(index++);
    }
}
