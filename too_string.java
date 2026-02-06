class too_string 
{
	String name="bhavik";
	int age=18;
	public String toString(){
		return this.name+" "+age;
	}
	public static void main(String[] args){
		too_string s=new too_string();
		System.out.println(s.toString());
	}
}