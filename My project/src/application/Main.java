package application;


public class Main {

	public static void main(String[] args) {
		Courses u = new Courses();
		u.studentscourses();
		String bn = u.studentcoursesdata.get(0).getlist().get(0);
   	    System.out.println(u.codesandnames(bn));
//		// TODO Auto-generated method stub
		/**
		 * Launch the application.
		 */
//			EventQueue.invokeLater(new Runnable() {
//				public void run() {
//					try {
//						GUI window = new GUI();
//						window.frame.setVisible(true);
//					} catch (Exception e) {
//						e.printStackTrace();
//					}
//				}
//			});
		GUI w1 = new GUI();
        w1.initialize();   
//	
//    	EventQueue.invokeLater(new Runnable() {
//		public void run() {
//			try {
//				Studentwindow2 window = new Studentwindow2();
//				window.frame2.setVisible(true);
//			} catch (Exception e) {
//				e.printStackTrace();
//			}
//		}
//	});
//	 
//	
        
	}
}
