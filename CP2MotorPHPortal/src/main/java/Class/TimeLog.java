package Class;


public class TimeLog
{
    private int empId;
    private DateTime timeIn;
    private DateTime timeOut;
    
    
    public int getEmpId() { return empId; }
    public DateTime getTimeIn() { return timeIn; }
    public DateTime getTimeOur() { return timeOut; }
    
    public void setEmpId() { this.empId = empId; }
    public void setTimeIn() { this.timeIn = timeIn; }
    public void setTimeOut() { this.timeOut = timeOut; }
    
    public TimeLog()
    {
        
    }
    
    public TimeLog(int empId, DateTime timeIn, DateTime timeOut)
    {
        this.empId = empId;
        this.timeIn = timeIn;
        this.timeOut = timeOut;
    }
    
    public boolean validateEmp(int empId)
    {
        return false;
    }
}
