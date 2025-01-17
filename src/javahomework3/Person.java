package javahomework3;

public class Person {
    String firstName;
    String lastName;
    int age;
//*Method named getFirstName without any parameters, it needs to return the value of the firstName
//field.
    public String getFirstName() {
return firstName;
    }
//*Method named getLastName without any parameters, it needs to return the value of the lastName
//field.
    public String getLastName() {
        return lastName;
    }
    //*Method named getAge without any parameters, it needs to return the value of the age field.
    public int getAge() {
        return age;
    }
    //*Method named setFirstName with one parameter of type String, it needs to set the value of the
    //firstName field.
    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }
        //*Method named setLastName with one parameter of type String, it needs to set the value of the
        //lastName field.
    public void setLastName(String lastname) {
        this.lastName = lastname;
    }
    //*Method named setAge with one parameter of type int, it needs to set the value of the age field. If
    //the parameter is less than 0 or greater than 100, it needs to set the age field value to 0.
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            this.age = 0; // If age is out of range, set it to 0
        } else {
            this.age = age;
        }
    }
        //*Method named isTeen without any parameters, it needs to return true if the value of the age field is
        //greater than 12 and less than 20, otherwise, return false.
        public boolean isTeen() {
            if (age > 12 && age < 20) {
                return true;
            } else {
                return false;
            }
        }
        //*Method named getFullName without any parameters, it needs to return the full name of the person.
    public String getFullName() {
        // If both firstName and lastName are empty, return empty string
        if (firstName.isEmpty() && lastName.isEmpty()) {
            return "";
        }
        // If firstName is empty, return lastName
        if (firstName.isEmpty()) {
            return lastName;
        }
        // If lastName is empty, return firstName
        if (lastName.isEmpty()) {
            return firstName;
        }
        // If both firstName and lastName are not empty, return "firstName lastName"
        return firstName + " " + lastName;
    }



public static void main(String[] args) {

    Person person = new Person();
    person.setFirstName(""); // firstName is set to empty string
    person.setLastName(""); // lastName is set to empty string
    person.setAge(10);
    System.out.println("fullName= " + person.getFullName());
    System.out.println("teen= " + person.isTeen());
    person.setFirstName("John"); // firstName is set to John
    person.setAge(18);
    System.out.println("fullName= " + person.getFullName());
    System.out.println("teen= " + person.isTeen());
    person.setLastName("Smith"); // lastName is set to Smith
    System.out.println("fullName= " + person.getFullName());
}


}