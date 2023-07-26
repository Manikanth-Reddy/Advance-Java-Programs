package streamMethod;

import java.util.Objects;

public class Coustomer {
	private int id;
	private String name;
	private String email;

	public Coustomer(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public String getEmail() {
		return email;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Coustomer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(email, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coustomer other = (Coustomer) obj;
		return Objects.equals(email, other.email) && id == other.id && Objects.equals(name, other.name);
	}

}
