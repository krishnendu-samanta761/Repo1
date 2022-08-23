package com.day8;

	import java.io.IOException;
	import java.util.Scanner;

	public class Calculator {
		public static void main(String[] args) {
			try (Scanner x = new Scanner(System.in)) {
				System.out.println("Choose one from below options:");
				System.out.println("1. Addition"+"\n"+"2. Substraction"+"\n"+"3. Multiplication"+"\n"+"4. Division"+"\n"+"5. Exit"+"\n");
				System.out.print("Enter Here: ");
				String opt = x.nextLine();
				Switch sw = new Switch();
				sw.cal(opt);
			}
		}
	}
	class Switch{
		public void cal(String opt) {
			switch(opt) {
				case "1":
					Add add = new Add();
					abx(add);
					break;
				case "2":
					Sub sub = new Sub();
					abx(sub);
					break;
				case "3":
					Mul mul = new Mul();
					abx(mul);
					break;
				case "4":
					Div div = new Div();
					abx(div);
					break;
				case "5":
					System.exit(0);
					break;
				default:
					System.out.println("Invalid Input");
			}
			Calculator.main(null);
		}
		
		private void abx(Act a) {
			a.act();
		}
	}
	class Add implements Act{
		@Override
		public void act(){
			Scanner scn = new Scanner(System.in);
			System.out.println("How many numbers do you want to add?"+"\n"+"Enter here:");
			int n = scn.nextInt();
			int sum = 0;
			int[] num = new int[n];
			System.out.println("Enter the numbers and Hit Enter: ");
			for(int i=0; i<n; i++) {
				int c = scn.nextInt();
				num[i] = c;
				sum = sum + num[i];
			}
			System.out.println("Result of your addition is : "+sum);
			
		}
	}
	class Sub implements Act{
		@Override
		public void act() {
			Scanner scn = new Scanner(System.in);
			System.out.println("Number from which you want to substract: ");
			int sub1 = scn.nextInt();
			System.out.println("Number you want to substract: ");
			int sub2 = scn.nextInt();
			int res = sub1 - sub2;
			System.out.println("Result of your substraction is : "+res);
			
		}
	}
	class Mul implements Act{
		@Override
		public void act() {
			Scanner scn = new Scanner(System.in);
			System.out.println("How many numbers do you want to multiply?"+"\n"+"Enter here:");
			int n = scn.nextInt();
			int mul = 0;
			int[] num = new int[n];
			System.out.println("Enter the numbers and Hit Enter: ");
			for(int i=0; i<n; i++) {
				int c = scn.nextInt();
				num[i] = c;
				mul = mul * num[i];
			}
			System.out.println("Result of your multiplication is : "+mul);
			
		}
	}
	class Div implements Act{
		@Override
		public void act() {
			Scanner scn = new Scanner(System.in);
			System.out.println("Number you want to devide: ");
			int sub1 = scn.nextInt();
			System.out.println("Devidor: ");
			int sub2 = scn.nextInt();
			int res = sub1 / sub2;
			System.out.println("Result of your devision is : "+res);
		}
	}
	interface Act{
		void act();
	}

	// abstract class X {
//	 	void abc() {
//	 		System.out.println("In abc");
//	 	}
		
//		abstract void show();
	// }


