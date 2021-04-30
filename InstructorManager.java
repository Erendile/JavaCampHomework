
package day3hw;

public class InstructorManager extends UserManager {

    @Override
    public void removeCourse() {
        System.out.println("Kurs kaldırıldı.");
    }

    @Override
    public void addCourse() {
        System.out.println("Kurs oluşturuldu.");
    }
    
    public void updateCourse() {
        System.out.println("Kurs güncellendi.");
    }
    
}
