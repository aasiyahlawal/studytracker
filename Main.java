import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        StudyTask firstTask = new StudyTask(1, "Revise Java", "CS308", LocalDate.of(2026, 10, 12));
        System.out.println(firstTask.getTaskName());
        firstTask.markCompleted();
        System.out.println();
        firstTask.displayTask();
    }
}