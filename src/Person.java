public class Person {
    private String name;
    private String id;
    private int age;
    private String city;

    public Person(String name, String id, int age, String city) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}




/*
Person

- name: String
- id: String
- age: int
- city: String

+ getName(): String
+ setName(String name) : void
+ getId(): String
+ setId(String id): void
+ getAge(): int
+ setAge(int age): void
+ getCity(): String
+ setCity(String city): void

Patient

- nodule: Nodule
- alert: String
- treatment: String

+ Patient(String name, String id, int age, String city, String composition, String echogenicity, String form, String margin, boolean echogenicFoci1, boolean echogenicFoci2, boolean echogenicFoci3, boolean echogenicFoci4, float size)
+ getNodule(): Nodule
+ getAlert(): String
+ getTreatment(): String
+ getPatient(String id): static Patient
+ getAllPatients(): static ArrayList<Patient> 
+ deletePacient(String id): static void
+ savePatient(String name, String id, int age, String city, String composition, String echogenicity, String form, String margin, boolean echogenicFoci1, boolean echogenicFoci2, boolean echogenicFoci3, boolean echogenicFoci4, float size): static void
+ editPatient(String searchID, String name, String id, int age, String city, String composition, String echogenicity, String form, String margin, boolean echogenicFoci1, boolean echogenicFoci2, boolean echogenicFoci3, boolean echogenicFoci4, float size): static void

Nodule

- composition: String
- echogenicity: String
- form: String
- margin: String
- echogenicFoci1: boolean
- echogenicFoci2: boolean
- echogenicFoci3: boolean
- echogenicFoci4: boolean
- size: float
- score: int
- alert: String
- treatment: String

+ Nodule(String composition, String echogenicity, String form, String margin, boolean echogenicFoci1, boolean echogenicFoci2, boolean echogenicFoci3, boolean echogenicFoci4, float size)
+ getComposition(): String
+ setComposition(String composition): void
+ getEchogenicity(): String
+ setEchogenicity(String echogenicity): void
+ getForm(): String
+ setForm(String form): void
+ getMargin(): String
+ setMargin(String margin): void
+ getEchogenicFoci1(): boolean
+ setEchogenicFoci1(boolean echogenicFoci1): void
+ getEchogenicFoci2(): boolean
+ setEchogenicFoci2(boolean echogenicFoci2): void
+ getEchogenicFoci3():boolean 
+ setEchogenicFoci3(boolean echogenicFoci3): void 
+ getEchogenicFoci4(): boolean 
+ setEchogenicFoci4(boolean echogenicFoci4): void 
+ getSize(): float 
+ setSize(float size): void 
+ getAlert(): String 
+ getTreatment(): String 
- computeComposition(): int
- computeEchogenicity(): int
- computeForm(): int
- computeMargin(): int
- computeEchogenicFoci(): int
+ computeAlert(): String
+ computeTreatment(): String


*/