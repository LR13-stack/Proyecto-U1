/*
Del personal se requiere registrar: 
código del empleado (es su número de DNI), 
nombre, 
apellidos, 
fecha de nacimiento y 
fecha de ingreso. 
También tienen un sueldo básico. 
Todos los empleados están afectos a un impuesto 
que corresponde al 8% de su sueldo.
 */
package entities;

/**
 *
 * @author luisr
 */
public class Employee {
    private int code;
    private String name;
    private String surname;
    private Date birth;
    private Date income;
    private float salary;

    public Employee(int code, String name, String surname, Date birth, Date income, float salary) {
        this.code = code;
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.income = income;
        this.salary = salary;
    }
    
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Date getIncome() {
        return income;
    }

    public void setIncome(Date income) {
        this.income = income;
    }

    public float getSalary() {
        return salary * 0.08f;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return "" + code;
    }
}
