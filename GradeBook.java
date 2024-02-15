// GradeBook class using an array to store test grades.

public class GradeBook {
   private String courseName; // name of course this GradeBook represents
   private Student[] students; // array of students
   
   // constructor
   public GradeBook(String courseName, Student[] students) {
      this.courseName = courseName; 
      this.students = students; 
   } 

   // method to set the course name
   public void setCourseName(String courseName) {
      this.courseName = courseName; 
   } 

   // method to retrieve the course name
   public String getCourseName() {
      return courseName;
   } 

   // perform various operations on the data
   public void processGrades() {
      // output grades array
      outputGrades();

      // call method getAverage to calculate the average grade      
      System.out.printf("%nClass average is %.2f%n", getAverage()); 

      // call methods getMinimum and getMaximum
      System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",
         getMinimum(), getMaximum());

      // call outputBarChart to print grade distribution chart
      outputBarChart();
   } 

   // find minimum grade
   public int getMinimum() {
      int lowGrade = students[0].getGrade(); // assume grades[0] is smallest

      // loop through grades array                             
      for (Student student : students) {                               
         // if grade lower than lowGrade, assign it to lowGrade
         if (student.getGrade() < lowGrade) {                               
            lowGrade = student.getGrade(); // new lowest grade              
         }                      
      }                                                     

      return lowGrade;
   } 

   // find maximum grade
   public int getMaximum() {
      int highGrade = students[0].getGrade(); // assume grades[0] is largest

      // loop through grades array                                 
      for (Student student : students) {                                  
         // if grade greater than highGrade, assign it to highGrade
         if (student.getGrade() > highGrade) {
            highGrade = student.getGrade(); // new highest grade
         } 
      } 

      return highGrade; 
   } 

   // determine average grade for test
   public double getAverage() {
      int total = 0;
 
      // sum grades for one student
      for (Student student : students) {   
         total += student.getGrade();           
      }                            

      // return average of grades
      return (double) total / students.length;
   } 

   // output bar chart displaying grade distribution
   public void outputBarChart() {
      System.out.println("Grade distribution:");

      // stores frequency of grades in each range of 10 grades
      int[] frequency = new int[11];
      
      // for each grade, increment the appropriate frequency
      for (Student student : students) {                            
         ++frequency[student.getGrade() / 10];                           
      }                                                     

      // for each grade frequency, print bar in chart
      for (int count = 0; count < frequency.length; count++) {
         // output bar label ("00-09: ", ..., "90-99: ", "100: ")
         if (count == 10) {
            System.out.printf("%5d: ", 100); 
         } 
         else {
            System.out.printf("%02d-%02d: ", count * 10, count * 10 + 9);
         } 
         
         // print bar of asterisks
         for (int stars = 0; stars < frequency[count]; stars++) {
            System.out.print("*");
         } 

         System.out.println(); 
      } 
   } 

   // output the contents of the grades array
   public void outputGrades() {
      System.out.printf("The grades are:%n%n");

      // output each student's name & grade                             
      for (int student = 0; student < students.length; student++) {
         System.out.printf("Student %2d: name = %s, grade = %3d%n",                 
            student + 1, students[student].getName(), students[student].getGrade());                       
      }                                                          
   } 
} 