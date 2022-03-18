public class Main
{
	public static void main(String[] args) {
		System.out.println(count(3,3));
	
		path("",3,3);
		
	}
	
	static int count(int row,int column){
	    if(row==1 || column==1){
	        return 1;
	    }
	    else
	    {
	        int left = count(row-1,column);
	        int right=count(row,column-1);
	        int diagonal=0;
	        if(row>1&&column>1)
	        diagonal=count(row-1,column-1);
	        
	        return left+right+diagonal;
	    }
	}
	    
	  static void path(String p,int row,int column)
	    {
	        if(row==1 && column ==1)
	        {
	            System.out.println(p);
	           return;
	            
	            
	        }
	        else{
	            if(row>1)
	            {
	                path(p+'D',row-1,column);
	            }
	            if(column>1)
	            {
	                path(p+'R',row,column-1);
	            }
	            if(row>1&&column>1)
	            {
	                path(p+'V',row-1,column-1);
	            }
	        }
	    }
	}

OUTPUT:


13
DDRR
DRDR
DRRD
DRV
DVR
RDDR
RDRD
RDV
RRDD
RVD
VDR
VRD
VV
