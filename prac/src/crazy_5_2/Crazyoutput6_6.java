package crazy_5_2;

public interface Crazyoutput6_6 {

	int MAX_CACHE_LINE = 50;
	
	void out();
	void getData(String msg);
	
	default void print(String... msgs) {
		for(String msg : msgs) {
			System.out.println(msg);
		}
	}
	
	default void test() {
		System.out.println("默认test方法");
	}
	
	static String staticTest() {
		return "接口里的类方法";
	}
	
}
