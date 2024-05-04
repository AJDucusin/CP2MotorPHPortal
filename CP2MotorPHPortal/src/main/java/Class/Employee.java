package Class;


public class Employee
{
    
    private int empId;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String position;
    
    
    public int getEmpId() { return empId; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public String getPosition() { return position; }
    
    public void setEmpId() { this.empId = empId; }
    public void setFirstName() { this.firstName = firstName; }
    public void setLastName() { this.lastName = lastName; }
    public void setUsername() { this.username = username; }
    public void setPassword() { this.password = password; }
    public void setPosition() { this.position = position; }
    
    public Employee()
    {
        
    }
    
    public Employee(int empId, String firstName, String lastName, String username, String password, String position)
    {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.password = password;
        this.position = position;
    }
    
    public boolean validateEmp(String username, String password)
    {
        return false;
    }
    
    
}
