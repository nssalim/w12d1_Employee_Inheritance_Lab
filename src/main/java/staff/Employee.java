package staff;

public abstract class Employee {

    private String name;
    private String niNumber;
    private double salary;

    public Employee(String name, String niNumber, double salary) {
        this.name = name;
        this.niNumber = niNumber;
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public String getNiNumber() {
        return this.niNumber;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public Boolean changeName(String newname){
        if (newname != null && newname != ""){
            this.name = newname;
            return true;
        }
        return false;
    }

    public void raiseSalary(double amount){
        if (amount >= 0) {
            this.salary += amount;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }



}
