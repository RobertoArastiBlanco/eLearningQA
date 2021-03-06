package es.ubu.lsi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Section{
    private int id;
    private String name;
    private int visible;
    private String summary;
    private int summaryformat;
    @JsonProperty("section")
    private int sectionNumber;
    private int hiddenbynumsections;
    private boolean uservisible;
    private List<Module> modules;


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

    public int getVisible() {
        return visible;
    }

    public void setVisible(int visible) {
        this.visible = visible;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getSummaryformat() {
        return summaryformat;
    }

    public void setSummaryformat(int summaryformat) {
        this.summaryformat = summaryformat;
    }

    public int getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(int sectionNumber) {
        this.sectionNumber = sectionNumber;
    }

    public int getHiddenbynumsections() {
        return hiddenbynumsections;
    }

    public void setHiddenbynumsections(int hiddenbynumsections) {
        this.hiddenbynumsections = hiddenbynumsections;
    }

    public boolean isUservisible() {
        return uservisible;
    }

    public void setUservisible(boolean uservisible) {
        this.uservisible = uservisible;
    }

    public List<Module> getModules() {
        return modules;
    }

    public void setModules(List<Module> modules) {
        this.modules = modules;
    }
}