package kraemerfuchspruem;

public class Kuehlmittel {
	
private boolean kuehlmittelStatus = false;
	// false -> K�hlmittel aus; true -> K�hlmittel an
	
	public String toString()
	{
		String statusAusgabe;
		if (kuehlmittelStatus == false)
		{
		statusAusgabe = "aus";
		}
		else
		{
		statusAusgabe = "ein";	
		}
	return statusAusgabe;	
	}		
}
