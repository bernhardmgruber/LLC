package llc.loading;

import java.util.List;

/**
 * Represents a loaded Grid
 */
public class Grid {
	
	private String mapName;
	private List entities;
	private boolean changedIngame = false;
	
	public Grid(String mapName, List entities) {
		this.mapName = mapName;
		this.entities = entities;
	}
	
	/**
	 * Gets the list of entities in this world
	 * @return The entities, inside an ArrayList
	 */
	public List getEntities() {
		return entities;
	}
	/**
	 * Gets the map-name of this world.
	 * @return
	 */
	public String getMapName() {
		return mapName;
	}
	/**
	 * Gets if this savegame was changed in the game-session and should be saved
	 * @return true if it was changed
	 */
	public boolean wasChangedInGame() {
		return changedIngame;
	}
}