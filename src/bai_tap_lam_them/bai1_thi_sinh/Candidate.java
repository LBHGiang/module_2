package bai_tap_lam_them.bai1_thi_sinh;

public class Candidate {
    private int code = 0;
    private String name = "";
    private String birthday;
    private double mathScore = 0;
    private double literatureScore = 0;
    private double englishScore = 0;

    //constructor
    public Candidate() {
    }

    public Candidate(String name, double mathScore, double literatureScore, double englishScore) {
        this.name = name;
        if (mathScore < 0 || mathScore > 10 || literatureScore < 0 || literatureScore > 10 || englishScore < 0 || englishScore > 10) {
            System.out.println("Invalid input value, Score must be >= 0 and <=10");
            return;
        }
        this.mathScore = mathScore;
        this.literatureScore = literatureScore;
        this.englishScore = englishScore;
    }

    //basic get set  method

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getMathScore() {
        return mathScore;
    }

    public void setMathScore(double mathScore) {
        if (mathScore < 0 || mathScore > 10) {
            System.out.println("Invalid input value, Score must be >= 0 and <=10");
            return;
        }
        this.mathScore = mathScore;
    }

    public double getLiteratureScore() {
        return literatureScore;
    }

    public void setLiteratureScore(double literatureScore) {
        if (literatureScore < 0 || literatureScore > 10) {
            System.out.println("Invalid input value, Score must be >= 0 and <=10");
            return;
        }
        this.literatureScore = literatureScore;
    }

    public double getEnglishScore() {
        return englishScore;
    }

    public void setEnglishScore(double englishScore) {
        if (englishScore < 0 || englishScore > 10) {
            System.out.println("Invalid input value, Score must be >= 0 and <=10");
            return;
        }
        this.englishScore = englishScore;
    }

    //get score
    public String getScore() {
        return "Candidate: " + this.name + " Math: " + this.mathScore + "Literature: "
                + this.literatureScore + "English: " + this.englishScore;
    }

    //get total score
    public double getTotalScore() {
        return this.mathScore + this.literatureScore + this.englishScore;
    }

    //set score
    public void set3Score(double mathScore, double literatureScore, double englishScore) {
        this.mathScore = mathScore;
        this.literatureScore = literatureScore;
        this.englishScore = englishScore;
    }

    @Override
    public String toString() {
        return "Candidate{" +
                "name='" + name + '\'' +
                ", mathScore=" + mathScore +
                ", literatureScore=" + literatureScore +
                ", englishScore=" + englishScore +
                ", totalScore=" + getTotalScore() +
                '}';
    }
}
