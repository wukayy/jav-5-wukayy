package domain;

/**
 * Представляє працівника компанії.
 * Містить основну інформацію про співробітника.
 */
public class Employee {

    /**
     * Повертає текстове представлення працівника.
     *
     * @return інформація про працівника
     */
    @Override
    public String toString() {
        return "\nEmployee ID= " + ID + "\nName= " + name + "\nJobTitle= " + jobTitle + "\nLevel= " + level + "\nDept= " + dept;
    }

    /**
     * Ім'я працівника.
     */
    private String name;

    /**
     * Посада працівника.
     */
    private String jobTitle;

    /**
     * Унікальний ідентифікатор працівника.
     */
    private int ID;

    /**
     * Рівень працівника.
     */
    private int level;

    /**
     * Відділ працівника.
     */
    private String dept;

    // private static int employeesCount = 0;

    /**
     * Створює працівника із заданими параметрами.
     *
     * @param name ім'я працівника
     * @param jobTitle посада працівника
     * @param level рівень працівника
     * @param dept відділ працівника
     */
    public Employee(String name, String jobTitle, int level, String dept) {
        this();
        setName(name);
        this.jobTitle = jobTitle;
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
        this.dept = dept;
    }

    /**
     * Створює працівника та генерує випадковий ID.
     */
    public Employee() {
        ID = (int)(Math.random()*1000);
//        if (ID > 10000) {
//            throw new NumberFormatException("ERROR! Employee's ID cannot be greater than 10000. Employee is not created!");
//        }
    }

    /**
     * Встановлює посаду працівника.
     *
     * @param job назва посади
     */
    public void setJobTitle(String job) {
        jobTitle = job;
    }

    /**
     * Повертає посаду працівника.
     *
     * @return посада працівника
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Повертає ім'я працівника.
     *
     * @return ім'я працівника
     */
    public String getName() {
        return name;
    }

    /**
     * Встановлює рівень працівника.
     * Допустимі значення: 1, 2 або 3.
     *
     * @param level рівень працівника
     */
    public void setLevel(int level) {
        switch (level) {
            case 1:
            case 2:
            case 3:
                this.level = level;
                break;
            default:
                this.level = 1;
        }
    }

    /**
     * Повертає рівень працівника.
     *
     * @return рівень працівника
     */
    public int getLevel() {
        return level;
    }

    /**
     * Повертає відділ працівника.
     *
     * @return назва відділу
     */
    public String getDept() {
        return dept;
    }

    /**
     * Встановлює відділ працівника.
     *
     * @param dept назва відділу
     */
    public void setDept(String dept) {
        this.dept = dept;
    }

    /**
     * Встановлює ім'я працівника.
     * Якщо ім'я некоректне, встановлюється значення "John Doe".
     *
     * @param name ім'я працівника
     */
    public void setName(String name) {
//        boolean correctName = true;
//        for (int i = 0; i < name.length(); i++) {
//            char s = name.charAt(i);
//            if (Character.isDigit(s)) {
//                correctName = false;
//            }
//        }
//        if (correctName) {
//            this.name = name;
//        } else {
//            this.name = "John Doe";
//        }
        if (name.matches("^([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]*)+[ ]([a-zA-Z]+[\\'\\,\\.\\-]?[a-zA-Z ]+)+$")) {
            this.name = name;
        } else {
            this.name = "John Doe";
        }
    }
}
