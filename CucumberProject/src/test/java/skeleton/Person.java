package skeleton;

public class Person 
{
	int distance;
	String message;

	public void setDistance(Integer int1)
	{
		this.distance=int1;
		
	}

	public void setMessage(String string) 
	{
		if(distance>0&&distance<20)
		this.message=string;
		else 
			this.message="cann't hear";
		
	}

	public String getMessage()
	{
		// TODO Auto-generated method stub
		return message;
	}

}
