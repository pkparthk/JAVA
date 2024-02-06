import java.util.*;
public class EmployeeSalary {
    public static void main(String[] args)
    {
        String name, id;
        double bSalary, DA, HRA, PF, IT, grossIncome, netIncome, deduction;
        double CCA = 250, PT = 100;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name employee");
        name = s.nextLine();
        System.out.println("Enter Employee id");
        id = s.nextLine();
        System.out.println("Enter the basic salary");
        bSalary = s.nextDouble();
        DA = (0.4)*bSalary; 
        HRA = (0.2)*bSalary; 
        PF = (0.1) * bSalary;
        grossIncome = bSalary + DA + HRA + CCA;
        IT = (0.1) * grossIncome;
        deduction = IT + PF + PT;
        netIncome = grossIncome - deduction;
        System.out.println("The Gross income of employee "+name+" with ID "+id+" is "+grossIncome); 
        System.out.println("The Net income of employee "+name+" with ID "+id+" is "+netIncome); 
        s.close();
    }
}
