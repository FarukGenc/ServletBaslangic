package attiribute;

public class PersonPojo {

	String name,surname,pNumber;
	int yas ;
	
	public PersonPojo(String name,String surname,String pNumber,int yas){
		this.name = name ;
		this.surname = surname ;
		this.pNumber = pNumber ;
		this.yas = yas ;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getpNumber() {
		return pNumber;
	}

	public void setpNumber(String pNumber) {
		this.pNumber = pNumber;
	}

	public int getYas() {
		return yas;
	}

	public void setYas(int yas) {
		this.yas = yas;
	}
	
}
