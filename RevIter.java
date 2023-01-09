public class RevIter extends StudentGroupIter {

    public RevIter (StudentGroup studentGroup) {
        super(studentGroup);
        index = studentGroup.groupSize() - 1;
    }

    public boolean hasNext() {
        return index > -1;
    }

    public Student next() {
        return studentGroup.nextStudent(index--);
    }

}