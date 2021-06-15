public class CNestedInnerNonStaticClasses {
	public static void main(String[] args) {
		faculty f1 = new faculty("Subham", "8596");

		// Faculty has single degree
		// faculty.degree degobj = f1.new degree("Btech", "2023", "VIT");
		// degobj.displayFacultyDetails();

		// Faculty memeber can have multiple degrees
		faculty.degree degobjs[] = new faculty.degree[3];
		degobjs[0] = f1.new degree("Btech", "2023", "VIT");
		degobjs[1] = f1.new degree("Mtech", "2025", "IIT");
		degobjs[2] = f1.new degree("MBA", "2027", "IIM");
		f1.displayFacultyDetails(degobjs);



		//Multilevel inner class objects
		// outer outobj = new outer();
		// outer.inner in1obj = outobj.new inner();
		// outer.inner.inner2 in2obj = in1obj.new inner2();

	}
}

class faculty {
	private String name;
	private String empid;
	
	public faculty(String name, String empid) {
		this.name = name;
		this.empid = empid;
	}

	public class degree {
		public String degreeName;
		public String awardedYear;
		public String awardedBy;

		public degree(String degreeName, String awardedYear, String awardedBy) {
			this.degreeName = degreeName;
			this.awardedBy = awardedBy;
			this.awardedYear = awardedYear;
		}

		public void display() {
			System.out.println(degreeName+" "+awardedYear+" "+awardedBy);
		}
	}
	
	public void displayFacultyDetails(degree d[]) {
		System.out.println("NAME: " + name);
		System.out.println("EMployee ID: " + empid);
		for(degree i:d){
			i.display();
		}
	}
}