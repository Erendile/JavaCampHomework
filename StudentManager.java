
package day3hw;

public class StudentManager extends UserManager {

    @Override
    public void addCourse() {
        System.out.println("Kurs alındı.");        
    }
    
    @Override
    public void removeCourse() {
        System.out.println("Kurstan ayrıldın.");
    }
}
