package calculadora;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
/**
 * @author jorge lopez 221038
 *
 */
class PruebasJunit {

	@Test
	public class TestJunitStack extends ClaseStack{

	    static IStack emptystack = new IStack();
	    @Test(expected = EmptyStackException.class)
	    public void testPopEmptyStack() {
	        emptystack.pop();
	        //referencia de: https://stackoverflow.com/questions/23466162/junit-testing-stack-pop
	    }
	 public class StackVectorTest extends Vector{
	     @Test
	     public void shouldPushElementToTop() {
	         final StackVector<Integer> stackVector = new StackVector<Integer>();
	         stackVector.push(1);

	         assertEquals(Integer.valueOf(1), stackVector.peek());
	    } 
}