package EXCEPTIONS.PROGRAMS;

import java.util.*;
import java.sql.SQLException;

public class excpetion9 {
	public static void main(String[] args) throws Throwable {
		// ! EXCEPTION CHAINING - ONE EXCEPTION CAUSED DUE TO ANOTHER
		try {
			throw new ArithmeticException("divide by zero").initCause(new SQLException("caused due to SQL exception"));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}
}
