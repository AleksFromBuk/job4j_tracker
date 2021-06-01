package ru.job4j.pojo;

import java.util.Date;

public class Student {
    private String nameSurname;
    private String group;
    private Date dateOfAdmission;

    public String getFIO() {
        return nameSurname;
    }

    public void setFIO(String str) {
        this.nameSurname = str;
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
