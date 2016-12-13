package esir3.im.libs;

import java.util.List;

public interface LibTwI {
	
	/**
	 * Liste des tweets d'un user
	 * @param params 
	 * @return
	 */
	public String getUser(List<String> params);
	
	
	/**
	 * 
	 * @param params
	 * @return
	 */
	public float getPropPositif(List<String> params);
	
	/**
	 * @param params
	 * @return
	 */
	public float getPropNegatif(List<String> params);
	
	/**
	 * 
	 */
	public String getLocation(List<String> params);

}
