package Day29;

public class AccountDepartment extends Department{

    private int yearsOfExperience;

    public AccountDepartment(String empolyeeName, int employeeId, String position, int salary, int yearsOfExperience){

        super(empolyeeName,employeeId,position,salary);
        this.yearsOfExperience=yearsOfExperience;

    }public void setYearsOfExperience(int years){
        this.yearsOfExperience=years;

    }public int getYearsOfExperience() {
        return this.yearsOfExperience;

    } public int addYearsoOfExperience ( int years){
            return this.yearsOfExperience += years;

        }

    @Override
    public String toString() {
        return "AccountDepartment{" +
                "yearsOfExperience=" + yearsOfExperience +
                ", employeeName='" + employeeName + '\'' +
                ", empId=" + empId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}

