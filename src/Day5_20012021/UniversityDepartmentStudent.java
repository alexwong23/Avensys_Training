package Day5_20012021;

import java.util.Random;

class Student1 {
	private int university;
	private int department;
	private int ID;
	private int marks;
	
	public Student1(int uni, int department, int ID, int marks) {
		this.university = uni;
		this.department = department;
		this.ID = ID;
		this.marks = marks;
	}
	
	public String toString() {
		StringBuilder str = new StringBuilder();
		str.append("Student from university ");
		str.append(this.university);
		str.append(", department ");
		str.append(this.department);
		str.append(", with ID ");
		str.append(this.ID);
		str.append(" has a mark of ");
		str.append(this.marks);
		return str.toString();
	}
	
}
public class UniversityDepartmentStudent {
		
	
	public static void main(String[] args) {
		
		System.out.println("============ FIRST QUESTION ============");
		
		Random rn = new Random();
		
		// two universities
		// both uni has three departments
		// three departments have 5 students
		Student1[][][] q1 = new Student1[2][3][5];
		for(int i = 0; i < q1.length; i++) { // iterates two times
			for(int j = 0; j < q1[i].length; j++) { // iterates three times
				for(int k = 0; k < q1[i][j].length; k++) { // iterates five times
					q1[i][j][k] = new Student1(i + 1, j + 1, k + 1, rn.nextInt((100 - 0) + 1) + 0);
					System.out.println(q1[i][j][k]);
				}
			}
		}
		
		System.out.println();
		System.out.println("============ SECOND QUESTION ============");
		
		Student1[][][] q2 = new Student1[3][][]; // three uni
		q2[0] = new Student1[3][];					// first uni, three departments
		q2[0][0] = new Student1[3];						// first uni, first department, three students
		q2[0][1] = new Student1[2];						// first uni, second department, two students
		q2[0][2] = new Student1[1];						// first uni, third department, one student
		q2[1] = new Student1[2][];					// second uni, two departments
		q2[1][0] = new Student1[3];						// second uni, first department, three students
		q2[1][1] = new Student1[2];						// second uni, second department, two students
		q2[2] = new Student1[1][];					// third uni, one department
		q2[2][0] = new Student1[3];						// third uni, first department, three students

		for(int i = 0; i < q2.length; i++) { // iterates three times
			for(int j = 0; j < q2[i].length; j++) {
				for(int k = 0; k < q2[i][j].length; k++) {
					q2[i][j][k] = new Student1(i + 1, j + 1, k + 1, rn.nextInt((100 - 0) + 1) + 0);
					System.out.println(q2[i][j][k]);
				}
			}
		}
		
	}
	
	
}
