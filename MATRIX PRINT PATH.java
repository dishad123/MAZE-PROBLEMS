import java.util.*;
public class Main
{
	public static void main(String[] args) {
	
		boolean[][]board={
		    {true,true,true},
		    {true,true,true},
		    {true,true,true}
		};
		int [][]path=new int[board.length][board[0].length];
		
		pathRestrictions("",board,0,0,path,1);
		
	}
	
	        
	         static void pathRestrictions(String p,boolean[][] maze, int row,int column,int[][]path,int step)
	         {
	             if(row==maze.length-1 && column==maze[0].length-1){
	                 path[row][column]=step;
	                for(int []arr:path)
	                {
	                System.out.println(Arrays.toString(arr));
	                }
	                System.out.println(p);
	                System.out.println();
	                return;
	             }
	             if(maze[row][column]==false)
	             {
	                 return;
	             }
	             
	             
	             maze[row][column]=false;
	             path[row][column]=step;
	             if(row<maze.length-1)
	             {
	                 pathRestrictions(p+'D',maze,row+1,column,path,step+1);
	             }
	             
	             if(column<maze[0].length-1)
	             {
	                 pathRestrictions(p+'R',maze,row,column+1,path,step+1);
	             }
	             if(row>0)
	             {
	                 pathRestrictions(p+'U',maze,row-1,column,path,step+1);
	             }
	             if(column>0)
	             {
	                 pathRestrictions(p+'L',maze,row,column-1,path,step+1);
	             }
	             maze[row][column]=true;
	             path[row][column]=0;
	         }
	 
}       

OUTPUT:
[1, 0, 0]
[2, 0, 0]
[3, 4, 5]
DDRR

[1, 0, 0]
[2, 5, 6]
[3, 4, 7]
DDRURD

[1, 6, 7]
[2, 5, 8]
[3, 4, 9]
DDRUURDD

[1, 0, 0]
[2, 3, 0]
[0, 4, 5]
DRDR

[1, 0, 0]
[2, 3, 4]
[0, 0, 5]
DRRD

[1, 4, 5]
[2, 3, 6]
[0, 0, 7]
DRURDD

[1, 2, 0]
[0, 3, 0]
[0, 4, 5]
RDDR

[1, 2, 0]
[0, 3, 4]
[0, 0, 5]
RDRD

[1, 2, 0]
[4, 3, 0]
[5, 6, 7]
RDLDRR

[1, 2, 3]
[0, 0, 4]
[0, 0, 5]
RRDD

[1, 2, 3]
[0, 5, 4]
[0, 6, 7]
RRDLDR

[1, 2, 3]
[6, 5, 4]
[7, 8, 9]
RRDLLDRR


	        

	    
	
  
