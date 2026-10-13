import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {

        //Create StudyTacker Object
        StudyTracker pending_tasks = new StudyTracker();

        //Create StudyTask object
        StudyTask firstTask = new StudyTask(1, "Revise Java", "CS308", LocalDate.of(2026, 10, 12));
        StudyTask secondTask = new StudyTask(2, "Apply for an internship", "CS415", LocalDate.of(2026, 10, 13));
        System.out.println(firstTask.getTaskName());
        //Next steps: only allow unique taskID's for each task

        //Testing StudyTracker methods
        pending_tasks.addTask(firstTask);
        pending_tasks.viewTasks();
        pending_tasks.addTask(secondTask);
        pending_tasks.viewTasks();
        pending_tasks.markComplete(0);
        pending_tasks.markComplete(1);
        pending_tasks.removeTask(2);
        pending_tasks.viewTasks();


    }
}