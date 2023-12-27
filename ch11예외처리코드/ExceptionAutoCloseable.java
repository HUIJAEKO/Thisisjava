package ch11예외처리코드;

public class ExceptionAutoCloseable implements AutoCloseable{
	private String name;
	
	public ExceptionAutoCloseable(String name) {
		this.name = name;
		System.out.println("열기");
	}	
	public String read1() {
		System.out.println("읽기");
		return "100";
	}
	
	public String read2() {
		System.out.println("읽기");
		return "abc";
	}
	
	@Override
	public void close() throws Exception {
		System.out.println("닫기");		
	}
}
