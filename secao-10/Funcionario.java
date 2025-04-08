public class Funcionario {
    public int id;
    public String name;
    private double salary;

    public Funcionario(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void raise(int percent){
        this.salary = salary + (salary * percent)/100;
    }

    public String toString(){
        return String.format("%d, %s, %.2f", this.id, this.name, this.salary);
    }
}
