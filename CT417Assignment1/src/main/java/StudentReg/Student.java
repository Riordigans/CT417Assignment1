package StudentReg;


import org.joda.time.*;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {
    String sName;
    int sAge;
    DateTime sDob;
    String sID;
    String username;
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Student (String name, String dob, String id) {
        this.sName = name;

        try {
            Date temp = sdf.parse(dob);
            this.sDob = new DateTime(temp);
            sAge = Years.yearsBetween(sDob, new DateTime()).getYears();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        this.sID = id;

    }

    public String getUsername() {

        if (username == null) {
            username = sName + sAge;
        }

        return (username);
    }

    public void setUsername(String newName) {
        this.username = newName;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public int getsAge() {
        return sAge;
    }

    public DateTime getsDob() {
        return sDob;
    }

    public void setsDob(DateTime sDob) {
        this.sDob = sDob;
    }

    public void setsDob(String dob) {
        try {
            Date temp = sdf.parse(dob);
            this.sDob = new DateTime(temp);
            sAge = Years.yearsBetween(sDob, new DateTime()).getYears();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public String getsID() {
        return sID;
    }

    public void setsID(String sID) {
        this.sID = sID;
    }
}
