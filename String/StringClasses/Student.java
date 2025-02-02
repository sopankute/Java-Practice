package String.StringClasses;

import java.util.ArrayList;
import java.util.List;

public final class Student {

    private final int id;
    private final String name;
    private final List<String> frnds;

    public Student(int id, String name, List<String> frnds) {
        this.id = id;
        this.name = name;

        // Deep copy - creating new object
        // List<String> tempList = new ArrayList<>();
        // tempList.addAll(frnds);
        // this.frnds = tempList;

        this.frnds = new ArrayList<>(frnds);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<String> getFrnds() {
        return new ArrayList<>(frnds);
    }

    public String disp(){
        return "Student [id=" + id + ", name=" + name + ", frnds=" + frnds + "]";
    }

}
