package chapter5.program1;

public class Main {
	public static void main(String[] args) {
		// 1. BT会社を設立！
		BT btCompany = new BT();

		// 2. 人事担当者を作って面接をシミュレーションする
		// （本来はHumanResource経由ですが、まずは動作確認のために直接オブジェクトを作ってみます）
		HumanResource hr = new HumanResource("鈴木", "人事");

		System.out.println("--- 【1】採用面接のテスト ---");
		// 人事担当者が面接を行い、採用されたらBT会社の従業員リストに追加される！
		hr.conductInterview(btCompany, "高橋", "エンジニア", "Java", "採用");
		hr.conductInterview(btCompany, "佐藤", "営業", "", "採用");
		hr.conductInterview(btCompany, "田中", "エンジニア", "Python", "不採用"); // 不採用なので追加されない

		System.out.println("\n--- 【2】全従業員の情報表示テスト ---");
		// BT会社の全従業員の情報を表示する
		btCompany.showEmployeeInfo();

		System.out.println("\n--- 【3】各役職の個別アクションテスト ---");
		// 個別のクラス特有のメソッドも動かしてみる！
		Engineer eng = new Engineer("高橋", "エンジニア", "Java");
		eng.develop();

		Sales sal = new Sales("佐藤", "営業");
		sal.replyWeeklyReport();
		sal.meeting();
		sal.arrangeInterview(eng); // 営業がエンジニアの面談を組む連携！

		hr.calculateSalary(); // 人事の給与計算
	}
}
