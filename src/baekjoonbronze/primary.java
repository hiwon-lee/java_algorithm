package baekjoonbronze;
import java.io.*;
import java.util.*;

public class primary {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		      
	    int N = Integer.parseInt(br.readLine());
	    String ad = br.readLine();
	      
	    System.out.println(getMinAd(ad));
		      
	}
	
	public static int getMinAd(String adStr) {
		int maxP = 1;
		boolean patternFlag = true;
		
		while(patternFlag) {
			int i=0;
				if(adStr.charAt(maxP)!=adStr.charAt(i)) {
					maxP++;
				} else{ 
					loop1:
					for(int j=0; j<adStr.length()/maxP; j++) {
						int maxI = maxP*(j+1);
						for(int k=0; k<adStr.length(); k++) {
							if(adStr.charAt(j+k)==adStr.charAt(maxI+k)) { //°°À¸¸é
								if(maxI+k==adStr.length()-1) {
									patternFlag = false;
									break loop1;
								}
								continue;
								
							}else {
								maxP++;
								if(maxI+k==adStr.length()-1) {
									patternFlag = false;
								}
								break loop1;
								
							}
						}
					}
					
				}
				
			}
		
		return maxP;
		
	}
		

}
