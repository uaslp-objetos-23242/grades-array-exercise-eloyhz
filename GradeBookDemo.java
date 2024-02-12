// GradeBookTest creates a GradeBook object using an array of grades, 
// then invokes method processGrades to analyze them.
public class GradeBookDemo {
   public static void main(String[] args) {
      // array of student grades                                      
      int[] gradesArray = {87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
      
      GradeBook myGradeBook = new GradeBook(
         "223401 - Object Oriented Technology", gradesArray);
      System.out.printf("Welcome to the grade book for%n%s%n%n", 
         myGradeBook.getCourseName());
      myGradeBook.processGrades();
   } 
} 
