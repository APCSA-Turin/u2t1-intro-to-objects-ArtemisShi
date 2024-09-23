public class student {
 
    private String name;
    private int IDnum;

public student (String studentName, int studentIDnum) {
name = studentName;
IDnum = studentIDnum;
}

public void card(){
System.out.println("---------------------------");
System.out.println("Student Name: " +name);
System.out.println("ID Number: " + IDnum);
System.out.println("---------------------------");
}
}
