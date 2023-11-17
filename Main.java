
// Marvish Chandra
// Attendance Management Program


public class Admin {
    public static void Admin(String[] adminName, String[] adminStatus,String[] data, int timeEntered, int timeLeft) {
        int stayedSchool = timeLeft - timeEntered;
        if (stayedSchool < 5){
            System.out.println("The" + adminName + "with the role of," + adminStatus + ",has not stayed long enough in school to take care of the students.");
            if (stayedSchool > 5){
                System.out.println(("The") + adminName + "with the role of," + adminStatus + ",has stayed long enough in school to take care of the students.");
            }
            else{
                System.out.println("The administrator has been in school today to input a login and logout time entry.");
            }
    }
}

public class Student{
    public static void Student(String[] studentName, String[] studentStatus, int timeEntered, int timeLeft) {
    int studentSchool = timeLeft - timeEntered;
        if (studentSchool < 5){
            System.out.println("The" + studentName + "with the status of," + studentStatus + ",has not stayed long enough in school.");
            if (studentSchool > 5){
                System.out.println(("The") + studentName + "with the role of," + studentStatus + ",has stayed long enough in school to take care of the students.");
            }
            else{
                System.out.println("The student has been in school today to input an entry and leave point based on the school's schedule.");
            } }
    }
}

public class Faculty{
    public static void Faculty(String[] facultyName, int timeEntered, int timeLeft) {
        int facultyEdu = timeLeft - timeEntered;
        if (facultyEdu < 4){
            System.out.println(("The") + facultyName + ",has not stayed long enough in school.");
        }
        if (facultyEdu > 4) {
            System.out.println(("The") + facultyName + "is serving more than " + facultyEdu + "four hours of their shift at school." );
        }
        else {
            System.out.println("The faculty education member attended school to work their time there.");
        }
    }
}