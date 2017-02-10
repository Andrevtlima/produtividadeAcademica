package pessoa;

public class Pessoa {
	private String name;
	private int age;
	private String cpf;
	private String email;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Pessoa(String name, String cpf, String email) {
		super();
		this.name = name;

		this.cpf = cpf;
		this.email = email;
	}
	
 
}
