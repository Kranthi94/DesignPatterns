package CreationalPatterns.PrototypePattern;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee implements Cloneable{

    private ArrayList<String> empList;

    public Employee(){
        empList = new ArrayList<>();
    }

    public Employee(ArrayList<String> empList){
        this.empList = empList;
    }

    public void pushData(String name){
        empList.add(name);
    }

    public void removeData(String name){
        empList.remove(name);
    }

    public ArrayList<String> getEmpList(){
        return empList;
    }

    @Override
    protected Employee clone() throws CloneNotSupportedException {

        ArrayList<String> newEmpList = new ArrayList<>();

        newEmpList.addAll(this.empList);

        return new Employee(newEmpList);
    }

    public String toString(){
        return new String(Arrays.toString(getEmpList().toArray()));
    }
}
