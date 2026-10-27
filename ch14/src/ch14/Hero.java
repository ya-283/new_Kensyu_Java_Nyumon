package ch14;
// code14_5 意図する文字列表現を返すtoString()を定義
public class Hero {
	String name;
	int hp;
	
public String toString() {
	return "名前：" + this.name + "/HP：" + this.hp;
}
}
