package task;


	class employee{
		
		String firstname;
		String lastname;
		public employee(String firstname,String lastname) {
			
			super();
			this.firstname=firstname;
			this.lastname=lastname;
			
			
			
		}
		@Override
		public String toString() {
			return "employee [firstname=" + firstname + ", lastname=" + lastname + "]";
		}
		
		
		
		
	}

	public class Assignment2 {
		
		public static void main(String[] args) {
			
			employee emp=new employee("apoorva","mathapati");
			System.out.println(emp);
		}

	}

