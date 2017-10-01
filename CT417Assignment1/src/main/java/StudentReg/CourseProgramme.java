package StudentReg;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.joda.time.*;

public class CourseProgramme {

    String courseName;
    ArrayList modList = new ArrayList<Module>();
    DateTime startDate;
    DateTime endDate;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public CourseProgramme(String name, String start, String end){
        this.courseName = name;
        try {
            Date temp = sdf.parse(start);
            this.startDate = new DateTime(temp);
            temp = sdf.parse(end);
            this.endDate = new DateTime(temp);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public void setEndDate(String end) {
        try {
            Date temp = sdf.parse(end);
            this.endDate = new DateTime(temp);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public void setStartDate(String start) {
        try {
            Date temp = sdf.parse(start);
            this.endDate = new DateTime(temp);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void addModule(Module module) {
        if (modList.contains(module)) {
            System.out.println("Module already added.");
        } else {
            modList.add(module);
        }
    }

    public void removeModule(Student student) {
        if (modList.contains(student)) {
            modList.remove(student);
        } else {
            System.out.println("Module not registered.");
        }
    }

    public ArrayList getModList() {
        return modList;
    }
}
