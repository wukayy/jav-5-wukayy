package domain;

/**
 * Представляє менеджера компанії.
 * Наслідує клас Employee та містить список підлеглих працівників.
 */
public class Manager extends Employee {

    /**
     * Створює менеджера із заданим списком працівників та основною інформацією.
     *
     * @param employees список підлеглих працівників
     * @param name ім'я менеджера
     * @param jobTitle посада менеджера
     * @param level рівень менеджера
     * @param dept відділ менеджера
     */
    public Manager(Employee[] employees, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.employees = employees;
    }

    /**
     * Повертає текстове представлення менеджера.
     *
     * @return інформація про менеджера та його працівників
     */
    @Override
    public String toString() {
        return super.toString()+"\nEmployees: "+getEmployees();
    }

    /**
     * Створює менеджера із заданим списком працівників.
     *
     * @param employees список підлеглих працівників
     */
    public Manager(Employee[] employees) {
        super();
        this.employees = employees;
    }

    /**
     * Створює менеджера з порожнім списком працівників.
     */
    public Manager() {
        super();
        employees = new Employee[10];
    }

    /**
     * Масив підлеглих працівників.
     */
    private Employee[] employees;

    /**
     * Повертає список працівників у вигляді рядка.
     *
     * @return рядок з іменами працівників
     */
    public String getEmployees() {
        String s = "";
        for (Employee e : employees) {
            s = s + e.getName() + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює список працівників.
     *
     * @param employees новий список працівників
     */
    public void setEmployees(Employee[] employees) {
        this.employees=employees;
    }

    /**
     * Повертає масив працівників.
     *
     * @return масив працівників
     */
    public Employee[] getEmployeesList() {
        return employees;
    }


}
