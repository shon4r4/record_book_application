package com.company;

public class RecordBook {
    private int Grade1;
    private int Grade2;
    private int Grade3;


    public RecordBook(int Grade1, int Grade2, int Grade3) {
        this.Grade1 = Grade1;
        this.Grade2 = Grade2;
        this.Grade3 = Grade3;

    }

    public String allGrades() {
        return this.Grade1 + " " + this.Grade2 + " " + this.Grade3;
    }

    public int averageGrade() {

        return (this.Grade1 + this.Grade2 + this.Grade3) / 3;
    }

    public int lowestGrade() {
        return Math.min(Math.min(this.Grade1, this.Grade2), this.Grade3);
    }

    public int highestGrade() {
        return Math.max(Math.max(this.Grade1, this.Grade2),this.Grade3);
    }
}