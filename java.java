public class person{
	public string string;
	public void setName(string a){
		string = a;
	}
}
public class personA extends person{
	public void PersonA(){
		
	}
}
public class personB extends person{
	public void PersonB(){
		
	}
}
public class test{
	public static void main(String[] args){
		personA a = new personA();
		personB b = new personB();
	}
}
