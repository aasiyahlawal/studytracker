import java.util.ArrayList; //Import the Arrayuist class

//Possible methods
//addTask() stores a new studyTask in the collection
//viewTasks() view ALL stored tasks 
//findTask() locates a task using its ID
//markComplete() find the selected task and update its status
//removeTask() deletes a selected task from the collection
//calculateProgress() count completed and outstanding tasks

public class StudyTracker {
    ArrayList<StudyTask> tasks = new ArrayList<StudyTask>();

    public StudyTracker() {
        //constructor
    }

    public void addTask(StudyTask taskName) {
        tasks.add(taskName);
    }

    public void viewTasks(){
        System.out.println(tasks);
    }

}