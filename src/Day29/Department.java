package Day29;

public class Department {
   protected String employeeName;
   protected int empId;
   protected String position;
   protected double salary;

    public Department(String employeeName, int empId, String position, double salary) {
        this.employeeName = employeeName;
        this.empId = empId;
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Department{" +
                "employeeName='" + employeeName + '\'' +
                ", empId=" + empId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }public void changePositon(String posnew){

        this.position=posnew;

    }public void riseSalary(double rise){

        this.salary=+rise;
    }
}
