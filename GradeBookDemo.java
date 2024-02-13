// GradeBookTest creates a GradeBook object using an array of grades, 
// then invokes method processGrades to analyze them.
public class GradeBookDemo {
   public static void main(String[] args) {
      // array of student grades                                      
      int[] gradesArray = new int[args.length];

      int index = 0;
      for (String s : args) {
         int grade = Integer.parseInt(s);
         gradesArray[index++] = grade;
      }
      
      GradeBook myGradeBook = new GradeBook(
         "223401 - Object Oriented Technology", gradesArray);
      System.out.printf("Welcome to the grade book for%n%s%n%n", 
         myGradeBook.getCourseName());
      myGradeBook.processGrades();
   } 
} 
