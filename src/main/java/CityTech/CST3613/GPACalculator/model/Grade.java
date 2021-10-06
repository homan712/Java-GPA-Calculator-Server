package CityTech.CST3613.GPACalculator.model;

public class Grade extends Object{
    private String letterGrade;
    private float gpa;
    private String description;
    private float score;

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    public Grade() {

    }

    public Grade(String letterGrade, float gpa, String description, float score) {
        this.letterGrade = letterGrade;
        this.gpa = gpa;
        this.description = description;
        this.score = score;
    }

    public Grade(String letterGrade, float gpa, String description) {
        this.letterGrade = letterGrade;
        this.gpa = gpa;
        this.description = description;
    }

    public String getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(String letterGrade) {
        this.letterGrade = letterGrade;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "letterGrade='" + letterGrade + '\'' +
                ", gpa=" + gpa +
                ", description='" + description + '\'' +
                ", score=" + score +
                '}';
    }
}
