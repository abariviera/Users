package application.utils;

import org.springframework.util.StringUtils;

public class SQLUtils {

	public static String prepareLikeValue(String value) {
		if (StringUtils.isEmpty(value)) {
			return null;
		}
		
		String[] split = value.split(" ");
		value = '%' + split[0] + '%';
		for (int i = 1; i < split.length; i++) {
			value += split[i] + '%'; 
		}
		
		return value.toUpperCase();
	}
	
}
