public class Kuehlmittel {
	
private boolean kuehlmittelstatus = 0;
	// 0-> K�hlmittel aus; 1-> K�hlmittel an
	
	public String toString()
	{
		String statusAusgabe;
		if (kuehlmittelstatus == 0)
		{
		statusAusgabe = "aus";
		}
		else
		{
		statusAusgabe = "ein";	
		}
		
	}		
}
