/**
 * Created by Bhanu on 4/16/14.
 */
public enum ImportanceEnum {

    Irrelevant(0),

    LittleImportant(1),

    SomewhatImportant(10),

    VeryImportant(50),

    Mandatory(250);

    private int value;

    ImportanceEnum(int value)
    {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
