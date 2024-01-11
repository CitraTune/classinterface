import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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
        ArrayList<Task> toDoList = new ArrayList<Task>();
        toDoList.add(new Task("water my cat"));
        toDoList.get(0).setPriority(1);
        toDoList.get(0).setComplexity(3);
        toDoList.add(new Task("cook my clothes"));
        toDoList.get(1).setPriority(1);
        toDoList.get(1).setComplexity(2);
        toDoList.add(new Task("clean my soap"));
        toDoList.get(2).setPriority(2);
        toDoList.get(2).setComplexity(4);

        //Reorder method
        Collections.sort(toDoList);
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
    int complexity;
    public String getName() {
        return name;
    }
    @Override
    public void setPriority(int priority) {
        this.priority = priority;
    }
    @Override
    public int getPriority() {
        return(priority);
    }
    @Override
    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }
    @Override
    public int getComplexity() {
        return (complexity);
    }
    @Override
    public int compareTo(Task o) {
        //Compare priority
        if(this.getPriority() > o.getPriority()){
            return 1;
        } else if (this.getPriority() < o.getPriority()) {
            return -1;
        }
        //Priority is equal, therefore compare via complexity
        else{
            if(this.getComplexity() > o.getComplexity()){
                return 1;
            } else if (this.getComplexity() < o.getComplexity()) {
                return -1;
            }
            else{
                return 0;
            }
        }
    }
    public Task (String name){
        this.name= name;
    }
}
