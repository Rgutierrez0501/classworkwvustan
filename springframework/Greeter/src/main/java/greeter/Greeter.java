package greeter;
/**
 *  Greets a visitor.
 * @author UD SYSTEMS
 *
 */
public interface Greeter {
	public void greet();
	public void setVisitor(Visitor v);
}
