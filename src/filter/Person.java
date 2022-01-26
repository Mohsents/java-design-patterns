package filter;

public class Person {
    private String name;
    private String gender;
    private String materialStatus;

    public Person(String name, String gender, String materialStatus) {
        this.name = name;
        this.gender = gender;
        this.materialStatus = materialStatus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaterialStatus() {
        return materialStatus;
    }

    public void setMaterialStatus(String materialStatus) {
        this.materialStatus = materialStatus;
    }
}
