package com.wolfshead.assignments.assig03;

public class Assignment3Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte numMonth = 5;
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		String theMonth;
		
		switch (numMonth) {
        case 1:  theMonth = months[1 - 1];
                 break;
        case 2:  theMonth = months[2 - 1];
                 break;
        case 3:  theMonth = months[3 - 1];
                 break;
        case 4:  theMonth = months[4 - 1];
                 break;
        case 5:  theMonth = months[5 - 1];
                 break;
        case 6:  theMonth = months[6 - 1];
                 break;
        case 7:  theMonth = months[7 - 1];
                 break;
        case 8:  theMonth = months[8 - 1];
                 break;
        case 9:  theMonth = months[9 - 1];
                 break;
        case 10: theMonth = months[10 - 1];
                 break;
        case 11: theMonth = months[11 - 1];
                 break;
        case 12: theMonth = months[12 - 1];
                 break;
        default: theMonth = "Invalid month";
                 break;
		}
		System.out.println(theMonth);

	}

}
