package Models;

public class Assignment {

    private String title;
    private String description;
    private String subDateTime;
    private float oralMark;
    private float totalMark;

    public Assignment(String title, String description, String subDateTime, float oralMark, float totalMark) {
        this.title = title;
        this.description = description;
        this.subDateTime = subDateTime;
        this.oralMark = oralMark;
        this.totalMark = totalMark;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubDateTime() {
        return subDateTime;
    }

    public void setSubDateTime(String subDateTime) {
        this.subDateTime = subDateTime;
    }

    public float getOralMark() {
        return oralMark;
    }

    public void setOralMark(float oralMark) {
        this.oralMark = oralMark;
    }

    public float getTotalMark() {
        return totalMark;
    }

    public void setTotalMark(float totalMark) {
        this.totalMark = totalMark;
    }

    @Override
    public String toString() {
        return "Assignment {" + "Title :" + title + ", Description :" + description + ", Submission Date :" + subDateTime + ", Oral Mark :" + oralMark + ", Total Mark :" + totalMark + '}';
    }

}
