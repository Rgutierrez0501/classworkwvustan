package javaarryasexample.arraysexample;

public class ArrayDemo {

	public static void main(String[] args) {
		String[][] names= {
				{"Mr","Mrs","Ms."},
				{"Smith","Jones"}
		};
		
		System.out.println(names[0][0] + names[1][1]);
		System.out.println(names[0][2] + names[1][0]);
		
		String [][] words = {
				{"Hi","Hello","Bye"},
				{"Everyone","Samuel","For now"},
				{"Ok","Good","Feeling Good"}
		};
		
		System.out.println(words[0][0] + words[1][1]);
		System.out.println(words[0][2] + words[1][0]);
		
		//Array marks is initialized
		int marks[][] = {{85,68,90},{56,67,78,5},{98,89,85},{84,85}};
		for(int i=0;i<4;i++) {
			for(int j=0;j<marks[i].length;j++) {
				System.out.println(marks[i][j]+ "  ");
			}
			
		}
		
	}

}
