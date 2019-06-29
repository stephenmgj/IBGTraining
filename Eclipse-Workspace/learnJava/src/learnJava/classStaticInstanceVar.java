package learnJava;

public class classStaticInstanceVar {
	public static String myClassVar="string for the static variable";
	// this is a static or class variable. It can be called anywhere
	String myInstanceVar="string for the instance";
	// this is an instance variable. It can be called anywhere
	// Note that it is just declared, not using public static
	
	public static void main(String[] args) {
	
		classStaticInstanceVar obj = new classStaticInstanceVar();
		//This label must match the public class statement
		classStaticInstanceVar obj2 = new classStaticInstanceVar();
		
		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		
		//changing the value of the static variable from inside the class
		obj2.myClassVar = "This is new";
		//any obj will change the value of myClassVar for all objs
		
		System.out.println(obj.myClassVar);
		System.out.println(obj2.myClassVar);
		
		classStaticInstanceVar obj3 = new classStaticInstanceVar();
		//This label must match the public class statement
		classStaticInstanceVar obj4 = new classStaticInstanceVar();
		
		System.out.println(obj3.myInstanceVar);
		System.out.println(obj4.myInstanceVar);
		
		//changing the value of the static variable from inside the class
		obj3.myInstanceVar = "This is instance changed";
		//any obj will change the value of myInstanceVar for only obj3
		//obj4 will only change when it gets directly changed
		
		System.out.println(obj3.myInstanceVar);
		System.out.println(obj4.myInstanceVar);
			
		
	}
}