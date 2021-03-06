package es.ubu.lsi.model;

import java.util.List;

public class Course {
    private long id;
    private String fullname;
    private String shortname;
    private String idnumber;
    private String summary;
    private int summaryformat;
    private long startdate;
    private long enddate;
    private Boolean visible;
    private Boolean showactivitydates;
    private Boolean showcompletionconditions;
    private String fullnamedisplay;
    private String viewurl;
    private String courseimage;
    private int progress;
    private Boolean hasprogress;
    private Boolean isfavourite;
    private Boolean hidden;
    private Boolean showshortname;
    private String coursecategory;
    private long timemodified;
    private List<Assignment> assignments;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getShortname() {
        return shortname;
    }

    public void setShortname(String shortname) {
        this.shortname = shortname;
    }

    public String getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(String idnumber) {
        this.idnumber = idnumber;
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

    public long getStartdate() {
        return startdate;
    }

    public void setStartdate(long startdate) {
        this.startdate = startdate;
    }

    public long getEnddate() {
        return enddate;
    }

    public void setEnddate(long enddate) {
        this.enddate = enddate;
    }

    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public Boolean getShowactivitydates() {
        return showactivitydates;
    }

    public void setShowactivitydates(Boolean showactivitydates) {
        this.showactivitydates = showactivitydates;
    }

    public Boolean getShowcompletionconditions() {
        return showcompletionconditions;
    }

    public void setShowcompletionconditions(Boolean showcompletionconditions) {
        this.showcompletionconditions = showcompletionconditions;
    }

    public String getFullnamedisplay() {
        return fullnamedisplay;
    }

    public void setFullnamedisplay(String fullnamedisplay) {
        this.fullnamedisplay = fullnamedisplay;
    }

    public String getViewurl() {
        return viewurl;
    }

    public void setViewurl(String viewurl) {
        this.viewurl = viewurl;
    }

    public String getCourseimage() {
        return courseimage;
    }

    public void setCourseimage(String courseimage) {
        this.courseimage = courseimage;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public Boolean getHasprogress() {
        return hasprogress;
    }

    public void setHasprogress(Boolean hasprogress) {
        this.hasprogress = hasprogress;
    }

    public Boolean getIsfavourite() {
        return isfavourite;
    }

    public void setIsfavourite(Boolean isfavourite) {
        this.isfavourite = isfavourite;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Boolean getShowshortname() {
        return showshortname;
    }

    public void setShowshortname(Boolean showshortname) {
        this.showshortname = showshortname;
    }

    public String getCoursecategory() {
        return coursecategory;
    }

    public void setCoursecategory(String coursecategory) {
        this.coursecategory = coursecategory;
    }

    public long getTimemodified() {
        return timemodified;
    }

    public void setTimemodified(long timemodified) {
        this.timemodified = timemodified;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }
}
