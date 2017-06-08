
// Before you commit and push write your student ID and finish time here.
// Finish time:
// Student ID:

public class PlanetExplorer {
	int gridX,gridY;
	int voziloX,voziloY;
	String strana;
	String strane[] = {"n", "e", "s", "w"};
	int intStrane = 0;
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use: For a 100x100 grid with two obstacles at coordinates (5,5) and (7,8)
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  
		 
	 */
		this.gridX = x;
		this.gridY = y;
		voziloX = 0;
		voziloY = 0;
		strana = "n";
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
	    //System.out.println(command);
		for(int i = 0; i < command.length(); i++){
			String c = command.substring(i, i+1);
			if(c.equals("f")){
				voziloY++;
				if(voziloY == gridY){
					voziloY = 0;
				}
			}else if (c.equals("b")){
				voziloY--;
				if(voziloY == -1){
					voziloY = gridY - 1;
				}
			}else if(c.equals("r")){
				intStrane++;
				intStrane = intStrane % 4;
			}else if (c.equals("l")){
				intStrane--;
				if(intStrane == - 1)
					intStrane = 3;
			}
		}
		
		return "(" + voziloX + "," + voziloY + "," + strane[intStrane] + ")";
	}

	public String getGridSize() {
		// TODO Auto-generated method stub
		return gridX + "x" + gridY;
	}

	public String getVoziloKoor() {
		// TODO Auto-generated method stub
		return "(" + voziloX + "," + voziloY + ")";
	}

	public String getVoziloStrana() {
		// TODO Auto-generated method stub
		return strana;
	}
}
