class Student {
    String name;
    int[] marks;

    public Student(String name, int numSubjects) {
        this.name = name;
        marks = new int[numSubjects];
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    public double getPercentage() {
        int total = 0;
        for (int m : marks) total += m;
        return (double) total / marks.length;
    }

    public void displayResult() {
        double percentage = getPercentage();
        System.out.println("Student: " + name);
        System.out.println("Percentage: " + percentage + "%");
    }
}
