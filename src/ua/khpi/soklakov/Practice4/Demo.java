package ua.khpi.soklakov.Practice4;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

import ua.khpi.soklakov.Practice4.part1.Part1;
import ua.khpi.soklakov.Practice4.part2.Part2;
import ua.khpi.soklakov.Practice4.part3.Part3;
import ua.khpi.soklakov.Practice4.part4.Part4;
import ua.khpi.soklakov.Practice4.part5.Part5;

public class Demo {

	private static final InputStream STD_IN = System.in;
	private static final String ENCODING = "Cp1251";

	public static void main(String[] args) throws UnsupportedEncodingException {

		System.out.println("=========================== PART1");
		try {
			Part1.main(args);
		} catch (IOException e1) {
			System.out.println("Ex");
		}
		System.out.println("=========================== PART2");
		try {
			System.out.println(Part2.part2());
		} catch (IOException e) {
			System.out.println("IOEcxeption in maint");
		}
		System.out.println("=========================== PART3");
		System.setIn(new ByteArrayInputStream("char\nString\nint\ndouble\n".getBytes(ENCODING)));
		try {
			Part3.main(args);
		} catch (IOException e) {
			System.out.println("Ex");
		}
		System.setIn(STD_IN);
		System.out.println("=========================== PART4");
		try {
			Part4.main(args);
		} catch (IOException e) {
			System.out.println("Ex");
		}
		System.out.println("=========================== PART5");
		System.setIn(new ByteArrayInputStream("table ru\ntable en\napple ru\nstop".getBytes(ENCODING)));
		Part5.main(args);
	}

}
