package JDBC_Concepts;

public class User {
	private String Last_Name;
	private int serial_number ;
	private int document_number ;
	private String also_know_as ;
	private String moto ;
	private String First_Name;
    public User(String First_Name, String Last_Name, Integer serial_number,String also_know_as,String moto)
    {
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.serial_number = serial_number;
        this.also_know_as=also_know_as;
        this.moto=moto;
     }
	public String getFirst_Name() {
		return First_Name;
	}
	public void setFirst_Name(String first_name) {
		First_Name = first_name;
	}
	public String getLast_Name() {
		return Last_Name;
	}
	public void setLast_Name(String last_Name) {
		Last_Name = last_Name;
	}
	public int getSerial_number() {
		return serial_number;
	}
	public void setSerial_number(int serial_number) {
		this.serial_number = serial_number;
	}
	public int getDocument_number() {
		return document_number;
	}
	public void setDocument_number(int document_number) {
		this.document_number = document_number;
	}
	public String getAlso_know_as() {
		return also_know_as;
	}
	public void setAlso_know_as(String also_know_as) {
		this.also_know_as = also_know_as;
	}
	public String getMoto() {
		return moto;
	}
	public void setMoto(String moto) {
		this.moto = moto;
	}
	public User() {
    }


}
