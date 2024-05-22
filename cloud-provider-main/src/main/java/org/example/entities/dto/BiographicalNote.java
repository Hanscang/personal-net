package org.example.entities.dto;

import org.example.entities.Biographic.BiographicalBasicInfo;
import org.example.entities.Biographic.Experience;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @author huzq
 * @version V1.0
 * @package org.example.entities
 * @date 2024/5/13 22:50
 */
public class BiographicalNote {
    public BiographicalNote(BiographicalBasicInfo basicInfo, List<Experience> experiences) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd/");
        this.setId(basicInfo.getId());
        this.setName(basicInfo.getName());
        this.setBirthday(simpleDateFormat.format(basicInfo.getBirthday()));
        this.setEmail(basicInfo.getEmail());
        this.setUniversity(basicInfo.getUniversity());
        this.setGraduationDate(simpleDateFormat.format(basicInfo.getGraduationDate()));
        this.setSex(basicInfo.getSex());
        this.setsKill(basicInfo.getsKill());
        this.setExperiences(experiences);
    }

    private int id;
    private String name;
    private String birthday;
    private String email;
    private String university;
    private String graduationDate;
    private String sex;
    private String sKill;
    private List<Experience> experiences;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getsKill() {
        return sKill;
    }

    public void setsKill(String sKill) {
        this.sKill = sKill;
    }

    public List<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(List<Experience> experiences) {
        this.experiences = experiences;
    }
}
