package chapter5.program1;

public class Sales extends Employee {
	
	public Sales(String name, String department) {
		super(name, department);
	}
	public void replyWeeklyReport() {
		System.out.println("週報の返信をした");
	}
	
	public void arrangeInterview(Engineer engineer) {
		System.out.println(engineer.name + "の面談を組んだ");
	}
	
	public void meeting() {
		System.out.println("新規の打ち合わせをした");
	}
	
	public void showInfo() {
		System.out.println(name + ":" + department);
	}
}
