package EndSem;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	int did;
	
	@Column(nullable = false, name = "DepartmentName")
	String dname;
	
	@Column(nullable = false, name = "DepartmentLocation")
	String dlocation;
	
	@Column(nullable = false, name = "DepartmentHOD")
	String HOD;
	
	

	public Department() {
	}

	public Department(int did, String dname, String dlocation, String hOD) {
		super();
		this.did = did;
		this.dname = dname;
		this.dlocation = dlocation;
		HOD = hOD;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDlocation() {
		return dlocation;
	}

	public void setDlocation(String dlocation) {
		this.dlocation = dlocation;
	}

	public String getHOD() {
		return HOD;
	}

	public void setHOD(String hOD) {
		HOD = hOD;
	}

	@Override
	public String toString() {
		return "Department [did=" + did + ", dname=" + dname + ", dlocation=" + dlocation + ", HOD=" + HOD + "]";
	}
	
	

}
