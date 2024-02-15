public class Student
{
    private String name;
    private int grade;

    public Student(String name, int grade)
    {
        this.name = name;
        this.grade = grade;
    }

    public String getName()
    {
        return this.name;
    }

    public int getGrade()
    {
        return this.grade;
    }

    public void setName(String newName)
    {
        if (newName != "") {
            this.name = newName;
        }
    }

    public void setGrade(int newGrade)
    {
        if (newGrade >= 0 && newGrade <= 100)  {
            this.grade = newGrade;
        }
    }
}
