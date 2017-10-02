package StudentReg;

import java.util.ArrayList;

public class Module {

    String modName;
    String modID;
    ArrayList studentList = new ArrayList<Student>();

    public Module(String name, String id) {
        this.modName = name;
        this.modID = id;
    }


    public void addStudent(Student student) {
        if (studentList.contains(student)) {
            System.out.println("Student already registered.");
        } else {
            studentList.add(student);
        }
    }

    public void removeStudent(Student student) {
        if (studentList.contains(student)) {
            studentList.remove(student);
        } else {
            System.out.println("Student not registered.");
        }
    }

    public ArrayList getStudentList() {
        return studentList;
    }

    public String getModID() {
        return modID;
    }

    public void setModID(String modID) {
        this.modID = modID;
    }

    public String getModName() {
        return modName;
    }

    public void setModName(String modName) {
        this.modName = modName;
    }
}
