import java.util.Stack;


public class GenericStackTest{
	public void main(String args[]){
		GenericStack<String> gs = new GenericStack<>();
		//gs.push(""Hellog""); // compile time error
		gs.push("Hellog");
		gs.poll();
	}
}

class GenericStack<E> {
	Stack<E> stk = new Stack<>();
	
	public void push(E obj){
		stk.push(obj);
	}
	
	public E poll(){
		return stk.pop();
	}
	
}




