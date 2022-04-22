package java8features.functionalinterface;

//A fucntional interface can extends another interface only when it does not have any abstract method
@FunctionalInterface
public interface VisualizeInfo extends VisualInformation{
	public void visualInfo();
}
