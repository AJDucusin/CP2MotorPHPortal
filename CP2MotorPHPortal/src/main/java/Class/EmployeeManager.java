import java.util.ArrayList;
import java.util.List;
import Class.Employee;
package Class;

public class EmployeeManager
{
    private List<Employee> employees;
    
    public EmployeeManager()
    {
        this.employees = new ArrayList<>();
    }
    
    public void createEmployee(Employee employee)
    {
        employee.add(employee);
    }
    
    public void updateEmployee(Employee employee)
    {
        
    }
    
    public void deleteEmployee(int employeeID)
    {
        
    }
    
    public Employee findEmployee(int employeeID)
    {
        
    }
    
}
