class Course {
    String courseName;
    int duration;

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
}

public class EducationalCourseHierarchy {
    public static void main(String[] args) {
        PaidOnlineCourse course = new PaidOnlineCourse("Java Basics", 30, "Udemy", true, 5000, 500);
        System.out.println("Course: " + course.courseName + ", Platform: " + course.platform);
        System.out.println("Fee: " + course.fee + ", Discount: " + course.discount);
    }
}
