// GradeBookTest creates a GradeBook object using an array of grades, 
// then invokes method processGrades to analyze them.
public class GradeBookDemo {
   public static void main(String[] args) {
      // array of students                                      
      Student[] studentsGrades = {
         new Student("Luis", 90),
         new Student("Pedro", 100),
         new Student("Diego", 80)
      };
      
      GradeBook myGradeBook = new GradeBook(
         "223401 - Object Oriented Technology", studentsGrades);
      System.out.printf("Welcome to the grade book for%n%s%n%n", 
         myGradeBook.getCourseName());
      myGradeBook.processGrades();
   } 
} 
