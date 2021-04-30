
package day3hw;

public class Day3HW {

    public static void main(String[] args) {
        String[] certificates = {"MCT", "PMP", "ITIL"};
        
        Student student = new Student();
        Instructor instructor = new Instructor();
        
        StudentManager studentManager = new StudentManager();
        InstructorManager instructorManager = new InstructorManager();
        
        instructor.setId(1);
        instructor.setName("Engin");
        instructor.setLastName("Demiroğ");
        instructor.setCertificates(certificates);
        instructor.setNumberOfCourses(3);
        
        student.setId(1);
        student.setName("Eren");
        student.setLastName("Dile");
        student.setNumberOfCourses(1);
        
        studentManager.addCourse();
        instructorManager.addCourse();
        instructorManager.updateCourse();
        
        
    }
    
}
