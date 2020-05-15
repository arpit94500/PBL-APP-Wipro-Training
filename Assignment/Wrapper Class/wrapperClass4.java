class Employee implements Cloneable{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public Employee clone() {
        try {
            return (Employee) super.clone();
        } catch(CloneNotSupportedException e) {
            System.out.println("Cloning not allowed");
            return this;
        }
    }
}

public class wrapperClass4 {
    public static void main(String[] args) {
        Employee e = new Employee("Ashwath",21);
        Employee eClone = e.clone();

        eClone.setName("Akhil");
        eClone.setAge(22);

        System.out.println("Employee :"+e.getName()+" "+eClone.getAge());
        System.out.println("Employee Clone :"+eClone.getName()+" "+eClone.getAge());
    }
}