package chapter5.program1;

import java.util.ArrayList;

public class BT {
	// 会社名（BT固定）
	private static final String COMPANY_NAME = "BT";

	// 従業員リスト
	private ArrayList<Employee> employeeList = new ArrayList<>();

	// 部署リスト
	private ArrayList<String> department = new ArrayList<>();

	// 従業員作成
	void createEmployee(String name, String department, String language) {
		if (department.equals("人事")) {
			HumanResource emp = new HumanResource(name, department);
			employeeList.add(emp);
		} else if (department.equals("営業")) {
			Sales emp = new Sales(name, department);
			employeeList.add(emp);
		} else if (department.equals("エンジニア")) {
			Engineer emp = new Engineer(name, department, language);
			employeeList.add(emp);
		}
	}

	// 従業員情報表示
	public void showEmployeeInfo(){
		for(Employee emp : employeeList) {
		emp.showInfo();
		}
	}
}