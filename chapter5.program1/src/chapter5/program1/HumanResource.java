package chapter5.program1;

public class HumanResource extends Employee {
	public HumanResource(String name, String department) {
		super(name, department);
	}
	// 	情報表示
	public void showInfo() {
		System.out.println("【人事部】 名前:" + name + ", 部署:" + department);
	}
	
	// 給与計算
	public void calculateSalary() {
		System.out.println("給与計算を行った");
	}
	
	// 社員面接
	public void conductInterview(BT bt, String name, String departmentName, String language, String result) {
		// 面接結果
		System.out.println("面接を行い、結果は" + result + "だった");
		// 採用の場合
		if (result.equals("採用")) {
			bt.createEmployee(name, departmentName, language);
		}
	}
}
