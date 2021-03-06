package es.ubu.lsi.model;

import java.util.List;

public class Assignment extends MoodleObject {
    private long cmid;
    private int nosubmissions;
    private int submissiondrafts;
    private int sendnotifications;
    private int sendlatenotifications;
    private int sendstudentnotifications;
    private long duedate;
    private long allowsubmissionsfromdate;
    private int grade;
    private int completionsubmit;
    private long cutoffdate;
    private long gradingduedate;
    private int teamsubmission;
    private int requireallteammemberssubmit;
    private int teamsubmissiongroupingid;
    private int blindmarking;
    private int hidegrader;
    private int revealidentities;
    private String attemptreopenmethod;
    private int maxattempts;
    private int markingworkflow;
    private int markingallocation;
    private int requiresubmissionstatement;
    private int preventsubmissionnotingroup;
    private List<Config> configs;
    private List<Introattachment> introattachments;
    private String submissionstatement;
    private int submissionstatementformat;
    private List<Grade> grades;


    public long getCmid() {
        return cmid;
    }

    public void setCmid(long cmid) {
        this.cmid = cmid;
    }

    public int getNosubmissions() {
        return nosubmissions;
    }

    public void setNosubmissions(int nosubmissions) {
        this.nosubmissions = nosubmissions;
    }

    public int getSubmissiondrafts() {
        return submissiondrafts;
    }

    public void setSubmissiondrafts(int submissiondrafts) {
        this.submissiondrafts = submissiondrafts;
    }

    public int getSendnotifications() {
        return sendnotifications;
    }

    public void setSendnotifications(int sendnotifications) {
        this.sendnotifications = sendnotifications;
    }

    public int getSendlatenotifications() {
        return sendlatenotifications;
    }

    public void setSendlatenotifications(int sendlatenotifications) {
        this.sendlatenotifications = sendlatenotifications;
    }

    public int getSendstudentnotifications() {
        return sendstudentnotifications;
    }

    public void setSendstudentnotifications(int sendstudentnotifications) {
        this.sendstudentnotifications = sendstudentnotifications;
    }

    public long getDuedate() {
        return duedate;
    }

    public void setDuedate(long duedate) {
        this.duedate = duedate;
    }

    public long getAllowsubmissionsfromdate() {
        return allowsubmissionsfromdate;
    }

    public void setAllowsubmissionsfromdate(long allowsubmissionsfromdate) {
        this.allowsubmissionsfromdate = allowsubmissionsfromdate;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getCompletionsubmit() {
        return completionsubmit;
    }

    public void setCompletionsubmit(int completionsubmit) {
        this.completionsubmit = completionsubmit;
    }

    public long getCutoffdate() {
        return cutoffdate;
    }

    public void setCutoffdate(long cutoffdate) {
        this.cutoffdate = cutoffdate;
    }

    public long getGradingduedate() {
        return gradingduedate;
    }

    public void setGradingduedate(long gradingduedate) {
        this.gradingduedate = gradingduedate;
    }

    public int getTeamsubmission() {
        return teamsubmission;
    }

    public void setTeamsubmission(int teamsubmission) {
        this.teamsubmission = teamsubmission;
    }

    public int getRequireallteammemberssubmit() {
        return requireallteammemberssubmit;
    }

    public void setRequireallteammemberssubmit(int requireallteammemberssubmit) {
        this.requireallteammemberssubmit = requireallteammemberssubmit;
    }

    public int getTeamsubmissiongroupingid() {
        return teamsubmissiongroupingid;
    }

    public void setTeamsubmissiongroupingid(int teamsubmissiongroupingid) {
        this.teamsubmissiongroupingid = teamsubmissiongroupingid;
    }

    public int getBlindmarking() {
        return blindmarking;
    }

    public void setBlindmarking(int blindmarking) {
        this.blindmarking = blindmarking;
    }

    public int getHidegrader() {
        return hidegrader;
    }

    public void setHidegrader(int hidegrader) {
        this.hidegrader = hidegrader;
    }

    public int getRevealidentities() {
        return revealidentities;
    }

    public void setRevealidentities(int revealidentities) {
        this.revealidentities = revealidentities;
    }

    public String getAttemptreopenmethod() {
        return attemptreopenmethod;
    }

    public void setAttemptreopenmethod(String attemptreopenmethod) {
        this.attemptreopenmethod = attemptreopenmethod;
    }

    public int getMaxattempts() {
        return maxattempts;
    }

    public void setMaxattempts(int maxattempts) {
        this.maxattempts = maxattempts;
    }

    public int getMarkingworkflow() {
        return markingworkflow;
    }

    public void setMarkingworkflow(int markingworkflow) {
        this.markingworkflow = markingworkflow;
    }

    public int getMarkingallocation() {
        return markingallocation;
    }

    public void setMarkingallocation(int markingallocation) {
        this.markingallocation = markingallocation;
    }

    public int getRequiresubmissionstatement() {
        return requiresubmissionstatement;
    }

    public void setRequiresubmissionstatement(int requiresubmissionstatement) {
        this.requiresubmissionstatement = requiresubmissionstatement;
    }

    public int getPreventsubmissionnotingroup() {
        return preventsubmissionnotingroup;
    }

    public void setPreventsubmissionnotingroup(int preventsubmissionnotingroup) {
        this.preventsubmissionnotingroup = preventsubmissionnotingroup;
    }

    public List<Config> getConfigs() {
        return configs;
    }

    public void setConfigs(List<Config> configs) {
        this.configs = configs;
    }

    public List<Introattachment> getIntroattachments() {
        return introattachments;
    }

    public void setIntroattachments(List<Introattachment> introattachments) {
        this.introattachments = introattachments;
    }

    public String getSubmissionstatement() {
        return submissionstatement;
    }

    public void setSubmissionstatement(String submissionstatement) {
        this.submissionstatement = submissionstatement;
    }

    public int getSubmissionstatementformat() {
        return submissionstatementformat;
    }

    public void setSubmissionstatementformat(int submissionstatementformat) {
        this.submissionstatementformat = submissionstatementformat;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    public void setGrades(List<Grade> grades) {
        this.grades = grades;
    }
}
