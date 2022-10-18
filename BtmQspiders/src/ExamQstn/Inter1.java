package ExamQstn;

interface Inter1
{
	public void m11();
	public static void main(String[] args) {
		System.out.println("hiiiii");
		Inter i=new Inter() {

			@Override
			public void m11() {
			System.out.println("interface overridden");
				
			}};
			i.m11();
	}		
}