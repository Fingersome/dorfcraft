package fingersome.dorfcraft.entity.capability;

	/**

	 * Default implementation of ITeam

	 */

public class Team implements ITeam {

	public int teamID = 0; 
	
		@Override
		public void setTeam(int team) {
			this.teamID = team;
		}

		@Override
		public int getTeam() {
			return teamID;
		}

		@Override
		public String getTeamName() {
		
			if(teamID == 0) {
				return "Ghost";
			}
			
			else if (teamID == 1) {
				return "Dorf";
			}
			
			else if (teamID == 2) {
				return "Zombie";
			}
			
			else {
				return "Team Error";
			}
		}

}