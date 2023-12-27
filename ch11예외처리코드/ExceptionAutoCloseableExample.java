package ch11예외처리코드;

public class ExceptionAutoCloseableExample {

	public static void main(String[] args) throws Exception {
		ExceptionAutoCloseable ea1 = null;
		
		try{
			ea1 = new ExceptionAutoCloseable("ea1");
			System.out.println(Integer.parseInt(ea1.read1()));
			System.out.println(Integer.parseInt(ea1.read2()));
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			ea1.close();			
		}
		
		
		try(ExceptionAutoCloseable ea2 = new ExceptionAutoCloseable("ea2")){
			System.out.println(Integer.parseInt(ea2.read1()));
			System.out.println(Integer.parseInt(ea2.read2()));
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
		ExceptionAutoCloseable ea3 = new ExceptionAutoCloseable("ea3");
		ExceptionAutoCloseable ea4 = new ExceptionAutoCloseable("ea4");
		try(ea3; ea4){
			String data1 = ea3.read1();
			String data2 = ea4.read2();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
