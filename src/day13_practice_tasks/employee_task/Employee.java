package day13_practice_tasks.employee_task;

public class Employee extends Person{

    private String employeeId, jobTitle;
    private double salary;
    private String companyName;

    public Employee(String name, int age, String gender, String employeeId, String jobTitle, double salary, String companyName) {
        super(name, age, gender);
        setEmployeeId(employeeId);
        setJobTitle(jobTitle);
        setSalary(salary);
        setCompanyName(companyName);
    }


    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        if (employeeId == null || employeeId.isEmpty() || employeeId.isBlank()) {
            throw new RuntimeException("employeeID cannot be null, empty, or blank.");
        }
        this.employeeId = employeeId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        if (jobTitle == null || jobTitle.isEmpty() || jobTitle.isBlank()) {
            throw new RuntimeException("jobTitle cannot be null, empty, or blank.");
        }
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new RuntimeException("salary cannot be negative.");
        }
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void work() {
        System.out.println(jobTitle + " " + getName());
    }

    @Override
    public String toString() {
        return super.toString() + "{" +
                "employeeId='" + employeeId + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}