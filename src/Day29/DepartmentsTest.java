package Day29;

import creating.D;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.OutputStream;

public class DepartmentsTest {
    public static void main(String[] args) {
        Department myEmp= new Department("AYSE",
                123,"QA",12000);
        System.out.println(myEmp.toString());
        Itdepartments myIt=new Itdepartments("MEHMET",
                126,"INTERN",12000,"JAVA");
        System.out.println(myIt.toString());
        myIt.addSkillSet("SQL");
        System.out.println(myIt.toString());
        AccountDepartment myAcc=new AccountDepartment("NAME",1234,
                "MANAGER",30000,4);
        System.out.println(myAcc.toString());


    }
}
