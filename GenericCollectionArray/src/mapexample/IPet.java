package mapexample;

public interface IPet {

	public abstract String getName();

	public abstract void setName(String name);

	public abstract long getYear();

	public abstract void setYear(long year);

	public abstract int compareTo(IPet pc);

}