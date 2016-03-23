package model.mapping;

import jamp.model.Passanger;
import model.dto.PassangerInfo;

public class PassangerInfoMapper {
	
	public static Passanger mappassangerInfo(PassangerInfo passangerInfo) {
		if (passangerInfo == null) {
			return null;
		}
		Passanger result = new Passanger();
		
		result.setName(passangerInfo.getName());
		result.setSureName(passangerInfo.getSureName());
		result.setPatronymic(passangerInfo.getPatronymic());
		result.setDateOfBirth(passangerInfo.getDateOfBirth());
		
		return result;		
	}

}
