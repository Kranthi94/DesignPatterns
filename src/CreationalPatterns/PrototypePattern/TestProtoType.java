package CreationalPatterns.PrototypePattern;

public class TestProtoType {

    public static void main(String[] args) throws CloneNotSupportedException {

        Employee employee = new Employee();

        employee.pushData("Kranthi");

        employee.pushData("Raj");

        employee.pushData("Kumar");

        Employee employee1 = employee.clone();

        employee1.removeData("Raj");

        Employee employee2 = employee.clone();

        employee2.pushData("Sam");

        System.out.println(employee.toString());

        System.out.println(employee1.toString());

        System.out.println(employee2.toString());
    }
}
