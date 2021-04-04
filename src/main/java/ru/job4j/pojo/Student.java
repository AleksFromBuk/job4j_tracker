package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String NameSurname;
    private String group;
    private Date dateOfAdmission;

    public String getFIO() {
        return NameSurname;
    }

    public void setFIO(String str) {
        this.NameSurname = str;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public Date getDateOfAdmission() {
        return dateOfAdmission;
    }

    public void setDateOfAdmission(Date dateOfAdmission) {
        this.dateOfAdmission = dateOfAdmission;
    }
}
