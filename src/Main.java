import java.util.Arrays;

public class Main {
    static Task[] toDoList = new Task[3];
    public static void reorder(int originalPosition, int newPosition){
        Task temp = toDoList[originalPosition];
        toDoList[originalPosition] = toDoList[newPosition];
        toDoList[newPosition] = temp;
    }
    public static void sort(int originalPosition, int newPosition){
        Task temp = toDoList[originalPosition];
        toDoList[originalPosition] = toDoList[newPosition];
        toDoList[newPosition] = temp;
    }

    public static void main(String[] args) {
        //Add tasks
        toDoList[0] = new Task("water my cat");
        toDoList[0].setComplexity(3);
        toDoList[0].setPriority(2);
        toDoList[1] = new Task("cook my clothes");
        toDoList[1].setComplexity(2);
        toDoList[1].setPriority(2);
        toDoList[2] = new Task("clean my soap");
        toDoList[2].setComplexity(10);
        toDoList[2].setPriority(1);
        //Sort
        //if(toDoList[0].getPriority < todoList.[1].getPriority && toDoList[0]
        //Reorder method
        Arrays.sort(toDoList);
        //Print list ordered
        System.out.println("Your To-Do list, in order of priority then complexity:");
        for (Task task : toDoList)
            System.out.println(task.getName() +" Priority:" + task.getPriority() +" Complexity:" + task.getComplexity());
    }
}
interface Priority {
    public void setPriority(int inputPriority);
    public int getPriority();
}
interface Complexity {
    public void setComplexity(int complexity);
    public int getComplexity();
}
class Task implements Priority, Complexity, Comparable<Task>{
    private String name;
    int priority;
    public String getName() {
        return name;
    }
    @Override
    public void setPriority(int inputPriority) {
        priority = inputPriority;
    }
    @Override
    public int getPriority() {
        return(priority);
    }
    @Override
    public void setComplexity(int complexity) {

    }
    @Override
    public int getComplexity() {
        return 0;
    }
    @Override
    public int compareTo(Task o) {
        if(this.getPriority() > o.getPriority()){
            return 1;
        } else if (this.getPriority() < o.getPriority()) {
            return -1;
        }
        else{
            return 0;
        }
    }
    public Task (String name){
        this.name= name;
    }
}
