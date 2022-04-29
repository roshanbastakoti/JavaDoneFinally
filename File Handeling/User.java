public class User {
    String name;
    String address;

    //Getter method
    public User (String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    //Setter Method

    public void setName(String accountname) {
        this.name = accountname;

    }

    public void setAddress(int accountnumber) {
        this.address = address;
    }
    
}
