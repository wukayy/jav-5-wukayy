package domain;

/**
 * Представляє художника в компанії.
 * Наслідує базовий клас Employee та містить список навичок працівника.
 */
public class Artist extends Employee {

    /**
     * Створює художника із заданими навичками та основною інформацією.
     *
     * @param skiils список навичок художника
     * @param name ім'я працівника
     * @param jobTitle посада працівника
     * @param level рівень працівника
     * @param dept відділ працівника
     */
    public Artist(String[] skiils, String name, String jobTitle, int level, String dept) {
        super(name, jobTitle, level, dept);
        this.skiils = skiils;
    }

    /**
     * Створює художника лише зі списком навичок.
     *
     * @param skiils список навичок художника
     */
    public Artist(String[] skiils) {
        super();
        this.skiils = skiils;
    }

    /**
     * Створює художника з порожнім списком навичок.
     */
    public Artist() {
        super();
        this.skiils = new String[10];
    }

    /**
     * Повертає текстове представлення об'єкта Artist.
     *
     * @return інформація про художника та його навички
     */
    @Override
    public String toString() {
        return super.toString()+"\nSkills: "+getSkills();
    }

    /**
     * Масив навичок художника.
     */
    private String[] skiils;

    /**
     * Повертає навички художника у вигляді рядка.
     *
     * @return рядок з переліком навичок
     */
    public String getSkills() {
        String s = "";
        for (String e : skiils) {
            s = s + e + ", ";
        }
        s=s.substring(0, s.length() - 2);
        return s;
    }

    /**
     * Встановлює список навичок художника.
     *
     * @param skills новий список навичок
     */
    public void setSkills(String[] skills) {
        this.skiils=skills;
    }

    /**
     * Повертає масив навичок художника.
     *
     * @return масив навичок
     */
    public String[] getSkillsLSist() {
        return skiils;
    }
}
