package Day29;

public class Itdepartments extends Department {

    private String skillSet;

    public Itdepartments(String employeeName, int empId, String position,
                         double salary, String skillSet) {

        super(employeeName, empId, position, salary);
        this.skillSet = skillSet;
    }

    public void setSkillSet(String skillSet) {
        this.skillSet = skillSet;
    }

    public String getSkillSet() {
        return this.skillSet = skillSet;


    }

    public void addSkillSet(String skillSet){

        this.skillSet=skillSet;
}

    @Override
    public String toString() {
        return "Itdepartments{" +
                "skillSet='" + skillSet + '\'' +
                ", employeeName='" + employeeName + '\'' +
                ", empId=" + empId +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}
