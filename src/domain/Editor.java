package domain;

/**
 * Представляє редактора в компанії.
 * Наслідує клас Artist та містить інформацію про тип редагування.
 */
public class Editor extends Artist {

    /**
     * Створює редактора з повною інформацією.
     *
     * @param electronicEditing тип редагування
     * @param skiils список навичок
     * @param name ім'я працівника
     * @param jobTitle посада працівника
     * @param level рівень працівника
     * @param dept відділ працівника
     */
    public Editor(boolean electronicEditing, String[] skiils, String name, String jobTitle, int level, String dept) {
        super(skiils, name, jobTitle, level, dept);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора із заданими навичками та параметрами редагування.
     *
     * @param electronicEditing тип редагування
     * @param skiils список навичок
     */
    public Editor(boolean electronicEditing, String[] skiils) {
        super(skiils);
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора із заданими параметрами редагування.
     *
     * @param electronicEditing тип редагування
     */
    public Editor(boolean electronicEditing) {
        super();
        this.electronicEditing = electronicEditing;
    }

    /**
     * Створює редактора з електронним редагуванням за замовчуванням.
     */
    public Editor() {
        super();
        this.electronicEditing = true;
    }

    /**
     * Повертає текстове представлення редактора.
     *
     * @return інформація про редактора
     */
    @Override
    public String toString() {
        String s=super.toString()+"\nEditing preferences= ";
        if (electronicEditing)
            s=s+"electronic";
        else
            s=s+"paper";
        return s;

    }

    /**
     * Ознака електронного редагування.
     */
    private boolean electronicEditing;

    /**
     * Повертає налаштування редагування.
     *
     * @return true, якщо використовується електронне редагування
     */
    public boolean getPreferences() {
        return electronicEditing;
    }

    /**
     * Встановлює тип редагування.
     *
     * @param electronic значення типу редагування
     */
    public void setPreferences(boolean electronic) {
        this.electronicEditing=electronic;
    }
}
