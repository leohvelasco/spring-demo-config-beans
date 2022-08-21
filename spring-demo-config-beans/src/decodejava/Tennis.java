package decodejava;

public class Tennis 
{

	OutdoorSport sport;
	String message;


	public void getMessage() 
	{
		System.out.println("Message is : " + message);
		sport.info();
	}

	
	//Setter method to set the message
	public void setMessage(String message) 
	{
		this.message = message;
	}
	
	
	//Setter method to set the OutdoorSport object
	public void setSport(OutdoorSport sport)
	{
		this.sport = sport;
	}
	
}