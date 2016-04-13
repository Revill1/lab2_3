package edu.iis.mto.similarity;

import java.lang.reflect.Method;

import edu.iis.mto.search.SequenceSearcher;
import edu.iis.mto.search.SearchResult;

public class Search {

	public static SequenceSearcher getSequenceSearcher() {
		 		return new SequenceReturn();
		 	}
	
		 	public static int check(Object object, Method method) {
		 		try {
		 			return object.getClass().getDeclaredField(method.getName()).getInt(object);
		 		} catch (Exception e) {
		 			e.printStackTrace();
		 		}
		 		return -1;
		 	}

}
