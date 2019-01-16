package session4;

public class Overloading {

	static void show() {
		System.out.println("This is show");
	}
	
	static void show(int num) {
		System.out.println("This is show" +num);
	}
	// Overload a static method by a non static method
	
	 void show(char ch) {
			System.out.println("This is show");
	 }
	 static void fun(char ch){
			System.out.println("This is a static fun");
		}
	 
	// Non Static
		
		void fun(){
			System.out.println("This is fun");
		}
		void fun(int num){
			System.out.println("This is fun "+num);
		}
		
		void fun(int num1, int num2){
			System.out.println("This is fun "+num1+" - "+num2);
		}
		
		/*int fun(int num){  -> Return Type has no role to play
			System.out.println("This is fun "+num);
			return num;
		}*/
		
		void fun(float num){
			System.out.println("This is fun "+num);
		}
		
		void fun(int num1, float num2){
			System.out.println("This is fun "+num1+" - "+num2);
		}
		
		void fun(float num1, int num2){
			System.out.println("This is fun "+num1+" - "+num2);
		}
		void registerUser(long phoneNum){
			
		}
		
		void registerUser(String email, String password){
			
		}
		
		void registerUser(String facebookId){
			
		}
		/*void registerUser(String googleId){
		
		}*/
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading oRef= new Overloading();
		oRef.fun();
		oRef.fun(10);
		oRef.fun(10,20);
		oRef.fun(10,2.2F);
		oRef.fun(2.2F);
		oRef.fun(3.3F,10);
		
		show();
		show(10);
		main(10);

	}
	
public static void main(int i) {
		
		Overloading oRef = new Overloading(); // Create an Object
		
		// Compiler is linking method call to the definition
		// Linking of method call to the definition is called Binding
		oRef.fun(); // Calling the method
		oRef.fun(10);
		oRef.fun(10,20);
		oRef.fun(10.1F);
		oRef.fun(10,2.2F);
		oRef.fun(2.2F,10);
		
		
		show();
		show(10);

	}


}
