

import java.util.Objects;

public class Student implements Comparable<Student> {
    String name;
    double cgpa;

    public Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cgpa);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Student student = (Student) obj;
        return Double.compare(cgpa, student.cgpa)==0 && Objects.equals(name, student.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.cgpa, this.cgpa);
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", cgpa=" + cgpa + "]";
    }

}
