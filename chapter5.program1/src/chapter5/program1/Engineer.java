package chapter5.program1;

public class Engineer extends Employee {
	String language;

	public Engineer(String name, String department, String language) {
		super(name, department);
		this.language = language;
	}

	public void develop() {
		System.out.println(language + "で開発を行った");
	}

	public void showInfo() {
		System.out.println(name + ":" + department + "使用言語：" + language);

	}
}
