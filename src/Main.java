public class Main {


    public static void main(String[] args) {
        Task[] toDoList = new Task[3];
        toDoList[0] = new Task("water my cat");
        toDoList[0].setComplexity(0);
        toDoList[0].setPriority(10);
        toDoList[1] = new Task("cook my clothes");
        toDoList[1].setPriority(5);
        toDoList[1].setComplexity(2);
        toDoList[2] = new Task("clean my soap");
        toDoList[2].setComplexity(10);
        toDoList[2].setPriority(4);

        //Simple print everything
//        for (Task task : toDoList)
//            System.out.println(task.getName() + " ");
        System.out.println("Your To-Do list, in order of priority then complexity:");
        toDoList[0].compareTo(toDoList[1]);

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
        if (this.priority.compareTo(o.getPriority()) != 0) {
            return this.getPriority().compareTo(o.getPriority());
        }
        else {
            return this.getPriority() - o.getPriority();
        }
    }
    public Task (String name){
        this.name= name;
    }
}
