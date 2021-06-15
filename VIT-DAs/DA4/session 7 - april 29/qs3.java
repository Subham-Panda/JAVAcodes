public class qs3 {
	public static void main(String[] args) throws Throwable {
		CourseRegistration c = new CourseRegistration();
		Thread thread1 = new Thread((Runnable)() -> {
			try {
				c.Register_seat();
			} catch (Throwable e) {
				System.out.println(e.getMessage());
			}
		});
		Thread thread2 = new Thread((Runnable)() -> {
			try {
				c.Register_seat();
			} catch (Throwable e) {
				System.out.println(e.getMessage());
			}
		});
		Thread thread3 = new Thread((Runnable)() -> {
			try {
				c.Allot_Seats(30);
			} catch (Throwable e) {
				System.out.println(e.getMessage());
			}
		});
		Thread thread4 = new Thread((Runnable)() -> {
			System.out.println("Total seats after all opeartions - "+c.NumberOfSeats);
		});
		thread1.start();
		thread2.start();
		thread3.start();
		thread1.join();
		thread2.join();
		thread3.join();
		thread4.start();
	}
}

class CourseRegistration {
	String CourseName;
	String FacultyName;
	int NumberOfSeats;

	CourseRegistration() {
		CourseName = "Java Programming";
		FacultyName = "Satish";
		NumberOfSeats = 0;
	}

	CourseRegistration(String CourseName, String FacultyName, int NumberOfSeats) {
		this.CourseName = CourseName;
		this.FacultyName = FacultyName;
		this.NumberOfSeats = NumberOfSeats;
	}

	public synchronized void Register_seat() throws Throwable {
		while (!(NumberOfSeats > 0)) {
			System.out.println("Thread " + Thread.currentThread().getId() + " is WAITING to Register one seat");
			wait();
		}
		System.out.println("Thread " + Thread.currentThread().getId() + " is REGISTERING one seat");
		NumberOfSeats--;
	}

	public synchronized void Allot_Seats(int Seats) throws Throwable {
		System.out.println("Thread " + Thread.currentThread().getId() + " is allocating " + Seats + " seats");
		NumberOfSeats = Seats;
		System.out.println("NOTIFYING ALL WAITING THREADS");
		notifyAll();
	}
}
