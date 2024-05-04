import Class.Employee;
package Class;


public class Admin //: Employee
{
    private boolean isAdmin;
    
    public boolean getIsAdmin() { return isAdmin; }
    
    public void setIsAdmin() { this.isAdmin = isAdmin; }
    
    public Admin()
    {
        
    }
    
    public Admin(boolean isAdmin)
    {
        this.isAdmin = isAdmin;
    }
    
    public boolean adminValidate(String username, String password)
    {
        return false;
    }
}
