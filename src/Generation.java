
public class Generation 
{
	private int name;
	private long size;
	public boolean canTrain = false;
	public boolean canTrainOthers = false;
	
	public Generation(int name, long size, boolean canTrain, boolean canTrainOthers)
	{
		this.name = name;
		this.size = size;
		this.canTrain = false;
		this.canTrainOthers = false;
	}
	
	public  long getSize()
	{
		return this.size;
	}
	
	public  int getName()
	{
		return this.name;
	}
	
	public boolean getTrain()
	{
		return canTrain;
	}
	
	public boolean getTrainOthers()
	{
		return canTrainOthers;
	}
	
	
	public void setTrain()
	{
		canTrain  = true;
	}
	
	public void setTrainOthers()
	{
		canTrainOthers = true;
	}
}
