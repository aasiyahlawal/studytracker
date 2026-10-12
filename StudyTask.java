import java.time.LocalDate; //import the LocalDate class
import java.util.Scanner;

public class StudyTask {
    int taskID;
    String taskName;
    String subject;
    LocalDate dueDate;
    boolean isCompleted;

    public StudyTask(int taskID, String taskName, String subject, LocalDate dueDate){
       this.taskID = taskID;
       this.taskName = taskName;
       this.subject = subject;
       this.dueDate = dueDate;
       this.isCompleted = false;
    }

    public String getTaskName(){
        return taskName;
    }

    public String getSubject(){
        return subject;
    }

    public void changeTaskName(String taskName){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the new name for your task: ");

        String newtaskName = scanner.nextLine();
        this.taskName = newtaskName;
        System.out.println("Your new task name is: " + taskName);
        scanner.close();
    }

    public void markCompleted(){
        isCompleted = true;
    }

    public boolean istaskCompleted(){
        return isCompleted;
    }

    public void setNewDuedate(LocalDate dueDate){
        //Scanner scanner = new 
    }

    public void displayTask(){
        System.out.println("The task name is " + taskName);
        System.out.println("The subject is " + subject);
        System.out.println("The due date is " + dueDate);
        if (isCompleted == true){
            System.out.println(taskName + " has been completed");
        }
        else {
            System.out.println(taskName + " has not been completed");
        }
        

    }

}
