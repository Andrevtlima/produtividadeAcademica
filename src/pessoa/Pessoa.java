package pessoa;

public class Pessoa {
	private String name;
	private int age;
	private String cpf;
	private String email;
	protected String getEmail() {
		return email;
	}
	protected void setEmail(String email) {
		this.email = email;
	}
	protected String getName() {
		return name;
	}
	protected void setName(String name) {
		this.name = name;
	}
	protected int getAge() {
		return age;
	}
	protected void setAge(int age) {
		this.age = age;
	}
	protected String getCpf() {
		return cpf;
	}
	protected void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public Pessoa(String name, String cpf, String email) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.email = email;
	}
	
 
}
