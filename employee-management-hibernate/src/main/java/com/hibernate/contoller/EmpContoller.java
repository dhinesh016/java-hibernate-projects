package com.hibernate.contoller;

import java.util.Scanner;

import com.hibernate.dao.EmpDao;

public class EmpContoller {
	private static EmpDao dao=new EmpDao();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean op = true;
		while (op) {
			System.out.println(
					"Options \n 1)Insert the Data \n 2)Update The Data \n 3)Fetch The Data \n 4)Fetch By Id \n 5) Delete the data \n 6) Exit.. \n please enter your choice:)");
			int ch = sc.nextInt();
			switch (ch) {
			case 1: {
				 dao.insert();
			}
				break;
			case 2: {
				 dao.update();

			}
				break;
			case 3: {
				 dao.fetchById();

			}
				break;
			case 4: {
				 dao.fetchById();

			}
				break;
			case 5: {
				 dao.delete();

			}
				break;
			case 6: {
				op=!op;
                System.out.println("thank you..");
			}
				break;
			}

		}

	}
}
